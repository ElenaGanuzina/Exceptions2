import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void writeData(Contact data) throws IOException{
        String fileName = data.getLastName() + ".txt";
        try(FileWriter fw = new FileWriter(fileName, true)){
            fw.write(data.toString() + '\n');
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
