package LearningofControlStatement;

import java.util.Scanner;

public class ContorlstatemnetTraining {
    public static void main(String[] args) {
        Scanner Myscanner = new Scanner(System.in);
        int Totalfess = 10000;
        int Youarepaidfesss = Myscanner.nextInt();
        if (Youarepaidfesss >=6000 )
        {
            System.out.println("You are eligible for todaly class");
        } else if (Youarepaidfesss <= 5000  && Youarepaidfesss >=2000)
        {
            System.out.println("Advice to pay the fees");
        }
        else {
            System.out.println("Not eligible for today class");
    }
}}