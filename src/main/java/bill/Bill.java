package bill;

import bill.atoms.Description;
import bill.atoms.Title;

import java.math.BigDecimal;

public class Bill {

    private Title title; // name of Bill
    private Description description;
    private String category; // Bill Category => new class
    private String tags; // Tags attached to Bill
    private String priority; // Importance of Bill
    
    private BigDecimal amount;
    private String currency;

    
    /* CONSTRUCTORS */
    /**
     * Bill Must contains title, amount and currency
     * */


}
