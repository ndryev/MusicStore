public class Basses extends Instrument{
    // EXTENDED ATTRIBUTES
    String neckType;
    String bodyType;
    String bodyColor;
    String woodType;
    String knobs;
    int numberOfStrings;
    int numberOfFrets;
    int numberOfPickups;
    boolean activePickups;
    // EXTENDED CONSTRUCTOR
    public Basses(String type, String brand, String model, int price, String neckType,String bodyType, String bodyColor, String woodType, String knobs, int numberOfStrings, int numberOfFrets, int numberOfPickups, boolean activePickups, boolean condition) {
        super(type, brand, model, price, condition);
        // EXTENDED ATTRIBUTES WITH FIELDS ASSIGNED TO OBJECTS
        this.neckType = neckType;
        this.bodyType = bodyType;
        this.bodyColor = bodyColor;
        this.woodType = woodType;
        this.knobs = knobs;
        this.numberOfStrings = numberOfStrings;
        this.numberOfFrets = numberOfFrets;
        this.numberOfPickups = numberOfPickups;
        this.activePickups = activePickups;
    }
    // EXTENDED METHODS
    public void setNeckType() {
        System.out.println("Neck Type: "+neckType);
    }
    public void setBodyType() {
        System.out.println("Body Type: " + bodyType);
    }
    public void setBodyColor() {
        System.out.println("Color: " + bodyColor);
    }
    public void setWoodType() {
        System.out.println("Wood: " + woodType);
    }
    public void setKnobs() {
        System.out.println("Knobs: " + knobs);
    }
    public void setNumberOfStrings(){
        System.out.println("Strings: " + numberOfStrings);
    }
    public void setNumberOfFrets() {
        System.out.println("Frets: " + numberOfFrets);
    }
    public void setNumberOfPickups() {
        System.out.println("Pickups: " + numberOfPickups);
    }
    public void setActivePickups() {
        if (activePickups == true) {
            System.out.println("Type: Active");
        } else {
            System.out.println("Type: Passive");
        }
    }
}
