package Dec_11_2022;

import java.util.Scanner;

public class Main11Dec {
    public static void main(String[] args) {
        System.out.println("Set Up The Size Of Student Array");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Initial Size of Array");
        StudentManager studentManager = new StudentManager();
        studentManager.printSize();
        studentManager.setupStudentsCount(number);
        studentManager.printSize();
        System.out.println("How many Students You Want to Add");
        int studentCount = sc.nextInt();
        while (studentCount > 0) {
            System.out.println("Add Student Detail");
            studentCount = studentCount - 1;
            Student studentObject = new Student();
            Name n = new Name();
            System.out.println("Enter Your First Name");
            n.setFirstName(sc.next());
            System.out.println("Enter Your Last Name");
            n.setLastName(sc.next());
            System.out.println("Enter Your Middle Name");
            n.setMiddleName(sc.next());
            studentObject.setName(n);
            Address address = new Address();
            System.out.println("Enter Your Area Name");
            address.setArea(sc.next());
            System.out.println("Enter Your Zip Code");
            address.setZipCode(sc.nextLong());
            System.out.println("Enter Your City Name");
            address.setCity(sc.next());
            System.out.println("Enter Your State Name");
            address.setState(sc.next());
            System.out.println("Enter Your Country Name");
            address.setCountry(sc.next());
            studentObject.setAddress(address);
            System.out.println("Enter Your Mobile Number");
            studentObject.setMobileNumber(sc.next());
            System.out.println("Enter Your Gender : M for Male , F for Female and O for others");
            studentObject.setGender(sc.next());
            System.out.println("Enter Your Roll Number");
            studentObject.setRollNo(sc.next());
            studentManager.addStudent(studentObject);//
        }
        studentManager.printAllStudents();
    }
}
