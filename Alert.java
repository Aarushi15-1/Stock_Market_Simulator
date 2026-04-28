public abstract class Alert {
   private Stock stock;
   private double targetPrice;
   private boolean isActive;

Alert(Stock stock, double targetPrice){
    this.stock=stock;
    this.targetPrice=targetPrice;
    this.isActive=true;
}
double currentPrice=stock.getcurrentPrice();
abstract void checkAndTrigger(double currentPrice);
Stock getStockSymbol(){
    return stock;
}
double getTargetPrice(){
    return targetPrice;
}
boolean isActive(){
    return isActive;
}
boolean deactivate(){
    return isActive=false;
}
String TooString(){
return "[" + getStockSymbol() + " | Target: " + targetPrice +" | Active: " + isActive + "]";
}
}