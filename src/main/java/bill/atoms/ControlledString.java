package bill.atoms;

public interface ControlledString {



    /**
     * @param arg value to set
     * @throws IllegalArgumentException
     * */
    public void write(String arg) throws IllegalArgumentException;


    /**
     * @return String value of instance
     * */
    public String read();

}
