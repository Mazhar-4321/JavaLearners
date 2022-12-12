package Dec_10_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] hobbiesArray = {"Coding", "Playing Chess"};
        Main main = new Main();
        System.out.println( main.getMessage(hobbiesArray));
//        while (true) {
//            System.out.println("Enter a String");
//            regularExpression(new Scanner(System.in).next());
//        }
    }

    private static void regularExpression(String s) {
        /*
        E.g. abc.xyz@bl.co.in
        E.g. abc.xyz@bl.co.in -
        Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with
precise @ and . positions
         */
        String p =s;
        String pattern="^(abc[0-9._+-]*(\\.[a-z]{2,})?@([a-z]{2,}|[0-9]{1})\\.[a-z]{2,}(\\.[a-z]{2,})?)$";
        //System.out.println(p.matches("((?=.*[0-9])(?=.*[A-Z])(?=.{8,}$).*)(^([a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*)$)"));
        System.out.println(p.matches(pattern));
        //a*ba*
        //UC1,UC2
        //^[A-Z][a-zA-Z0-9[^a-zA-Z0-9]]{2,}
        //UC3
        //^([a-z]{3}(\.xyz)?@bl\.co(.in)?)$
        //UC4
        //^(91 [1-9][0-9]{9})$
        //UC5
        //^([a-zA-Z0-9^[a-zA-Z0-9]]{8,})$
        //UC6
        //(?=.*[A-Z])(^([a-zA-Z0-9^[a-zA-Z0-9]]{8,})$)
        //UC7
        //"((?=.*[0-9])(?=.*[A-Z])(?=.{8,}$).*)(^([a-zA-Z0-9]*#[a-zA-Z0-9]*)$)"
        //p = p.replaceAll("((?=.*[0-9])(?=.*[A-Z])(?=.{8,}$).*)(^([a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*)$)", "19:21");
        //System.out.println(p);
        //Object o;
    }

    private String getMessage(String[] hobbies) {
        if (hobbies == null) {
            return "Sorry Invalid Input";
        }
        if (hobbies.length == 1) {
            return "My Hobby is " + hobbies[0];
        }
        String message = "My Hobbies are ";
        for (int i = 0; i < hobbies.length - 1; i++) {
            if (i == hobbies.length - 2) {
                message += hobbies[i] + " ";
                break;
            }
            message += hobbies[i] + ", ";
        }
        message += "and " + hobbies[hobbies.length - 1] + ".";
        return message;

    }
}
