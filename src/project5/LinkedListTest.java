package project5;
import student.TestCase;
/**
 * testing the linked list 
 * @author katiedingler
 * @version
 */
public class LinkedListTest extends TestCase
{
    private LinkedList listDefault;
    private LinkedList list;
    private Influencer influencer;
    private Influencer influencer2;
    private Influencer influencer3;
    private Influencer influencer4;
    
    /**
     * sets up the test method
     */
    public void setUp()
    {
        influencer = new Influencer("jan", "john", "john123", "US", "sports", 10, 10, 10, 10, 20); 
        influencer2 = new Influencer("feb", "mike", "mike1", "US", "sports", 5, 5, 5, 5, 4); 
        influencer3 = new Influencer("mar", "kev", "john123", "US", "sports", 20, 20, 20, 20, 5); 
        influencer4 = new Influencer("aug", "kyle", "mike1", "US", "sports", 15, 15, 15, 15, 14);
        
        listDefault = new LinkedList();
        listDefault.add(influencer);
        listDefault.add(influencer2);
        listDefault.add(influencer3);
        
        list = new LinkedList(influencer);
        list.add(influencer2);
        list.add(influencer3);        
    }
    /**
     * getting the first node
     */
    public void testGetFirstNode()
    {
        assertEquals(listDefault.getFirstNode(), influencer);
        assertEquals(list.getFirstNode(), influencer);
    }
    /** 
     * testing get and set the second 
     */
    public void testNext()
    {
        assertEquals(list.getFirstNode(), influencer);
        listDefault.setNext(influencer2);
        assertEquals(listDefault.next(), influencer2);
    }
    /**
     * get size 
     */
    public void testGetSize()
    {
        assertEquals(listDefault.getSize(), 3);
    }
}
