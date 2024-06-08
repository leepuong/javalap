package lap1;
public class Person {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!\nHis name is phuong");
        library phuong = new library();
        phuong.year = 2005;
        System.out.println(phuong.year);
        
        int age = phuong.PredictAge();
        System.out.printf("his %d year old",age);
    }
}
