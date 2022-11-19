package project5;

public class Sorter {
    
    private LinkedList list;
    private int totalEngagement;
    private int totalFollowers;
    private int numComments;
    private int numLikes;
    
    public Sorter() {
        
        totalEngagement = numComments + numLikes;
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
        return (totalEngagement / totalFollowers) * 0.1;
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
