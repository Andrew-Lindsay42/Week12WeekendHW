package instruments;

public class Bagpipes extends Instrument{
    private int reeds;

    public Bagpipes(String manufacturer, String model, InstrumentTypes instrumentType, String colour, int buyPrice, int sellPrice, int reeds) {
        super(manufacturer, model, instrumentType, colour, buyPrice, sellPrice);
        this.reeds = reeds;
    }

    public int getReeds() {
        return reeds;
    }

    public String play() {
        return "Skirl!";
    }
}
