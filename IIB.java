public class IIB
{
    int goals;
    String name;
    {
        //IIB - Instance Initialization Block
        System.out.println("Inside IIB");
        name = "CR7";
        goals = 3;
    }
    static
    {
        System.out.println("Static Block");
    }
    IIB()
    {
        //goals = 962;
        //name = "Cristiano Ronaldo";
    }
    void Display()
    {
        System.out.println(name + " " + goals);
    }
    public static void main(String args[])
    {
        IIB ob = new IIB();
        ob.Display();

        IIB ob1 = new IIB();
        ob1.Display();
    }
}