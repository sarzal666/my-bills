package bill.atoms;

public final class Title implements ControlledString,BillProperty {
    private final int MAX_LENGTH = 120; //MAX title length
    private final String PROP_NAME = "Title";

    private String title;


    public Title(String title) throws IllegalArgumentException {
        this.write(title);
    }

    public int getMaxTitleLength() {
        return MAX_LENGTH;
    }

    @Override
    public void write(String arg) throws IllegalArgumentException {
        if (arg.length() <= 0) {
            throw new IllegalArgumentException(this.getPropertyName() + " cannot be empty !");
        }

        if (arg.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(this.getPropertyName() + " is to long!");
        }

        this.title = arg;
    }

    public String read() {
        return this.title;
    }

    @Override
    public String getPropertyName() {
        return PROP_NAME;
    }
}
