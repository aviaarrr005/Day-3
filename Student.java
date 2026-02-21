public class Student extends Person
{
    public void displayDetails()
    {
        System.out.println("Public" + name);
        System.out.println("Protected" + age);
        //ShowName();
        showAge();
    
    }
    public static void main(String args[])
    {
        Student s = new Student();
        s.displayDetails();
    }
}
