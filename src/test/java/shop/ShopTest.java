package shop;

import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Bagpipes bagpipes;
    DrumKit drumkit;
    Guitar guitar;
    Instrument triangle;
    Item strings;
    Item sheetMusic;
    Item drumSticks;
    Shop shop;

    @Before
    public void before() {
    bagpipes = new Bagpipes("Kilberry", "Vintage Style",InstrumentTypes.WOODWIND, "Tartan", 50000, 95000, 4);
    drumkit = new DrumKit("Yamaha", "Stage Custom", InstrumentTypes.PERCUSSION, "Red", 66000, 92840, 5, 3);
    guitar = new Guitar("Fender", "Stratocaster", InstrumentTypes.STRING, "Ultraburst", 150000, 214900, 6);
    triangle = new Instrument("Sabian", "HH", InstrumentTypes.PERCUSSION, "Bronze", 4000, 9500);
    strings = new Item("Guitar strings", 500, 899);
    sheetMusic = new Item("Sheet music", 150, 445);
    drumSticks = new Item("Drum sticks", 199, 499);
    shop = new Shop("Music R us");
    }

    @Test
    public void hasName(){
        assertEquals("Music R us", shop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddISellToStock(){
        shop.addItem(bagpipes);
        shop.addItem(triangle);
        shop.addItem(strings);
        assertEquals(3, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItem(drumkit);
        shop.addItem(sheetMusic);
        shop.removeItem(drumkit);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.addItem(bagpipes);
        shop.addItem(drumkit);
        shop.addItem(guitar);
        shop.addItem(triangle);
        shop.addItem(strings);
        shop.addItem(sheetMusic);
        shop.addItem(drumSticks);
        assertEquals(143234, shop.calculateTotalProfit());
    }
}
