package Inheritance.Single;

public class Parentclass extends Childclass
{
public void newmethod()
{
    System.out.println("funny guys");
}

    public static void main(String[] args)
    {
    //objecct creation
    Parentclass Obj=new Parentclass();
    Obj.newmethod();
    Obj.mymethod();

    }


}
