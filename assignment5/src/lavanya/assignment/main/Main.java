package lavanya.assignment.main;


import lavanya.assignment.data.DefaultInit;
import lavanya.assignment.singleton.SingletonDemo;

public class Main {
    public static void main(String args[])
    {
        DefaultInit defaultInit = new DefaultInit();
        defaultInit.printInformation();
        defaultInit.printLocalInformation();
        //compilation error because loval variables are not initialized


        SingletonDemo singletonDemo = new SingletonDemo("Lavanya");
        singletonDemo.print();
        //compilation error because non-static variable str cannot be referenced from a static context

    }
}
