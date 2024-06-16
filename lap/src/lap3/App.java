package lap3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Calculator caluc1 = new Calculator();
        // System.out.println("tong la "+caluc1.calculateSum());

        // System.out.println("\ntong la "+caluc1.calculateSumofProduct(n));
        caluc1.printPrimeFactors(n);
    }
}
