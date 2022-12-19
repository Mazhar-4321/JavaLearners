package Dec_19_22;

public class Main {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        int noOfMOnths = myCalendar.getMeDaysInAMonth("January");
        System.out.println(noOfMOnths);
        myCalendar.noInputNoOutput();
        myCalendar.withInputWithoutOutput(2);
        myCalendar.withOutInputWithOutput();
        System.out.println(Math.pow(2, 3));
        System.out.println(afridiPower(2,3));
    }

    static int afridiPower(int num1, int num2) {
        int ans = 1;
        while (num2 > 0) {
            ans *= num1;
            num2 -= 1;
        }
        return ans;
    }

}
