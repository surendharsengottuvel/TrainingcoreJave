package Traingingfundamental;

import java.util.Scanner;

public class ControlStatement {


    public static void main(String[] args) {

        Scanner Myscan = new Scanner(System.in);
        int Voterage = 18;
        String Nonvoter = "Below 18 age";
        Voterage = Myscan.nextInt();
        if (Voterage >= 18)
        {
            System.out.println("Your age is "+Voterage+"Your age eligible for this election poll");
        }
        else {
            System.out.println("Your age is "+Voterage+"Your Not eligible for this election poll");
        }

    }
}