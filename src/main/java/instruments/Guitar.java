package instruments;

public class Guitar extends Instrument{
    private int strings;

    public Guitar(String manufacturer, String model, InstrumentTypes instrumentType, String colour, int buyPrice, int sellPrice, int strings) {
        super(manufacturer, model, instrumentType, colour, buyPrice, sellPrice);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public String play() {
        return "Bwang!";
    }
}
