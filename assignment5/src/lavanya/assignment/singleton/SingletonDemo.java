package lavanya.assignment.singleton;

public class SingletonDemo {
    public String str;
    public  SingletonDemo(String name)    // modifier static not allowed here
    {
        str=name;
        return new SingletonDemo();     // incompatible types: unexpected return value
    }
    public void print()
    {
        System.out.println(str);
    }
    //compilation error because non-static variable str cannot be referenced from a static context
}
