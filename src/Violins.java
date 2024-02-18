public class Violins extends Instrument{
    // EXTENDED ATTRIBUTES
    // EXTENDED CONSTRUCTOR
    public Violins(String type, String brand, String model, int price, boolean condition) {
        super(type, brand, model, price, condition);
        // EXTENDED ATTRIBUTES WITH FIELDS ASSIGNED TO OBJECTS
        this.price = price;
    }
    // OVERRIDING METHOD
    public void setPrice(){
        System.out.println("This violin is priceless");
    }
}