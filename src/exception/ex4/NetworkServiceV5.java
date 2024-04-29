package exception.ex4;


public class NetworkServiceV5 {
    
    public void sendMessage(String data) {
        String address = "http://example.com";
   
    
        // 해당 예외들을 복구 할수없다. 따라서 해당 예외들을 생각하지 않는것이 더 나은 선택일수있다.
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
            
        } catch (Exception e) {
            System.out.println("예외 확인 = " + e.getMessage());
            throw e;
        }
        
    }
}
