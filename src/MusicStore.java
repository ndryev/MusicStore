public class MusicStore {
    // MAIN CLASS, GOES LINE-BY-LINE
    public static void main(String[] args) {
        // CREATED OBJECTS AND PASS IN/ASSIGN VALUES
        Instrument drums = new Drums("Drums", "Tama", "Funk", 750, "DW", "SSL", "Yamaha","Yamaha", "Tama", true, true);
        Instrument keys = new Keys("Keys", "Rhodes", "Analogue", 2040, 2, false, false);
        Instrument bass = new Basses("Bass", "Ibanez", "Caveman", 850, "Neck-through", "Standard", "Metallic", "Ash", "Volume, Tone", 4, 20, 2, true, false);
        // NOTE: PUT "Guitars" AS THE TYPE TO ACCESS THE EXTENDED ATTRIBUTES
        Guitars guitar = new Guitars("Guitar", "Gibson", "Les Paul", false, 3000, "Bolt-on", "Standard", "Black", "Mahogany", "Volume (2x), Tone (2x)", 6, 22, 2, true);
        // SAME FOR VIOLINS
        Violins violin = new Violins("Violin","","", 1000, true);

        // CALLED METHODS
        drums.setType();
        guitar.setType();

        moveInstruments(guitar);
        moveInstruments(drums);
    }
    // POLYMORPHISM EXAMPLE: THE PARAMETER "Instrument" IS A PARENT TYPE
    // SO ALL SUBCLASSES CAN ALSO PASS IN THROUGH THE SAME METHOD
    public static void moveInstruments(Instrument instrument){
        instrument.move();
    }
}