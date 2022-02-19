package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Instrument implements IPlay, ISell {
    private String manufacturer;
    private String model;
    private InstrumentTypes instrumentType;
    private String colour;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String manufacturer, String model, InstrumentTypes instrumentType, String colour, int buyPrice, int sellPrice) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public InstrumentTypes getType() {
        return instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }

    @Override
    public String play() {
        return "Ting!";
    }
}
