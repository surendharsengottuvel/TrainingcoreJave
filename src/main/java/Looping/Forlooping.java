package Looping;

import java.util.Scanner;

public class Forlooping
{
    public static void main(String[] args) {
        int count=10;
        int number=10;
        float logintime=9.20f;
        for (int i=10; i>0;i--)
        {
            System.out.println("Employees Loging time"); number--;
            Scanner myscan=new Scanner(System.in);
            logintime=myscan.nextFloat();
            if (logintime<9.20)
            {
                System.out.println("Your login time is "+ logintime + " You are good time comer");
            count++;
            } else if (logintime>9.20)
            {
                System.out.println("Your login time is "+ logintime + " You are late comer"+count);
            count--;
            }


        }


    }





}
