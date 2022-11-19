package project5;

public class Sorter {
    
    private LinkedList list;
    private double engagementRate;
    private int totalEngagement;
    private int totalFollowers;
    private int numComments;
    private int numLikes;
    
    public Sorter() {
        
        totalEngagement = numComments + numLikes;
        engagementRate = (totalEngagement / totalFollowers) * 0.1;
    }
    
    /**
     * sorts list alphabetical order by channel name
     * @return 
     */
    public LinkedList sortByChannelName(){
        return null;
    }
    
    /**
     * sorts 
     * @return
     */
    public LinkedList sortByEngagementRate(){
        return null;
    }
    
    /**
     * calculates engagement rate using traditional engagement rate formula
     * 
     * @return
     *        engagement rate
     */
    public double getEngagementRate() {
        return engagementRate;
    }
    
    /**
     * gets total engagement
     * 
     * @return engagement
     *                   total engagement
     */
    public int getTotalEngagement() {
        return totalEngagement;
    }
    
    /**
     * gets total number of followers
     * @return
     */
    public int getTotalFollowers() {
        return totalFollowers;
    }
    
    

}
