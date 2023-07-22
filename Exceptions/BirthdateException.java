package Exceptions;
public class BirthdateException extends DataParsingException{
    public BirthdateException(){
        super("Birthdate format is incorrect.");
    }

    public BirthdateException(String message){
        super(message);
    }
}