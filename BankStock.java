import java.util.Random;
class BankStock extends Stock
{
    private Random random = new Random();
    BankStock(String name, String symbol, double startingPrice)
    {
        super(name, symbol, startingPrice);
    }
    public void simulatePrice() 
    {
        double randomChange = -0.03 + (0.06 * random.nextDouble());//-3 to +3%
        double newPrice = super.getcurrentPrice() * (1 + randomChange);
        setprice(newPrice);
    }
}