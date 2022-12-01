package prj5;

import student.TestCase;

/**
 * test class for the influencer
 * 
 * @author katiedingler
 * @version 11/19/22
 */ 
public class InfluencerTest extends TestCase {
    private Influencer influencer;
    private Influencer influencer2;

    /**
     * sets up test case
     */
    public void setUp() {
        influencer = new Influencer("January", "john", "john123", "US", "sports",
            10, 10, 10, 10, 20);
        influencer2 = new Influencer("February", "mike", "mike1", "US", "sports", 5,
            5, 5, 5, 4);
    }


    /**
     * tests all the getters
     */ 
    public void testGetters() {
        assertTrue(influencer.getUserName().equals("john"));
        assertTrue(influencer.getMonth().equals("January"));
        assertTrue(influencer.getChannelName().equals("john123"));
        assertTrue(influencer.getCountry().equals("US"));
        assertTrue(influencer.getTopic().equals("sports"));
        assertEquals(10, influencer.getLikes());
        assertEquals(10, influencer.getPosts());
        assertEquals(10, influencer.getFollowers());
        assertEquals(10, influencer.getComments());
        assertEquals(20, influencer.getViews());
    }


    /**
     * checks engagement rates
     */
    public void testGetEngagement() {
        assertEquals(influencer.getTotalEngagement(), 20, .01);
        assertEquals(influencer.getTraditionalEngagementRate(), 200, .01);
        assertEquals(influencer.getReachEngagementRate(), 100, .01);
    }
    
}
