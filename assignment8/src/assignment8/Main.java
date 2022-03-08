package assignment8;

import java.util.*;

public class Main {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            String s=sc.nextLine();
            if(s.equals("NotNumber"))
            {
                throw new NotNumberException("Not a valid number");
            }
            else if(s.equals("invalidFormat"))
            {
                throw new InvalidFormatException("Not a valid format");
            }
            else
            {
                throw new InvalidAgeException("Not a valid age");
            }
        }
        catch(NotNumberException | InvalidFormatException | InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }
    }

}

