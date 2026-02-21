//Method OverLoading

public class OverLoadTest
{
    int add(int a, int b)
    {
        System.out.println("Add Interger");
        return a+b;
    }
    double add(double a, double b)
    {
        System.out.println("Add Double");
        return a+b;
    }
    float add(float a, float b)
    {
        System.out.println("Add Float");
        return a+b;
    }
    public static void main(String args[])
    {
        OverLoadTest ov = new OverLoadTest();
        System.out.println(ov.add(5, 10));
        System.out.println(ov.add(5.5f, 10.5f));
        System.out.println(ov.add(5.5d, 10.5d));
    }
}