package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Stratocaster", InstrumentTypes.STRING, "Ultraburst", 150000, 214900, 6);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Fender", guitar.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentTypes.STRING, guitar.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Ultraburst", guitar.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(150000, guitar.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(214900, guitar.getSellPrice());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(64900, guitar.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("Bwang!", guitar.play());
    }
}
