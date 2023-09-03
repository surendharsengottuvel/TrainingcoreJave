package Looping;

import java.util.Scanner;

public class dowhileloop
{
    public static void main(String[] args)
    {
int Studentrollno=10;
float logintime=9.15f;
int count = 0;
int cc=0;
Scanner myscan=new Scanner(System.in);
do
    {
        System.out.println("What is Student name and Roll No");
        String studentname=myscan.next();
        System.out.println("What is the checkin time of"+studentname);
        logintime=myscan.nextFloat();
        if (logintime<9.15)
        {
            System.out.println("you are  login time is"+logintime+"your good time loging ");
cc ++;
        } else if (logintime>=9.16 && logintime<=9.20)
        {
            System.out.println("your login time is"+logintime+"your late comer and advice to come early");
        }
        else if (logintime>9.20 && logintime<10){
            System.out.println("you are late comer, so 10% of salary deducted");
        }
      else  {
            System.out.println("Your too late absent today");count++;
        }
Studentrollno--;
    }while (Studentrollno>0);
        System.out.println("Late comers count is "+ count +"good time to comer"+cc);

    }
}