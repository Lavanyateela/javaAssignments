public class ConstructorArray {
    ConstructorArray(String  str)
    {
        System.out.println(str);
    }

    ConstructorArray[] arr;
    public static void main(String args[])
    {
        ConstructorArray obj=new ConstructorArray("Lavanya");
        obj.arr=new ConstructorArray[2];
        obj.arr[0]=new ConstructorArray("Teela");
        obj.arr[1]=new ConstructorArray("Lav");
    }
}
