import java.util.Random;
class TechStock extends Stock
{
    private Random random = new Random();
    TechStock(String name, String symbol, double startingPrice)
    {
        super(name, symbol, startingPrice);
    }
    public void simulatePrice() 
    {
        double randomChange = -0.05 + (0.10 * random.nextDouble());//between 0.05 and -0.05
        double newPrice = super.getcurrentPrice() * (1 + randomChange);
        setprice(newPrice);
    }
}