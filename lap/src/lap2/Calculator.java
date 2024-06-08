package lap2;

public class Calculator {
    public static void CalculatorInteger(){
        InputFunction phepting = new InputFunction();
        String operation;
        int c = 0;
        do{
            System.out.printf("nhap phep tinh '?', ?, ?   <== ");
            operation = phepting.InputSr();
            c = 0;
            switch (operation) {
                case "+":{
                    c = 8;
                    break;
                }
                case "-":{
                    c = 7;
                    break;
                }
                case "*":{
                    c = 6;
                    break;
                }
                case "/":{
                    c = 5;
                    break;
                }
                default:{
                    c = 1;
                    break;
                }
            }
        } 
        while(c == 1);
            
        System.out.printf("nhap phep tinh '%s', ?, ?   <== ",operation);
        int number1 = phepting.InputInt();
        System.out.printf("nhap phep tinh '%s', %d, ?   <== ",operation,number1);
        int number2 = phepting.InputInt();
        System.out.printf("nhap phep tinh '%s', %d, %d   <== \n",operation,number1,number2);
        if (c == 8){
            System.out.printf("ket qua la %d + %d = %d",number1,number2,number1+number2);
        }
        else if(c == 7){
            System.out.printf("ket qua la %d - %d = %d",number1,number2,number1-number2);
        }
        else if(c == 5){
            if (number1 == 0 || number2 == 0) {
                System.out.println("phep tinh loi");
            }
            else{
                System.out.printf("ket qua la %d / %d = %d",number1,number2,number1/number2);

            }
        }
        else {
            System.out.printf("ket qua la %d * %d = %d",number1,number2,number1*number2);

        }
        
    }
}
