package lap2;

import java.util.Scanner;

public class InputFunction {
    public static int InputInt(){
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        return inp;
    }
    public static String InputSr(){
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.next();
        return inp;

        
    }
}
