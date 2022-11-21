package prj5;

//import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


/**
 * File Handler Class 
 * @author Mike Ferrante, Katie Dingler, Sushen Kolakaketi
 * @version 11/19/22
 */
public class FileHandler 
{
    /**
     * File Handler constructor 
     */
    public FileHandler() {
        //Do Nothing...
    }
   /**
     * Linked List constructor w parameter
     * @param first influencer in the list  
     * @return linked list 
 * @throws FileNotFoundException 
 * @throws ParseException 
     */
//    public LinkedList readFile(String fileName) {
//        LinkedList list = new LinkedList();
//        try {
//            String line = "";
//            String splitBy = ",";
//            BufferedReader br = new BufferedReader(new FileReader(fileName));
//            while ((line = br.readLine()) != null) {  
//                String data[] = line.split(splitBy);
//                
//                String month = data[0];
//                String username = data[1];
//                String channelName = data[2];
//                String country = data[3];
//                String topic = data[4];
//                int likes = Integer.parseInt(data[5]);
//                int posts = Integer.parseInt(data[6]);
//                int followers = Integer.parseInt(data[7]);
//                int comments = Integer.parseInt(data[8]);
//                int views = Integer.parseInt(data[9]);
//                
//                list.add(new Influencer(month, username, channelName, country, topic,
//                    likes, posts, followers, comments, views));
//            }   
//        }
//        
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
    public LinkedList readFile(String fileName) throws FileNotFoundException, ParseException 
    {
        LinkedList list = new LinkedList();
        Scanner file = new Scanner(new File(fileName));
        while (file.hasNextLine()) {
            String read = file.nextLine();
            Scanner currLine = new Scanner(read).useDelimiter(",\\s*");
            String tokens[] = new String[10];
            int tokenCount = 0;
            while (currLine.hasNext() && tokenCount < 10) {
                tokens[tokenCount++] = currLine.next();
            }
            currLine.close(); 
          String month = null;
          String username = null;
          String channelName = null;
          String country = null;
          String topic = null;
          int likes = 0;
          int posts = 0;
          int followers = 0;
          int comments = 0;
          int views = 0;
          if (tokenCount == 9) 
          {
                  month = tokens[0];
                  username = tokens[1];
                  channelName = tokens[2];
                  country = tokens[3];
                  topic = tokens[4];
                  likes = Integer.valueOf(tokens[1]);
                  posts = Integer.valueOf(tokens[2]);
                  comments = Integer.valueOf(tokens[3]); 
                  views = Integer.valueOf(tokens[4]);
                  
                  list.add(new Influencer(month, username, channelName, country, topic,
                      likes, posts, followers, comments, views));
                  
            }
            else {
                throw new java.text.ParseException("parse exception", 1);
            }
        }
        file.close();
        return list;
    }
}
