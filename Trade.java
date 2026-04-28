import java.util.*;

public abstract class Trade{
    private String stock_name;
    private String type;
    private int quantity;
    private double price;
    private String user;

    public Trade(String stock_name, int quantity, double price, String type, String user){
        this.stock_name=stock_name;
        this.quantity=quantity;
        this.price=price;
        this.type=type;
        this.user=user;
    }
    public String getUser(){
        return user;
    }
     
    public String getStock(){
        return stock_name;

    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getType(){
        return type;
    }
    
    public abstract void execute();

}
