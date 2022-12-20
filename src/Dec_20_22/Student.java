package Dec_20_22;

public class Student {
    private String name;
    private String rollNumber;
    private String mobileNumber;

    public Student(String name, String rollNumber, String mobileNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mobileNumber = mobileNumber;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
