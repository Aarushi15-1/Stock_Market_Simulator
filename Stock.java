abstract class Stock
{
    private String name, symbol;
    private double currentPrice;
    Stock(String name, String symbol, double currentPrice)
    {
        this.name = name;
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }
    public String getName() 
    {
    return name;
    }
    public String getSymbol() 
    {
    return symbol;
    }
    public String getPrice() 
    {
    return currentPrice;
    }
    protected void setPrice(double newPrice)
    {
        currentPrice = newPrice;
    }
    public abstract void simulatePrice();
    public String toString() {
        return symbol + " | " + name + " | ₹" + currentPrice;
    }
}