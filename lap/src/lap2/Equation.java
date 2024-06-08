package lap2;

public class Equation {
    public static void CalculateQuadratic(int a, int b, int c){
        if (a == 0) {
            
            if (b == 0 && c != 0){
                System.out.println("\nPt vo no");
            }
            else if (b == 0 && c == 0) {
                System.out.println("\nPt vo so no");
                
            }
            else {
                double x = -c/b;
                System.out.println("\nPt co 1 no x = "+ x);
            }
        }
        else{

            double delta = b*b -4*a*c;
            if (delta>0){
                System.out.print("\nPt cos 2 no ");
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("x1 = %.1f va x2 = %.1f",x1, x2);
            }
            else if (delta == 0){
                System.out.println("pt co 1 no kep");
                double x = -b/(2*a);
                System.out.println("x" + x);
            }
            else {
                System.out.println("pt vo no");
            }
        }
    }
}

