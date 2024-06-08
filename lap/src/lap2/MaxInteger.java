package lap2;

public class MaxInteger {
    public static void FindMaxInteger(){
        InputFunction intNumber = new InputFunction();
        System.out.print("nhap so dau tien : ");
        int a = intNumber.InputInt();
        System.out.print("nhap so thu hai : ");
        int b = intNumber.InputInt();
        System.out.print("nhap so thu ba : ");
        int c = intNumber.InputInt();
        int max;
        if (a > b){
            if (a > c) {
                max = a;
            }
            else{
                max = c;
            }
        }
        else{
            if (b > c) {
                max = b;
            }
            else{
                max = c;
            }
        }
        System.out.printf("so lon nhat la : %d",max);
    }
}
