package project5;

public class Sorter {
    
    public Sorter() {
        //Do Nothing...
    }
    
    /**
     * sorts list alphabetical order by channel name
     * @return 
     */
    public LinkedList sortByChannelName(LinkedList list){
        return null;
    }
    
    /**
     * sorts 
     * @return
     */
    public LinkedList sortByEngagementRate(LinkedList list){
        return null;
    }
    
    /**
     * calculates engagement rate using traditional engagement rate formula
     * 
     * @return engagement rates array
     *                  engagement rate
     */
    public double[] getEngagementRates(LinkedList list) {
        double array[] = new double[list.getSize()];
        Influencer current = list.getFirstNode();
        int count = 0;
        while (current != null && count < array.length) {
            double totalEngagement = current.getComments() + current.getLikes();
            double engagementRate = (totalEngagement / current.getFollowers()) * 0.1;
            array[count] = engagementRate;
            
            count++;
            current = current.getNext();
        }
        return array;
    }
    
    /**
     * gets total engagement
     * 
     * @return engagement array
     *                   total engagement
     */
    public double[] getTotalEngagement(LinkedList list) {
        double array[] = new double[list.getSize()];
        Influencer current = list.getFirstNode();
        int count = 0;
        while (current != null && count < array.length) {
            double totalEngagement = current.getComments() + current.getLikes();
            array[count] = totalEngagement;
            
            count++;
            current = current.getNext();
        }
        return array;
    }
    
    /**
     * gets total number of followers
     * 
     * @return followers array
     *                  total followers
     */
    public double[] getTotalFollowers(LinkedList list) {
        double array[] = new double[list.getSize()];
        Influencer current = list.getFirstNode();
        int count = 0;
        while (current != null && count < array.length) {
            array[count] = current.getFollowers();
            
            count++;
            current = current.getNext();
        }
        return array;
    }
}