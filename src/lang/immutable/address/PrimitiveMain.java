package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        
        // 기본형은 절대로 같은 값을 공유 하지 않는다.
        int a = 10;
        int b = a; // a -> b , 값 복사후 대입
        
        b = 20;
        
        
        
    }
}
