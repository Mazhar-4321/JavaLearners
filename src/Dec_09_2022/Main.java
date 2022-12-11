package Dec_09_2022;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to print Day");
        int n = sc.nextInt();
        String ans = d.giveDay(n);
        System.out.println(ans);

    }
}
