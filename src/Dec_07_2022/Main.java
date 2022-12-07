package Dec_07_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Addition Program");
        System.out.println("Enter Two Numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculator c = new Calculator();
        int sum=c.add(a,b);
        System.out.println(sum);
    }
}
