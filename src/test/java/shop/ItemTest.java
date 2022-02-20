package shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("Guitar strings", 500, 899);
    }

    @Test
    public void hasDescription(){
        assertEquals("Guitar strings", item.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(500, item.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(899, item.getSellPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(499, item.calculateMarkup());
    }
}
