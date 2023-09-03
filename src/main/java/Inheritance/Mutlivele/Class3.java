package Inheritance.Mutlivele;

public class Class3 extends Class2
{
public void method3()
{
    System.out.println("Welcome");
}

    public static void main(String[] args)
    {
        System.out.println("double welcome");
        Class3 obj=new Class3();
        obj.method3();
        obj.method2();
        obj.method1();
    }



}
