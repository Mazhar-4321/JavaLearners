package Dec_07_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator Program");
        System.out.println("Enter Two Numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Press 1 to Add , 2 to Subtract , 3 to Divide , 4 to Multiply");
        int option=sc.nextInt();
        if(option==1){
            Calculator c = new Calculator();
            int sum=c.add(a,b);
            System.out.println("Sum="+sum);
        }
        if(option==2){
            Calculator c = new Calculator();
            int subtract=c.sub(a,b);
            System.out.println("Subtract="+subtract);
        }
        if(option==3){
            Calculator c = new Calculator();
            int div=c.divide(a,b);
            System.out.println("Divide="+div);
        }
        if(option==4){
            Calculator c = new Calculator();
            int mul=c.mul(a,b);
            System.out.println("Multiply="+mul);
        }

    }
}
