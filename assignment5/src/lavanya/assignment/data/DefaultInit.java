package lavanya.assignment.data;

public class DefaultInit {
    int age;
    char gender;
    public void printInformation()
    {
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
    }
    public void printLocalInformation()
    {
        int salary;
        char section;
        System.out.println("Salary : "+salary);         //java: variable salary might not have been initialized
        System.out.println("Section : "+section);
    }
}
