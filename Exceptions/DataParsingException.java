package Exceptions;
public class DataParsingException extends RuntimeException{
    public DataParsingException(){
        super("Data not recognized or has wrong format.");
    }

    public DataParsingException(String message){
        super(message);
    }
}
