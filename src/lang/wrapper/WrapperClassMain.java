package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정 , 대신에 valueOf를 사용
        Integer integer = 10; // -128 ~ 127 자주 사용하는 숫자 값 재사용 , 불변
        
        Long l = 10L;
        Double v = 20.0;
        
        
        // 내부 값 읽기
        int i = integer.intValue();
        
        
        
    }
}
