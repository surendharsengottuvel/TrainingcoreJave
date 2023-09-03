package Inheritance.Mutlivele;

public class Class2 extends Class1
{
public void method2()
{
    int a=7;
    int b=100;

    for (int i=0; i<=9; i++)
    {        int c=b-a;
        a=c;
        b=a;
        System.out.println(c);
    }
}

    public static void main(String[] args)
    {
    int totalStudent=10;
        while (totalStudent>0)
        {
            System.out.println(totalStudent);
       totalStudent--;
        }

   Class2 obj=new Class2();
        obj.method2();
        obj.method1();
    }



}
