package Dec_07_2022;

public class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    int sub(int a, int b) {
        int c = a - b;
        return c;
    }

    int mul(int a, int b) {
        int c = a * b;
        return c;
    }

    int divide(int a, int b) {
        int c = a / b;
        return c;
    }
}
