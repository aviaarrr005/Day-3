class Parent
{
    void Display()
    {
        System.out.println("Parent Class");
    }
}
class Child1 extends Parent
{
    void DisplayChild1()
    {
        System.out.println("Child1 Class");
    }
}
class Child2 extends Child1
{
    void DisplayChild2()
    {
        System.out.println("Child2 Class");
    }
}
public class MultiLevel
{
    public static void main(String args[])
    {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c1.Display();
        c2.Display();
        c1.DisplayChild1();
        c2.DisplayChild2();

        Parent p = new Parent();
        p.Display();
    }
}