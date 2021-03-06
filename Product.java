
// This class is made in Tutorial 17
public class Product{

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(){
        this("", 0, 0);
    }

    public String getName(){return this.name; }
    public double getPrice(){return this.price; }
    public int getQuantity(){return this.quantity; }

    public void setName(String name){this.name = name; }
    public void setPrice(double price){this.price = price; }
    public void setQuantity(int quantity){this.quantity = quantity; }
}