package Dec_10_2022;

public class A extends B{
    public int a=5;
    A(){
        System.out.println(super.a);
    }
    public void add(){
        System.out.println("Parent");
    }
}
