import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void startsFull(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFill(){
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }


}
