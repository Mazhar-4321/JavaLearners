package package30Nov22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        variableTest();
        datatypesTest();
        conditionalStatementsTest();
        loopingStatementsTest();
    }

    static void variableTest() {
        int a = 1;// here int is datatype and a is variable name
        float b = 2;
        char c = 3;
        boolean d = false;
        String e = "papa";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    static void datatypesTest() {
        // already explained in variable test

    }

    static void conditionalStatementsTest() {
        // first make condition then write if else statement
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean condition = (num % 2 == 0); // 6%2=0   0==0
        if (condition) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        int num1 = sc.nextInt();//1
        condition = (num1 == 1);//1==1
        if (condition) {
            System.out.println("Sunday");
        } else {
            condition = (num1 == 2);
            if (condition) {
                System.out.println("Monday");
            } else {
                condition = (num1 == 3);
                if (condition) {
                    System.out.println("Tuesday");
                } else {
                    condition = (num1 == 4);
                    if (condition) {
                        System.out.println("Wednesday");
                    } else {
                        condition = (num1 == 5);
                        if (condition) {
                            System.out.println("Thursady");
                        } else {
                            condition = (num1 == 6);
                            if (condition) {
                                System.out.println("Friday");
                            } else {
                                condition = (num1 == 7);
                                if (condition) {
                                    System.out.println("Saturday");
                                } else {
                                    System.out.println("Invalid");
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    static void loopingStatementsTest() {
        // first make condition and decide forward or reverse
        // if forward then loop variable must increment or increase
        // if reverse then loop variable must decrement or decrease
        int loopVariable = 1;
        while (loopVariable <= 10) {
            System.out.println(loopVariable);
            loopVariable = loopVariable + 1;
        }
    }
}
