package bill;

import bill.atoms.Title;

import java.math.BigDecimal;

public class Bill {

    private Title title; // name of Bill
    private String description;
    private String category; // Bill Category => new class
    private String tags; // Tags attached to Bill
    private String priority; // Importance of Bill
    
    private BigDecimal amount;
    private String currency;

    
    /* CONSTRUCTORS */
    /**
     * Bill Must contains title, amount and currency
     * */

    public Bill(String title, String description, String category, String tags, String priority, BigDecimal amount, String currency) throws Exception {
        this.title = new Title(title);
        this.description = description;
        this.category = category;
        this.tags = tags;
        this.priority = priority;
        this.amount = amount;
        this.currency = currency;
    }


    
    
    
    public Bill(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Bill (String amount, String currency) {
        this.amount = new BigDecimal(amount);
        this.currency = currency;
    }

    /*
        The BigDecimal(String) constructor should always be preferred over BigDecimal(Double) because using BigDecimal(double)
        is unpredictable due to the inability of the double to represent 0.1 as exact 0.1.
        If double must be used for initializing a BigDecimal, use BigDecimal.valueOf(double),
         which converts the Double value to String using Double.toString(double) metho
    */
    public Bill(double amount, String currency) {
        this.amount = BigDecimal.valueOf(amount);
        this.currency = currency;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
