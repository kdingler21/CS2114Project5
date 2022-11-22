package prj5;

import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 * Input class, project runner
 * 
 * @author Mike Ferrante, Katie Dingler, Sushen Kolakaketi
 * @version 11/19/22
 */
public class Input {
    /**
     * Main Run Method
     * 
     * @throws FileNotFoundException
     */
    public static void main(String[] args)
        throws FileNotFoundException {
        String inputFile = "SampleInput1_2022.csv";
        if (args.length > 0) {
            inputFile = args[0];
        }

        FileHandler handler = new FileHandler();
        Sorter sorter = new Sorter();
        
        LinkedList list = handler.readFile(inputFile);      
        LinkedList sorted = sorter.sortChannels(list);
        

        Influencer[] sortedAlphabet = sorter.sortByChannelName(sorted);
        Influencer[] sortedEngagement = sorter.sortByReachEngagementRate(
            sorted);

        for (int i = 0; i < sortedAlphabet.length; i++) {
            if (sortedAlphabet[i] != null) {
                System.out.println(sortedAlphabet[i].getChannelName());
                System.out.println("traditional: " + sortedAlphabet[i]
                    .getTraditionalEngagementRate());
                System.out.println("==========");
            }
        }
        System.out.println("**********");
        System.out.println("**********");
        for (int i = 0; i < sortedEngagement.length; i++) {
            if (sortedEngagement[i] != null) {
                System.out.println(sortedEngagement[i].getChannelName());
                System.out.println("reach: " + sortedEngagement[i]
                    .getReachEngagementRate());
                System.out.println("==========");
            }
        }
    }
}
