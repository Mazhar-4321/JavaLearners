package Dec_11_2022;

import java.util.Scanner;

public class Main11Dec {
    public static void main(String[] args) { // terminal memory
        System.out.println("Set Up The Size Of Student Array");// Set Up The Size Of Student Array
        Scanner sc = new Scanner(System.in);// object:sc created stored in memory
        int number = sc.nextInt();// variable:number created stored in memory
        System.out.println("Initial Size of Array");//Terminal printing
        StudentManager studentManager = new StudentManager();// object:studentManager stored in memory
        studentManager.printSize();// Terminal Printin
        studentManager.setupStudentsCount(number);// object:array create in memory with size=number
        studentManager.printSize();//terminal printing
        System.out.println("How many Students You Want to Add");//terminal printing
        int studentCount = sc.nextInt();//variable:studentCount created and stored in memory
        while (studentCount > 0) { //  loop
            System.out.println("Add Student Detail"); // terminal
            studentCount = studentCount - 1; // nothing but updating variable and making changes in memory
            Student studentObject = new Student();//Object:studentObject created and stored in memory
            Name n = new Name();// Object : n created and stored in memory
            System.out.println("Enter Your First Name");//terminal
            n.setFirstName(sc.next());//object:n giving value to its member(firstName)
            System.out.println("Enter Your Last Name");//terminal
            n.setLastName(sc.next());//object:n giving value to its member(lastName)
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
