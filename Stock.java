abstract class Stock
{
    private String name, symbol;
    private double price;
    Stock(String name, String symbol, double price)
    {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }
    public String getName() 
    {
    return name;
    }
    public String getSymbol() 
    {
    return symbol;
    }
    public double getcurrentPrice() 
    {
    return price;
    }
    protected void setPrice(double newPrice)
    {
        price = newPrice;
    }
    public abstract void simulatePrice();

}
