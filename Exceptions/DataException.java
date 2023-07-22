package Exceptions;
public class DataException extends DataParsingException{
    public DataException(){
        super("The number of values entered exceeds or is less than the number of fields required.");
    }

    public DataException(String message){
        super(message);
    }
}
