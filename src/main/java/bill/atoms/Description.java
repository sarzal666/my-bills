package bill.atoms;

import bill.atoms.Interfaces.BillProperty;
import bill.atoms.Interfaces.ControlledString;

public class Description implements ControlledString, BillProperty {
    private final int MAX_LENGTH = 1024; //MAX title length
    private final String PROP_NAME = "Description";

    private String description;

    public Description(String description) throws IllegalArgumentException {
        this.write(description);
    }

    @Override
    public String getPropertyName() {
        return PROP_NAME;
    }

    @Override
    public void write(String arg) throws IllegalArgumentException {
        if (arg.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(this.getPropertyName() + " is to long!");
        }

        this.description = arg;
    }

    @Override
    public String read() {
        return this.description;
    }
}
