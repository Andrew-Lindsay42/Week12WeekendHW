package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumkit;

    @Before
    public void before(){
        drumkit = new DrumKit("Yamaha", "Stage Custom", InstrumentTypes.PERCUSSION, "Red", 66000, 92840, 5, 3);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Yamaha", drumkit.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("Stage Custom", drumkit.getModel());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentTypes.PERCUSSION, drumkit.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", drumkit.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(66000, drumkit.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(92840, drumkit.getSellPrice());
    }

    @Test
    public void hasDrums(){
        assertEquals(5, drumkit.getDrums());
    }

    @Test
    public void hasCymbals(){
        assertEquals(3, drumkit.getCymbals());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(26840, drumkit.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("Badum tsh!", drumkit.play());
    }
}
