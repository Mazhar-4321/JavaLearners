package Dec_11_2022;

import java.util.Scanner;

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
    /*
    array[0]=Object{name:a,a,a Address:as,as,as,89 MobileN:kkn gender:a} ; array[i].getAddress.setCountryu
    array[1]=Object{name:b,b,b Address:bas,bas,bas,89 MobileN:bkkn gender:b}
    array[2]=null
    array[3]=null
    array[4]=null
     */

    public void deleteStudent(String studentFirstName) {//mazhar
        int i = 0;
        while (i < array.length) {
            if (array[i] != null && array[i].getName().getFirstName().equals(studentFirstName)) {
                array[i] = null;
                return;
            }
            i = i + 1;
        }
    }

    public void editStudent(String studentName) {
        int i = 0;
        while (i < array.length) {
            if (array[i] != null && array[i].getName().getFirstName().equals(studentName)) {
                System.out.println("Enter Address Details");
                Scanner sc = new Scanner(System.in);
                Address address= new Address();
                System.out.println("Enter Your Country Name");
                address.setCountry(sc.next());
                System.out.println("Enter Your State Name");
                address.setState(sc.next());
                System.out.println("Enter Your City Name");
                address.setCity(sc.next());
                System.out.println("Enter Your Area Name");
                address.setArea(sc.next());
                System.out.println("Enter Your Zip Code Name");
                address.setZipCode(sc.nextLong());
                array[i].setAddress(address);
                return;
            }
            i = i + 1;
        }

    }

    public void printAllStudents() {
        int i = 0;
        while (i < array.length) {
            Student studentObject = array[i];
            if (array[i] == null) {
                i = i + 1;
                continue;
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
