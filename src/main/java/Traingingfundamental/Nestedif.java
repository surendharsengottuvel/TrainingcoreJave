package Traingingfundamental;

import java.util.Scanner;

public class Nestedif {

    public static void main(String[] args)
    {
        Scanner Myscan = new Scanner(System.in);
        System.out.println("please tell you matrix marks");
        int Metricmarks = Myscan.nextInt();

        if (Metricmarks >= 1100)
        {
            System.out.println("This Category is eligible for the 1000 Rs. Scholarship");
            Scanner MynewSccan=new Scanner(System.in);
            System.out.println("please tell us your HSC marks");
            int HSCmarks = MynewSccan.nextInt();
            if (Metricmarks>=1100 && HSCmarks >=488)
            {
                System.out.println("You are eligible for 1000 scholarship and partial fees discount");
            }
            else {
                System.out.println("You are eligible for 1000 scholarship and partial fees discount");
            }
        }
        else {
            System.out.println("not eligible good bye better luck next time");
        }
    }
}