package lap3;

import java.io.Console;
import java.util.Scanner;

public class Calculator {
    int sum = 0;
    public int calculateSum(){
        String a;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("nhap so bat kia ");
            int n = scanner.nextInt();
            System.out.println("nhap n der ket thuc chuong trinh : ");
            a = scanner.next();
            sum = sum + n;
        }while(!a.equals("n"));
        return sum;
    }
    public int calculateSumofProduct(int n){
        int k;  
        int i;
        System.out.print("bieu thuc co dang :: ");
        for (i = 1; i <= n; i++){
            for(k = 1; k < i; k++){
                System.out.print(k +"*");
                sum = sum + i;
            }System.out.print(k);

            if (k < n) {
                System.out.print(" + ");
            }
            
        }
        return sum;
    }
    public void printPrimeFactors(int n){
        
        int i;
        int coust;
        System.out.printf("cac thua so ng to cua %d la : ",n);
        while(n != 1)
        {
            for (i = n; i >= 2; i--)
            {
                coust = 0;
                for (int k = 2; k < i; k++)
                {
                    if (i % k == 0)
                    {
                        coust += 1;
                    }
                }
                if (coust == 0)
                {
                    if (n % i == 0)
                    {
                        System.out.print(i + " ");
                        n = n / i;
                    }
                }
            }
        } 
        

    }
        
        




}
