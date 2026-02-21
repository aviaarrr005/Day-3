//Method OverRiding

class Car
{
    void model()
    {
        System.out.println("RaceCar");
    }
}
class Formula1 extends Car
{
    @Override
    void model()
    {
        System.out.println("Formula1 - Buddha Circuit New Delhi");
    }
}
public class Vehicle
{
    public static void main(String args[])
    {
        Car f = new Formula1();
        f.model();
    }
}