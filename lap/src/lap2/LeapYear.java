package lap2;

public class LeapYear {
    public static void  CheckLeapYear(){
        InputFunction n = new InputFunction();
        int year = n.InputInt();
        System.out.printf(" ban da nhap %d ",year);
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("la nam nhuan");
        }
        else{
            System.out.println("khong phai la nam nhuan");
        }
        
    }
}
