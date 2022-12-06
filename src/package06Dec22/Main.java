package package06Dec22;

public class Main {
    public static void main(String[] args) {
        Student afridi = new Student();
        afridi.setCollegeName("Deccan");
        afridi.setName("Syed Afridi");
        afridi.setMobileNumber("1541762480170");
        System.out.println(afridi.getCollegeName()+","+afridi.getName()+","+afridi.getMobileNumber());
         Student ismail = new Student();
        ismail.setCollegeName("Deccan College");
        ismail.setName("Mohd Ismail Khan");
        ismail.setMobileNumber("1541770");
        System.out.println(ismail.getCollegeName()+","+ismail.getName()+","+ismail.getMobileNumber());
        Employee employee = new Employee();
        employee.setEmployeeName("Mazhar");
        employee.setSalary(2000);
        employee.setEmpId("13m21a0542");
        Employee employee1 = new Employee();
        employee1.setEmpId("987");
        employee1.setSalary(3000);
        employee1.setEmployeeName("Karmani");
        System.out.println("Employee1 Details: "+employee.getEmployeeName()+","+employee.getEmpId()+","+employee.getSalary());
        System.out.println("Employee2 Details: "+employee1.getEmployeeName()+","+employee1.getEmpId()+","+employee1.getSalary());
        Employee[] employeesArray= new Employee[10];
        employeesArray[0]=employee;

        employeesArray[1]=employee1;

        Employee employee2=new Employee();
        employee2.setEmployeeName("Mama");
        employee2.setSalary(778);
        employee2.setEmpId("7777");

        employeesArray[2]=employee2;


    }
}
