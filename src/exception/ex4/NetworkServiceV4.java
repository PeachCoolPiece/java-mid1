package exception.ex4;


public class NetworkServiceV4 {
    
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);
        // 해당 예외들을 복구 할수없다. 따라서 해당 예외들을 생각하지 않는것이 더 나은 선택일수있다.
        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
        
    }
}
