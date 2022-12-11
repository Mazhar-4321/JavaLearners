package package04Dec2022;
import Dec_07_2022.*;
public class Main {
    public static void main(String[] args) {
        declareStringExample();
        checkLengthOfStringExample();
        checkToLowerCaseExample();
        checkTrimExample();
        checkSubstringExample();
        checkCharAtExample();
        checkCalculatorExample();
    }

    static void checkCalculatorExample() {
        Calculator c = new Calculator();
        float sum=c.add(1,2);
        System.out.println("answer="+sum);
    }

    static void checkCharAtExample() {
        String name = "Ismail";
        System.out.println("3rd Character in Ismail is : " + name.charAt(3));
    }

    static void checkSubstringExample() {
        String name = "Hi My name is Allen And This is The Sample Of My Voice";//012345
        System.out.println("String content from 1 to 4: " + name.substring(1, 5));

    }

    static void checkTrimExample() {
        String name = "            Afridi         ";
        System.out.println("String content Before trim: " + name);
        System.out.println("String content After trim: " + name.trim());
    }

    static void checkToLowerCaseExample() {
        String name = "Afridi";
        System.out.println("Before lower case: " + name);
        System.out.println("After lower case: " + name.toLowerCase());
    }

    static void checkLengthOfStringExample() {
        String name = "Afridi";
        System.out.println("length: " + name.length());
    }

    static void declareStringExample() {
        String name = "Afridi";
        System.out.println("String content: " + name);
    }
}
