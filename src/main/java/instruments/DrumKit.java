package instruments;

public class DrumKit extends Instrument{

    private int drums;
    private int cymbals;

    public DrumKit(String manufacturer, String model, InstrumentTypes instrumentType, String colour, int buyPrice, int sellPrice, int drums, int cymbals) {
        super(manufacturer, model, instrumentType, colour, buyPrice, sellPrice);
        this.drums = drums;
        this.cymbals = cymbals;
    }

    public int getDrums() {
        return drums;
    }

    public int getCymbals() {
        return cymbals;
    }

    public String play() {
        return "Badum tsh!";
    }
}
