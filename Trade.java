import java.util.*;

public abstract class Trade{
    private Stock stock;
    private String type;
    private int quantity;
    private double current_price;
    private String user;

    public Trade(Stock stock, int quantity, String type, String user){
        this.stock=stock;
        this.quantity=quantity;
        this.current_price=stock.getcurrentPrice();
        this.type=type;
        this.user=user;
    }
    public String getUser(){
        return user;
    }
     
    public Stock getStock(){
        return stock;

    }

    public double getPrice(){
        return current_price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getType(){
        return type;
    }
    
    public abstract void execute();

}
