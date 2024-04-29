package exception.ex1;


public class NetworkServiceV1_3 {
    
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);
        
        String connectResult = client.connect();
        // disconnect 를 호출할수 있도록 if문을 수정
        if (isError(connectResult)) {
            System.out.println("네트워크 오류 발생 오류코드 : " + connectResult);
        }else {
            String sendResult = client.send(data);
            
            if (isError(sendResult)) {
                System.out.println("네트워크 오류 발생 오류코드 : " + sendResult);
            }
        }
        client.disconnect();
    }
    
    private boolean isError(String connectResult) {
        return !"success".equals(connectResult);
    }
}
