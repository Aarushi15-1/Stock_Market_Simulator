import java.util.Random;
class EnergyStock extends Stock
{
    private Random random = new Random();
    EnergyStock(String name, String symbol, double startingPrice)
    {
        super(name, symbol, startingPrice);
    }
    public void stimulatePrice()
    {
       double randomChange = -0.07 + (0.14 * random.nextDouble());
       double newPrice = super.getcurrentPrice()*(1 + randomChange);
       setPrice(newPrice);
    }
}