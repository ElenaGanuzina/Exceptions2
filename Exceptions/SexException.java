package Exceptions;
public class SexException extends DataParsingException {
    public SexException(){
        super("Gender is specified incorrectly.");
    }

    public SexException(String message){
        super(message);
    }
}
