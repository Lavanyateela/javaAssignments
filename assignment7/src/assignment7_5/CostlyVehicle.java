package assignment7_5;

public class CostlyVehicle {
    public static class Bullet extends Vehicle.Bike
    {
        Bullet(int number_of_wheels)
        {
            super(number_of_wheels+number_of_wheels);
            System.out.println(number_of_wheels);
        }
    }
    public static void main(String args[])
    {
        Vehicle vehicle =new Vehicle();
        CostlyVehicle costlyVehicle = new CostlyVehicle();
    }
}