import java.util.Scanner;

import Exceptions.DataException;

public class Reader {
    public String[] readData() throws DataException{
        try (Scanner iScanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter personal data using space " +
                                   "(last name, first name, middle name, birthdate in dd.mm.yyyy format, " + 
                                   "phone number as an integer and sex in m/f format): ");
                String[] inputData = iScanner.nextLine().split(" ");
                if (inputData.length < 6){
                    throw new DataException("You've entered less data than is necessary.");
                }else if(inputData.length > 6){
                    throw new DataException("You've entered more data than is necessary.");
                }else{
                    return inputData;
                }
            }
        } 
    }
}
