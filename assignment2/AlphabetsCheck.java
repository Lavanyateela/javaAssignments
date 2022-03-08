package com.company.assignment2;

import java.util.Locale;

public class AlphabetsCheck {
    public static boolean check(String str)
    {
        boolean[] exists = new boolean[26];
        str=str.toLowerCase();
        for(char l : str.toCharArray())
        {
            if(l>='a' && l<='z')
            {
                exists[l-'a']=true;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(!exists[i])
            {
                return false;
            }
        }
        return true;
    }
}
