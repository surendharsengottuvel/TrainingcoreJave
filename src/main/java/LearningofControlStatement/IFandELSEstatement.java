package LearningofControlStatement;

import java.util.Scanner;

public class IFandELSEstatement {
    public static void main(String[] args) {
        System.out.println("Welcome dear customer.......");
        System.out.println("We hope Your family and friends are very well :)");
        System.out.println("Please kindly confirm, you are using Credit card or not");
        Scanner Myscan = new Scanner(System.in);
        String Customerreply = Myscan.nextLine();
        System.out.println("tell us to your purchase amout");
        int eligiblefordiscount = Myscan.nextInt();

        System.out.println(Customerreply);
        if (eligiblefordiscount >= 1000) {
            System.out.println("you are eligible");
        }
        else {
            System.out.println("Not eligible pa");
        }


    }
}
