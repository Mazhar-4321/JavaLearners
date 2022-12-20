package Dec_19_22;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        int noOfMOnths = myCalendar.getMeDaysInAMonth("January");
        System.out.println(getHomeWorkCount());
    }

    static int afridiPower(int num1, int num2) {
        int ans = 1;
        while (num2 > 0) {
            ans *= num1;
            num2 -= 1;
        }
        return ans;
    }

    static Map<String, Integer> getHomeWorkCount() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Farhan", "ahmed".hashCode() % 5 - 5);
        map.put("Nomaan", Math.abs("Nomaan".hashCode() % 5 - 5));
        map.put("Osama", "Osama".hashCode() % 5 - 5);
        map.put("Faiz", " mohammed".hashCode() % 5 - 5);
        map.put("Khader", "Khader".hashCode() % 5 - 5);
        map.put("Abrar", "hussain".hashCode() % 5 + 1);
        map.put("faiyaz", Math.abs("faiyaz".hashCode() % 5 + 1));

        return map;
    }

}
