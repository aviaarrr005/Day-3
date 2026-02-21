class Parent
{
    void Display()
    {
        System.out.println("Parent Class");
    }
}
class Child extends Parent
{
    void DisplayChild()
    {
        System.out.println("Child Class");
    }
}
public class Single
{
    public static void main(String args[])
    {
        Child c = new Child();
        c.Display();
        c.DisplayChild();

        Parent p = new Parent();
        p.Display();
    }
}