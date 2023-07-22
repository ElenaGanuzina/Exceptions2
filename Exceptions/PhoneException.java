package Exceptions;

public class PhoneException extends DataParsingException {
    public PhoneException(){
        super("Incorrect phone number format.");
    }

    public PhoneException(String message){
        super(message);
    }
}
