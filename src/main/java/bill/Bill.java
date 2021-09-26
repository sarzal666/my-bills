package bill;

import java.math.BigDecimal;

public class Bill {

    private BigDecimal amount;
    private String currency;

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

}
