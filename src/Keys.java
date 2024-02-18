public class Keys extends Instrument{
    //EXTENDED ATTRIBUTES
    int octaves;
    boolean usb;
    // EXTENDED CONSTRUCTOR
    public Keys(String type, String brand, String model, int price, int octaves, boolean usb, boolean condition) {
        super(type, brand, model, price, condition);
        // EXTENDED ATTRIBUTES WITH FIELDS ASSIGNED TO OBJECTS
        this.octaves = octaves;
        this.usb = usb;
    }
    // EXTENDED METHODS
    public void setOctaves(){
        System.out.println("Octaves: "+octaves);
    }
    public void setUsb() {
        if (usb == true) {
            System.out.println("Supports USB");
        } else {
            return;
        }
    }
}
