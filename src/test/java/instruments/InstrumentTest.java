package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument triangle;

    @Before
    public void before(){
        triangle = new Instrument("Sabian", "HH", InstrumentTypes.PERCUSSION, "Bronze", 4000, 9500);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Sabian", triangle.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("HH", triangle.getModel());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentTypes.PERCUSSION, triangle.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Bronze", triangle.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(4000, triangle.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(9500, triangle.getSellPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5500, triangle.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("Ting!", triangle.play());
    }
}
