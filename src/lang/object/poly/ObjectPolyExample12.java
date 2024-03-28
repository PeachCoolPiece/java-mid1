package lang.object.poly;

public class ObjectPolyExample12 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // object 도 인스턴스를 만들수 있음
        
        Object[] objects = {dog, car, object};
        
        
        size(objects);
        
    }
    
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }
}
