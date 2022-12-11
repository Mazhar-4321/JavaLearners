package Dec_10_2022;

public class Main {
    public static void main(String[] args) {
        String[] hobbiesArray = {"Coding", "Playing Chess", "Listening To Music"};
        Main main = new Main();
        regularExpression();
    }

    private static void regularExpression() {
        /*
        E.g. abc.xyz@bl.co.in
        E.g. abc.xyz@bl.co.in -
        Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with
precise @ and . positions
         */
        String p ="Mazhar@12345M";
        String pattern="^(abc[^a-zA-z0-9]*\\.xyz@bl\\.co\\.in)$";
        System.out.println(p.matches("((?=.*[0-9])(?=.*[A-Z])(?=.{8,}$).*)(^([a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*)$)"));
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
                continue;
            }
            message += hobbies[i] + ", ";
        }
        message += "and " + hobbies[hobbies.length - 1] + ".";
        return message;

    }
}
