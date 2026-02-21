public class Student extends Person
{
    public void displayDetails()
    {
        //Person p1 = new Person
        System.out.println("Public" + name);
        System.out.println("Protected" + age);
        showName();
        showAge();
    
    }
    public static void main(String args[])
    {
        Student s = new Student();
        s.displayDetails();

        Person p1 = new Person();
        p1.showName();
        Student p2 = new Student();
        System.out.println(p2.name);
    }
}
