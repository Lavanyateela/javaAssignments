package com.company.assignment1;

import java.io.File;
import java.util.Scanner;

public class FileFinder {
    private void findFile(){
        File path=new File("Desktop");
        String str;
        Scanner sc = new Scanner(System.in);
        do {
            int found=0;
            System.out.println("Enter file/folder name : ");
            str=sc.nextLine();
            String[] files = path.list();
            for(String string : files)
            {
                boolean str1=str.equals(string);
                if(str1)
                {
                    found=1;
                    System.out.print("File Found : ");
                    System.out.println(str);
                    System.out.println("Path : "+path.getAbsolutePath());
                }
            }
            if(found==0)
            {
                System.out.println("File not found");
            }
        }while ((str!="exit"));
    }

    public static void main(String args[])
    {
        FileFinder obj = new FileFinder();
        obj.findFile();
    }
}
