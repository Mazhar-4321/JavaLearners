package Dec_10_2022;

public class Main {
    public static void main(String[] args) {
     Name name1= new Name();
     name1.setFirstName("Syed");
     name1.setMiddleName("Mazhar");
     name1.setLastName("Ali");
     Address address1= new Address();
     address1.setArea("Golconda");
     address1.setCity("Hyderabad");
     address1.setZipCode(500008);
     address1.setState("Telangana");
     address1.setCountry("India");
     Student student1= new Student();
     student1.setName(name1);
     student1.setAddress(address1);
     student1.setMobileNumber("8125629427");
     student1.setGender("M");
     student1.setRollNo("542");
        System.out.println("Name: "+student1.getName().getFirstName()+","+student1.getName().getMiddleName()+","
        +student1.getName().getLastName());
        System.out.println("Address: "+student1.getAddress().getArea()+","+student1.getAddress().getCity()+","+
                student1.getAddress().getZipCode()+","+student1.getAddress().getState()+","+student1.getAddress().getCountry());
        System.out.println("MobileNumber:"+student1.getMobileNumber());
        System.out.println("Gender:"+student1.getGender());
        System.out.println("Roll No :"+student1.getRollNo());
        StudentManager sm= new StudentManager();
        sm.printAllStudents();

    }
}
