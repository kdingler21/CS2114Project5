package prj5;
import student.TestCase;

/**
 * testing our sorters 
 * @author katiedingler
 * @version 11/19/22
 */
public class SorterTest extends TestCase {
    
    private Influencer influencer;
    private Influencer influencer2;
    private Influencer influencer3;
    private Influencer influencer4;
    private LinkedList list; 
    private Sorter sorter;
    
    /**
     * sets up the test 
     */
    public void setUp() {
        influencer = new Influencer("jan", "john", "john123", "US", "sports", 10, 10, 10, 10, 20); // 0.1
        influencer2 = new Influencer("feb", "mike", "mike1", "US", "sports", 5, 5, 5, 5, 4); // 0.25
        influencer3 = new Influencer("mar", "kev", "john123", "US", "sports", 20, 20, 20, 20, 5); // 0.8
        influencer4 = new Influencer("aug", "kyle", "mike1", "US", "sports", 15, 15, 15, 15, 14); //0.21
        
        list = new LinkedList(influencer); 
        list.add(influencer2);
        list.add(influencer3); 
        list.add(influencer4);
        
        sorter = new Sorter();

    }
    /**
     * checking if sort by reach works correctly 
     */
    public void testSortByReachEngagementRate() {
        assertEquals(sorter.sortByReachEngagementRate(list)[0], influencer);
        assertEquals(sorter.sortByReachEngagementRate(list)[1], influencer4);
        assertEquals(sorter.sortByReachEngagementRate(list)[2], influencer2);
        assertEquals(sorter.sortByReachEngagementRate(list)[3], influencer3);
        
    } 

}
