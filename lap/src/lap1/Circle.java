package lap1;
public class Circle {
    public static void main(String[] args) {
        System.out.println("hello tính diện tích và chu vi hình tròn nhe ??>?>");
        library Circle1 = new library();
        
        Circle1.rad = 6;
        double dientich1 = Circle1.Area();
        double chuvi1= Circle1.Perimeter();
        System.out.printf("%ndien tích hình tròn rad = %.0f là %.1f",Circle1.rad,dientich1);
        System.out.printf("%nchu vi hính tròn có rad = %.0f là %.1f",Circle1.rad,chuvi1);
        
    }
}
