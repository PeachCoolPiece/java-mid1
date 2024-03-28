package lang.object.poly.tostring;

public class ObjectPrinter {
    public static void main(String[] args) {
        
        Dog dog = new Dog("강아지", 10);
        System.out.println(dog);
        
        System.identityHashCode(dog);
    }
}
