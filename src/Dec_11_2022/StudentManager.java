package Dec_11_2022;

public class StudentManager {
    private Student[] array = new Student[3];

    public void addStudent(Student studentObject) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == null) {
                array[i] = studentObject;
                return;
            }
            i = i + 1;
        }
    }

    public void deleteStudent(Student studentObject) {

    }

    public void editStudent(Student studentObject) {

    }

    public void printAllStudents() {
        int i = 0;
        while (i < array.length) {
            Student studentObject = array[i];
            if (array[i] == null) {
                return;
            }
            System.out.println("First Name , Middle Name , Last Name" + array[i].getName().getFirstName() + "," + array[i].getName().getMiddleName() + "," + array[i].getName().getLastName());
            System.out.println("Gender,Mobile Number" + array[i].getGender() + "," + array[i].getMobileNumber());
            System.out.println("Address:" + array[i].getAddress().getArea() + "," + array[i].getAddress().getZipCode() + "," + array[i].getAddress().getCity() + "," + array[i].getAddress().getState() + "," + array[i].getAddress().getCountry());
            i = i + 1;
        }
    }

    public void setupStudentsCount(int size) {
        array = new Student[size];
    }

    public void printSize() {
        System.out.println(array.length);
    }
}
