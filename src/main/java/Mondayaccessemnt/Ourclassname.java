package Mondayaccessemnt;

import java.util.Scanner;

public class Ourclassname {

    String Myname="Surenthiran";
    public static void main(String[] args) {
        int a= 50;
        int b= 5;
        System.out.println(a>>b);
        System.out.println("right shift value");
        System.out.println(a<<b);
        System.out.println("left shift value");

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        Scanner scanee=new Scanner(System.in);
        System.out.println("Tell your U value");
        System.out.println("Tell u r Wvalue");
        int Uvalue=scanee.nextInt();
        int Wvalue=scanee.nextInt();
        if (Uvalue>=90){
            System.out.println("You are eligible for English eligible test");
            if (Uvalue>=95 && Wvalue >=98)
            {
                System.out.println("you are Uvalue is"+ Uvalue + "You are Wvalue is "+ Wvalue + "You are directly eligible");
            }
            else
            {
                System.out.println("Not eligible for direcct eligible");
            }
        }
        else {
            System.out.println("Not eligible for English eligible test");
        }

        Ourclassname Myobjecct=new Ourclassname();
        Myobjecct.Mymethod();
        Mystatic();


    }
    public void Mymethod(){

       char Mvalue='M';
       double NewMvalue=(double) Mvalue;
        System.out.println("New Mvalue"+NewMvalue);
        System.out.println(Mvalue+"this is my name");


    }

    public static void Mystatic(){

        Scanner MynewScane=new Scanner(System.in);
        String Statename=MynewScane.nextLine();
        switch (Statename)
        {
            case "TN":
                System.out.println("Tamil Nadu");
                break;
            case "KL":
                System.out.println(" Kerala");
                break;
            case "KA":
                System.out.println("Karnadaka");
                break;
            default:
                System.out.println("This not comes under south states");
        }
    }
static {
    System.out.println("this my static block output");
}


}
