package lap02;

import java.util.Scanner;


public class Check {
    public static void checkpass() {

        double mark1 = EnterMark();
        double mark2 = EnterMark();
        double mark3 = EnterMark();

        // double point = 7.5;
        // if(n <=10 && n > 8.5){
        //     System.out.println("dung con trai cua ta");
        // }
        // else if( n <= 8.5 && n > 5){
        //     System.out.println(" thang nay kha");
        // }
        // else {System.out.println("chet don");}

    }
    
    public static double EnterMark(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem: ");
        double n = scanner.nextDouble();
        return n;
    }

}

