import bill.Bill;
import bill.atoms.Description;
import bill.atoms.Title;

import java.util.Currency;
import javax.money.*;

public class Main {
    public static void main(String[] args) {

        Bill electricity = new Bill("12.54","EUR");

        System.out.println("Amount: " + electricity.getAmount());
        System.out.println("Currency: " + electricity.getCurrency());

        Description desc = null;
        try {
            desc = new Description("Testing Description class");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        if (desc != null)
            System.out.println(desc.read());

        Title title = null;
        try {
            title = new Title("KUPSKO");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        if (title != null)
            System.out.println(title.read());

    }
}
