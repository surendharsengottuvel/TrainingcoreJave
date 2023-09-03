package LearningofControlStatement;

import java.util.Scanner;

public class Swithcclasss {

    public static void main(String[] args) {
        System.out.println("Tells us to what day");
        Scanner Mynewscan = new Scanner(System.in);
        String Whatday = Mynewscan.nextLine();
        switch (Whatday)
        {
            case "Monday":
                System.out.println("Monday work week statring day" + Whatday);
                break;
            case "Tuesday":
                System.out.println("Tuesday is second working day"+ Whatday);
                break;
            case "Friday":
                System.out.println("some companies last working weekday" + Whatday);
                break;
            case "Sunday":
                System.out.println(Whatday +"is funday");
                break;
            default:
                System.out.println("tension days");
        }

    }
}