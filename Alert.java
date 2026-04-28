public abstract class Alert {
    String stockSymbol;
    double targetPrice;
    boolean isActive;

Alert(String stockSymbol, double targetPrice){
    this.stockSymbol=stockSymbol;
    this.targetPrice=targetPrice;
    this.isActive=true;
}
abstract void checkAndTrigger(currentPrice);

}