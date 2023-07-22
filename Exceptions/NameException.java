package Exceptions;

public class NameException extends DataParsingException{
    public NameException(){
        super("Incorrect name format.");
    }

    public NameException(String message){
        super(message);
    }
}
