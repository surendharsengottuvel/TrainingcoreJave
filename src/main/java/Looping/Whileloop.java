package Looping;

import java.util.Arrays;

public class Whileloop
{
    public static void main(String[] args)
    {
    String [] colors={"green", "red", "yellow", "orange", "white", "black", "rose"};
    int i=7;
    int count=7;
    while (i> 0)
    {
    for (int index=0; index<colors.length; index++)
    {
        System.out.print(colors[index] + " ");
    }
        System.out.println();
i--;
    }
}}
