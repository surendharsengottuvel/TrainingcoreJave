package Mondayaccessemnt;

import java.util.Scanner;

public class Looping {

    public static void main(String[] args) {
        /*int i;
        for(i=1;i<=10;i++)
        {
            System.out.println("what is your experience");
        }*/

        Scanner scan=new Scanner(System.in);
        for (int Myvalue =10;Myvalue>0;Myvalue--)
        {
            System.out.println("What is your expericene");
            int exp=scan.nextInt();
            if (exp>=4  && exp<=8){
                System.out.println("you are eligible"+Myvalue);
            }
            else{
                System.out.println("Not eligile");
            }
        }





    }


    }
