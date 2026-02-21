//Hierarchial Inheritance

class SuperHero
{
    void Fight()
    {
        System.out.println("SuperHeroes Save the World");
    }
}
class SpiderMan extends SuperHero
{
    void Identity1()
    {
        System.out.println("Peter Parker");
    }
}
class IronMan extends SuperHero
{
    void Identity2()
    {
        System.out.println("Tony Stark");
    }
}
public class Marvel
{
    public static void main(String args[])
    {
        SpiderMan s = new SpiderMan();
        s.Fight();
        s.Identity1();

        IronMan i = new IronMan();
        i.Fight();
        i.Identity2();
    }
}
