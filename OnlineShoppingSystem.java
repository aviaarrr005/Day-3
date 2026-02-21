/*


class Product
{
    String productName;
    double price;
    static
    {
        System.out.println("Product Class Loaded");
    }
    {
        System.out.println("Product Object Created");
    }
}
void Product(String productName, double price)
{
    this.productName = productName;
    this.price = price;
}
double calculateDiscount(int price)
{
    return price;
}
class Electronics extends Product
{
    int warrantyYears;

    Electronics(String productName, double price, int warrantyYears)
    {
        super(productName, price);
        this.warrantyYears = warrantyYears;
    }

    
    @Override
    double calculateDiscount(double price)
    {
        return price - (0.1 * price);
    }
}
public class OnlineShoppingSystem
{
    public static void main(String args[])
    {
        Product p = new Electronics("Iphone", 70000, 2027);
        System.out.println("Final Price "+p.calculateDiscount());
    }
}
*/

@SuppressWarnings("InitializerMayBeStatic")
class Product
{
    String productName;
    double price;
    static
    {
        System.out.println("Product Class Loaded");
    }
    {
        System.out.println("Product Object Created");
    }
    Product(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
    }
    double calculateDiscount()
    {
        return price;
    }
}
class Electronics extends Product
{
    @SuppressWarnings("unused")
    int warrantyYears;

    Electronics(String productName, double price, int warrantyYears)
    {
        super(productName, price);
        this.warrantyYears = warrantyYears;
    }

    
    @Override
    double calculateDiscount()
    {
        return price*0.9;
    }
}
public class OnlineShoppingSystem
{
    public static void main(String args[])
    {
        Product p = new Electronics("Iphone", 70000, 2027);
        System.out.println("Product: " + p.productName);
        System.out.println("Final Price " + p.calculateDiscount());
    }
}