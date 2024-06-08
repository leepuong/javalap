package lap1;
public class Car {
    public static void main(String[] args) {
        library car1 = new library();
        car1.speed = 0;
        System.out.println(car1.speed);
        int times1 = car1.upTo20();
        System.out.println(times1);
        int times2 = car1.upTo40();
        System.out.println(times2);
        int times3 = car1.upTo60();
        System.out.println(times3);
        int times4 = car1.downTo60();
        System.out.println(times4);
        int times5 = car1.downTo20();
        System.out.println(times5);
        
    }
}
