package Dec_19_22;

public class MyCalendar {
    // You Can Call ALl Public variables and methods using its Object
    public  int getMeDaysInAMonth(String monthName) {
        if (monthName.equals("January") || monthName.equals("March") || monthName.equals("May")
                || monthName.equals("July") || monthName.equals("August") || monthName.equals("October")
                || monthName.equals("December")) {
            return 31;
        }
        if (monthName.equals("February")) {
            return 29;
        }
        if (monthName.equals("April") || monthName.equals("June") || monthName.equals("September") || monthName.equals("November"))
            return 30;
        return -1;
    }
    public static void noInputNoOutput(){
        System.out.println("hi");
    }
    public void withInputWithoutOutput(int x){
        System.out.println(x);
    }
    public int withOutInputWithOutput(){
        return 1;
    }
}
