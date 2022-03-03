package com.company.assignment2;

import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        if(AlphabetsCheck.check(str))
        {
            System.out.println("String contains all the alphabets");
        }
        else
        {
            System.out.println("String does not contains all the alphabets");
        }
    }
}


// Time complexity : O(length of string)
// Space complexity : O(1)