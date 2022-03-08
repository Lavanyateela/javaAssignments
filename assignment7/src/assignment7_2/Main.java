package assignment7_2;

public class Main {
    public static void main(String args[])
    {
        //        Cycle[] cycles=new Cycle[3];
        //        cycle[0]=new Unicycle();
        //        cycle[1]=new Bicycle();
        //        cycle[2]=new Tricycle();
        //
        //        for(Cycle cycle: cycles)
        //            cycle.balance();
        // It throws compile time error to create abstract balance method in Cycle class

        Unicycle unicycle=new Unicycle();
        unicycle.balance();

        Bicycle bicycle=new Bicycle();
        bicycle.balance();

        Tricycle tricycle=new Tricycle();
    }
}
