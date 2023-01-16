import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20);
    }

    @Test
    public void hasNumberOfSheets(){
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void canPrint(){
        printer.print(2, 3);
        assertEquals(14, printer.getSheets());
    }

    public void cannotPrint(){
        printer.setSheets(1);
        printer.print(2, 2);
        assertEquals(1, printer.getSheets());
    }


}
