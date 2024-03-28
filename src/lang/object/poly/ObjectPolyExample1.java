package lang.object.poly;

public class ObjectPolyExample1 {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        
        
        
        action(dog);
        action(car);
        
    }
    
    private static void action(Object obj) {
        
        // 객체에 맞는 다운 캐스팅 필요
        if (obj instanceof Dog) {
            ((Dog) obj).sound();
        } else if (obj instanceof Car) {
            ((Car) obj).move();
        }
    }
}
