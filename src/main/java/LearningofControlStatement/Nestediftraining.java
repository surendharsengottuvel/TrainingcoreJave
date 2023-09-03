package LearningofControlStatement;

import java.util.Scanner;

public class Nestediftraining {
    public static void main(String[] args) {
        Scanner Myscan=new Scanner(System.in);
        double Your12thPercent=Myscan.nextDouble();
        if (Your12thPercent >=95){
            System.out.println("Your 12th percent is " +Your12thPercent + "Your are eligible for 25% of scholarship");
        Scanner MyNewScan=new Scanner(System.in);
        int Your10thPercent=MyNewScan.nextInt();
        if (Your12thPercent >=96 && Your10thPercent >=98){
            System.out.println("Your are 12 the and 10th percent is" + Your10thPercent + Your10thPercent + "Your are eligible for 50% fees edcution");
        }
        else {
            System.out.println("Not eligible for 50% fees deduction and 25% scholarship avalile");
        }
    }
    else {
            System.out.println("Not eligible for any Scholarship");
        }





}}
