import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import Exceptions.BirthdateException;
import Exceptions.DataException;
import Exceptions.PhoneException;
import Exceptions.SexException;

public class Program {
    public static void main(String[] args) throws IOException {
        
        Contact contact = new Contact();
        Reader reader = new Reader();
        Writer writer = new Writer();
        Validator validator = new Validator();
        String[] data = reader.readData();
        
        for (String item : data){
            if (item.length() == 1){
                try{
                    if(validator.checkSex(item) && contact.getSex().isEmpty()){
                        contact.setSex(item);;
                    }
                }catch(SexException e){
                    e.printStackTrace();
                }
            }else if(item.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")){
                String[] birthdate = item.split("\\.");
                try{
                    if(validator.checkBirthdate(birthdate)){
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                        contact.setBirthDate(LocalDate.parse(item, formatter));
                    }
                    
                }catch(BirthdateException e){
                    e.printStackTrace();
                }
                
            }else if(item.matches("[0-9]+")){
                try{
                    if(validator.checkPhoneNumber(item)){
                        contact.setPhoneNumber(Integer.parseInt(item));
                    }
                }catch(PhoneException e){
                    e.printStackTrace();
                }
                
            }else if(item.matches("[a-zA-Zа-яА-Я]+")){
                if (contact.getLastName().isEmpty()){
                    contact.setLastName(item);
                }else if (contact.getFirstName().isEmpty()){
                    contact.setFirstName(item);
                }else{
                    contact.setMiddleName(item);
                }

            }else{
                try{
                    throw new DataException();
                }catch(DataException e){
                    e.printStackTrace();
                }
            }
        }
               
        writer.writeData(contact);
    }
}
