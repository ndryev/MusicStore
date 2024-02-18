public class Drums extends Instrument{
    // EXTENDED ATTRIBUTES
    String cymbals;
    String snare;
    String bassDrum;
    String hiHats;
    String toms;
    boolean sticks;
    // EXTENDED CONSTRUCTOR
    public Drums(String type, String brand, String model, int price, String cymbals, String snare, String bassDrum, String hiHats, String toms, boolean sticks, boolean condition) {
        super(type, brand, model, price, condition);
        // EXTENDED ATTRIBUTES WITH FIELDS ASSIGNED TO OBJECTS
        this.cymbals = cymbals;
        this.snare = snare;
        this.bassDrum = bassDrum;
        this.hiHats = hiHats;
        this.toms = toms;
        this.sticks = sticks;
    }
    // EXTENDED METHODS
    public void setCymbals(){
        System.out.println("Cymbals: "+cymbals);
    }
    public void setSnare(){
        System.out.println("Snare: "+snare);
    }
    public void setBassDrum(){
        System.out.println("Bass drum: "+bassDrum);
    }
    public void setHiHats(){
        System.out.println("HiHats: "+hiHats);
    }
    public void setToms(){
        System.out.println("Toms: "+toms);
    }
    public void sticks(){
        if (sticks == true)
            System.out.println("Sticks: included");
        else {
            System.out.println("Sticks: not included");
        }
    }
}