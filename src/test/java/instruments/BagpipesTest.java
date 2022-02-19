package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagpipesTest {

    Bagpipes bagpipes;

    @Before
    public void before(){
        bagpipes = new Bagpipes("Kilberry", "Vintage Style", InstrumentTypes.WOODWIND, "Tartan", 50000, 95000, 4);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Kilberry", bagpipes.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("Vintage Style", bagpipes.getModel());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentTypes.WOODWIND, bagpipes.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Tartan", bagpipes.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(50000, bagpipes.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(95000, bagpipes.getSellPrice());
    }

    @Test
    public void hasReeds(){
        assertEquals(4, bagpipes.getReeds());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(45000, bagpipes.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("Skirl!", bagpipes.play());
    }
}
