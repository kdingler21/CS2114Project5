package prj5;

import java.io.BufferedReader;
// import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// import java.io.FileReader;
// import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * File Handler Class
 * 
 * @author Mike Ferrante, Katie Dingler, Sushen Kolakaketi
 * @version 11/19/22
 */
public class FileHandler {
    /**
     * File Handler constructor
     */
    public FileHandler() {
        // Do Nothing...
    }


    /**
     * Linked List constructor w parameter
     * 
     * @param first
     *            influencer in the list
     * @return linked list
     * @throws FileNotFoundException
     * @throws ParseException
     */
    public LinkedList readFile(String fileName) {
        LinkedList list = new LinkedList();
  
        try {
            String line = "";
            String splitBy = ",";
            @SuppressWarnings("resource")
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String data[] = line.split(splitBy);

                String month = data[0];
                String username = data[1];
                String channelName = data[2];
                String country = data[3];
                String topic = data[4];
                int likes = Integer.parseInt(data[5]);
                int posts = Integer.parseInt(data[6]);
                int followers = Integer.parseInt(data[7]);
                int comments = Integer.parseInt(data[8]);
                int views = Integer.parseInt(data[9]);

               
                Influencer influencer = new Influencer(month, username, channelName, country,
                    topic, likes, posts, followers, comments, views);
                Influencer[] array = list.toArray();
                Boolean has = false;
                for (int i = 0; i < array.length; i++)
                {
                    if (array[i].getChannelName().equals(influencer.getChannelName()))
                    {
                        has = true;
                        array[i].setLikes((array[i].getLikes() + influencer.getLikes()));
                        array[i].setPosts((array[i].getPosts() + influencer.getPosts()));
                        array[i].setFollowers((array[i].getFollowers() + influencer.getFollowers()));
                        array[i].setComments((array[i].getComments() + influencer.getComments()));
                        array[i].setViews((array[i].getViews() + influencer.getViews()));
                    }
                }
                if (!has)
                {
                    list.add(influencer);
                }
                
                
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        return list; 
    }
}
