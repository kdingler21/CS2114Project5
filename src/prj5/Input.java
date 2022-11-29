package prj5;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
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
      //  LinkedList sorted = sorter.sortChannels(list);
//        Influencer[] influencers = list.toArray();
//        LinkedList JanuaryData = new LinkedList();
//        LinkedList FebruaryData = new LinkedList();
//        LinkedList MarchData = new LinkedList();
//        
//        for (int i = 0; i < influencers.length; i++)
//        {
//            if (influencers[i].getMonth().equals("January"))
//            {
//                JanuaryData.add(influencers[i]);
//            }
//            if (influencers[i].getMonth().equals("February"))
//            {
//                FebruaryData.add(influencers[i]);
//            }
//            if (influencers[i].getMonth().equals("March"))
//            {
//                MarchData.add(influencers[i]);
//            }
//        }
         
       
        Influencer[] sortedAlphabet = sorter.sortByChannelName(list);
        Influencer[] sortedEngagement = sorter.sortByReachEngagementRate(list);
        
        DecimalFormat deci = new DecimalFormat("#.#");
        
        for (int i = 0; i < sortedAlphabet.length; i++) 
        {
            if (sortedAlphabet[i] != null) 
            {
                System.out.println(sortedAlphabet[i].getChannelName());
                if (sortedAlphabet[i].getFollowers() == 0)
                {
                    System.out.println("traditional: N/A");
                    
                }
                else
                {
                System.out.println("traditional: " + deci.format(sortedAlphabet[i]
                    .getTraditionalEngagementRate()));
                }
                System.out.println("==========");
            }
        }
        System.out.println("**********");
        System.out.println("**********");
        for (int i = 0; i < sortedEngagement.length; i++) {
            if (sortedEngagement[i] != null) {
                System.out.println(sortedEngagement[i].getChannelName());
                if (sortedEngagement[i].getViews() == 0)
                {
                    System.out.println("reach: N/A");
                }
                else 
                {
                System.out.println("reach: " + deci.format(sortedEngagement[i]
                    .getReachEngagementRate())); 
                }
                System.out.println("==========");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < sortedAlphabet.length; i++) 
        {
            if (sortedAlphabet[i] != null) 
            {
                System.out.println(sortedAlphabet[i].getChannelName());
                if (sortedAlphabet[i].getJanFollowers() == 0)
                {
                    System.out.println("traditional: N/A");
                    
                }
                else
                {
                System.out.println("traditional: " + deci.format(sortedAlphabet[i]
                    .getJanTradEngagementRate()));
                }
                System.out.println("==========");
            }
        }
        System.out.println("**********");
        System.out.println("**********");
        for (int i = 0; i < sortedEngagement.length; i++) {
            if (sortedEngagement[i] != null) {
                System.out.println(sortedEngagement[i].getChannelName());
                if (sortedEngagement[i].getJanViews() == 0)
                {
                    System.out.println("reach: N/A");                   
                }
                else 
                {
                System.out.println("reach: " + deci.format(sortedEngagement[i]
                    .getJanReachEngagementRate())); 
                }
                System.out.println("==========");
            }
        } 
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < sortedAlphabet.length; i++) 
        {
            if (sortedAlphabet[i] != null) 
            {
                System.out.println(sortedAlphabet[i].getChannelName());
                if (sortedAlphabet[i].getFebFollowers() == 0)
                {
                    System.out.println("traditional: N/A");
                }
                else
                {
                System.out.println("traditional: " + deci.format(sortedAlphabet[i]
                    .getFebTradEngagementRate()));
                }
                System.out.println("==========");
            }
        }
        System.out.println("**********");
        System.out.println("**********");
        for (int i = 0; i < sortedEngagement.length; i++) {
            if (sortedEngagement[i] != null) {
                System.out.println(sortedEngagement[i].getChannelName());
                if (sortedEngagement[i].getFebViews() == 0)
                {
                    System.out.println("reach: N/A");
                    
                }
                else 
                {
                System.out.println("reach: " + deci.format(sortedEngagement[i]
                    .getFebReachEngagementRate())); 
                }
                System.out.println("==========");
            }
            
        }    
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        for (int i = 0; i < sortedAlphabet.length; i++) 
        {
            if (sortedAlphabet[i] != null) 
            {
                System.out.println(sortedAlphabet[i].getChannelName());
                if (sortedAlphabet[i].getMarchFollowers() == 0)
                {
                    System.out.println("traditional: N/A");
                    System.out.println("text");
                }
                else
                {
                System.out.println("traditional: " + deci.format(sortedAlphabet[i]
                    .getMarchTradEngagementRate()));
                }
                System.out.println("==========");
            }
        }
        System.out.println("**********");
        System.out.println("**********");
        for (int i = 0; i < sortedEngagement.length; i++) {
            if (sortedEngagement[i] != null) {
                System.out.println(sortedEngagement[i].getChannelName());
                if (sortedEngagement[i].getMarchViews() == 0)
                {
                    System.out.println("reach: N/A");
                }
                else 
                {
                System.out.println("reach: " + deci.format(sortedEngagement[i] 
                    .getMarchReachEngagementRate())); 
                }
                System.out.println("==========");
            }
        } 
        
    }
}
