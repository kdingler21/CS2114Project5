package project5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public FileHandler() {
        //Do Nothing...
    }
    
    public LinkedList readFile(String fileName) {
        LinkedList list = new LinkedList();
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {  
                String data[] = line.split(splitBy);
                list.add(new Influencer());
            }   
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
