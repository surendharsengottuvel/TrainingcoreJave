package Traingingfundamental;

import java.util.Scanner;

public class EleseifStatement {

    public static void main(String[] args) {

        System.out.println("Welcome to the Medical and engineering cut-off selection");
        Scanner Myscanvalue = new Scanner(System.in);
        double Medicalcutoff = Myscanvalue.nextDouble();
        double Engineeringcutoof = Myscanvalue.nextDouble();
        if (Medicalcutoff >= 97 && Engineeringcutoof >= 95)
        {
            System.out.println("Your Medical cutoff is " + Medicalcutoff + "Your Engineering cutooff is " + Engineeringcutoof + "Your Eligible for this Medical and Engineering!! CONGRADULATION");
        }
        else if (Medicalcutoff <97 || Engineeringcutoof > 93)
        {
            System.out.println("You Medical cutoff is " + Medicalcutoff + "Your Engineering cutoof is " + Engineeringcutoof + "Your not eligible for Medical and Eligible for Engineering!! Congradulation");
        }
        else
        {
            System.out.println("Not eligible for anything");
        }
    }
}