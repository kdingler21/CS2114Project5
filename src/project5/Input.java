package project5;

/**
 * Input class, project runner 
 * 
 */
 
public class Input {
    /**
     * Main Run Method
     */
    public static void main(String[] args) {
        String inputFile = "SampleInput1_2022.csv";
        if (args.length > 0) {
            inputFile = args[0];
        }
        
        FileHandler handler = new FileHandler();
        Sorter sorter = new Sorter();
        
        LinkedList list = handler.readFile(inputFile);
        LinkedList sorted = sorter.sortChannels(list);
        
        LinkedList sortedAlphabet = sorter.sortByChannelName(sorted);
        LinkedList sortedEngagement = sorter.sortByEngagementRate(sorted);
        
         while (sortedAlphabet.getFirstNode() != null && sortedAlphabet.next() != null)
        {
            Influencer curr = sortedAlphabet.getFirstNode(); 
            System.out.println(curr.getChannelName());
            System.out.println("traditional: " + curr.getTraditionalEngagementRate());
            System.out.println("==========");
        }
        System.out.println("**********");
        System.out.println("**********");
        for (int i = 0; i < sortedEngagement.length; i++)
        {
            if (sortedEngagement[i] != null)
            {
                System.out.println(sortedEngagement[i].getChannelName());
                System.out.println(sortedEngagement[i].getTraditionalEngagementRate());
                System.out.println("==========");               
            }
        }
    }
}
