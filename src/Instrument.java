import java.util.concurrent.locks.Condition;
// ABSTRACT CLASS TO ALL INSTRUMENTS
public abstract class Instrument {
    // BASIC ATTRIBUTES TO ALL INSTRUMENTS
    String type;
    String brand;
    String model;
    int price;
    boolean condition;
    // BASIC CONSTRUCTOR W/ INSTRUCTIONS HOW INSTRUMENTS (OBJECTS) SHALL BE CREATED + ATTRIBUTES PASSED IN
    public Instrument(String type, String brand, String model, int price, boolean condition) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.condition = condition;
    }
    // BASIC METHODS W/SPECS AND CHARACTERISTICS
    public void setType(){
        System.out.println("Instrument: " + type); // METHOD RESPOND TO SOUT MESSAGES/BEHAVIOR
    }
    public void setBrand() {
        System.out.println("Brand: " + brand);
    }
    public void setModel(){
        System.out.println("Model: "+ model);
    }
    public void setPrice(){
        System.out.println("Price: "+"$"+ price);
    }
    public void setCondition(){
        if(condition==true){
            System.out.println("Condition: New");
        }else {
            System.out.println("Condition: Used");
        }
    }
    // METHOD FOR POLYMORPHISM
    public void move(){
    }
}