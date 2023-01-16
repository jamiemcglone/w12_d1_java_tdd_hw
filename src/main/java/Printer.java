import javax.swing.*;

public class Printer {

    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void print(int pages, int copies){
        if (this.sheets >= pages * copies) {
            setSheets(this.sheets - (pages * copies));
        }
    }

}
