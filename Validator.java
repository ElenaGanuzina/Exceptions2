import java.time.Year;

import Exceptions.BirthdateException;
import Exceptions.DataParsingException;
import Exceptions.NameException;
import Exceptions.PhoneException;
import Exceptions.SexException;

public class Validator {
    public boolean checkName(String name) throws NameException{
        boolean flag = false;
        return flag;
    }

    public boolean checkBirthdate(String[] date) throws BirthdateException{
        boolean flag = true;
        if (Integer.parseInt(date[0]) < 0 || Integer.parseInt(date[0]) > 31 || 
            Integer.parseInt(date[1]) < 0 || Integer.parseInt(date[1]) > 12 ||
            Integer.parseInt(date[2]) < 0 || Integer.parseInt(date[2]) > Year.now().getValue()){
                flag = false;
                throw new BirthdateException();
                
            }
        return flag;
    }

    public boolean checkPhoneNumber(String data) throws PhoneException{
        boolean flag = false;
        try{
            int number = Integer.parseInt(data);
            try{
                if(number > 4 || number < 15){
                    flag = true;
                }
            }catch(PhoneException e){
                e.printStackTrace();
            }    
        }catch(DataParsingException e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean checkSex(String data) throws SexException{
        boolean flag = false;
        if (data.equalsIgnoreCase("m") || data.equalsIgnoreCase("f")){
            flag = true;
        }else{
            throw new SexException();
        }
        return flag;
    }


    
}



