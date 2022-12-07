package Dec_07_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator Program");
        System.out.println("Enter Two Numbers");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Press 1 to Add , 2 to Subtract , 3 to Divide , 4 to Multiply");
        int option=sc.nextInt();
        if(option==1){
            Calculator c = new Calculator();
            float sum=c.add(a,b);
            System.out.println("Sum="+sum);
        }
        if(option==2){
            Calculator c = new Calculator();
            float subtract=c.sub(a,b);
            System.out.println("Subtract="+subtract);
        }
        if(option==3){
            Calculator c = new Calculator();
            float div=c.divide(a,b);
            System.out.println("Divide="+div);
        }
        if(option==4){
            Calculator c = new Calculator();
            float mul=c.mul(a,b);
            System.out.println("Multiply="+mul);
        }

    }
}
