package LearningofControlStatement;

import java.util.Scanner;

public class Variables {

    String Ourcompanyname="xyz company";
    public static void main(String[] args) {
        System.out.println("Hi Friends");
        Scanner Myscannner=new Scanner(System.in);
        System.out.println("What is you A value");
        int Avalue= Myscannner.nextInt();
        System.out.println("What is your B value");
        int Bvalue= Myscannner.nextInt();
        System.out.println(Avalue+Bvalue);


        Variables MyObeject=new Variables();
        MyObeject.Mymethod();
        Rubber();


    }
public void Mymethod(){
    Scanner Myscannerclass=new Scanner(System.in);
    System.out.println("What is your company name");
    String Mycompanyname=Myscannerclass.nextLine();
    System.out.println(Ourcompanyname);


}

public static void Rubber()
{
String MYmaileid="surenthiar@gmail.com";
    System.out.println(MYmaileid);
    }


}
