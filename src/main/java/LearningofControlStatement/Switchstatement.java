package LearningofControlStatement;

import java.util.Scanner;

public class Switchstatement {

    public static void main(String[] args) {
        Scanner Myscannername=new Scanner(System.in);
        String Monthname=Myscannername.nextLine();

        switch (Monthname)
        {
            case "January" :
                System.out.println("First Month");
                break;
            case "February":
                System.out.println("Second Month");
                break;
            case "March":
                System.out.println("Third Month");
                break;
            case "April":
                System.out.println("fourth Month");
            default:
                System.out.println("Other Month");





    }








}
}
