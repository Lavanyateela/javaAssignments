package assignment1;

import java.util.*;
import java.io.*;

public class FileAbsolutePath {
    private void findFile()
    {
        File file = new File("c:/Users/Teela.Lavanya");
        String str ;
        Scanner sc = new Scanner(System.in);
        do{
            int found =0;
            System.out.print("Enter file/folder name: ");
            str =sc.nextLine();
            //scan.close();

            String[] files = file.list();
            for (String string : files){
                Boolean str1 = str.equals(string);
                if (str1){
                    found = 1;
                    System.out.print("File Found : ");
                    System.out.println(string);
                    System.out.println("Path : "+ file.getAbsolutePath());

                }
            }
            if(found == 0)
            {
                System.out.println("File not find");
            }
        } while(str != "exit");
    }
    public static void main(String[] args){
        FileAbsolutePath obj =new FileAbsolutePath();
        obj.findFile();
    }
}
