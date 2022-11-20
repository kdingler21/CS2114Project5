package prj5;

/**
 * Influencer class
 * @author Mike Ferrante, Katie Dingler, Sushen Kolakaketi
 * @version 11.19.2022
 * 
 */
public class Influencer {
    private Influencer nextNode;
    private String month;
    private String username;
    private String channelName;
    private String country;
    private String topic;
    private int likes;
    private int posts;
    private int followers;
    private int comments;
    private int views;

    /**
     * constructor, sets next node to null
     */
    public Influencer() {
        this.nextNode = null;
    }


    /**
     * constructor sets next node to next influencer
     * 
     * @param next
     *            new influencer to be set next
     */
    public Influencer(Influencer next) {
        this.nextNode = next;
    }


    /**
     * sets next node to new influencer
     * 
     * @param next
     *            new influencer
     */
    public void setNext(Influencer next) {
        this.nextNode = next;
    }


    /**
     * getter method, gets next node
     * 
     * @return nextNode
     *         next node in LinkedList
     * 
     */
    public Influencer getNext() {
        return nextNode;
    }


    /**
     * gets influencers total engagement by adding comments and likes
     * 
     * @return
     *         the total engagement
     */
    public double getTotalEngagement() {
        return (this.comments + this.likes);
    }


    /**
     * gets engagement rate using traditional formula
     * 
     * @return
     *         engagement rate
     */
    public double getTraditionalEngagementRate() {
        return ((this.getTotalEngagement() / this.followers) * 0.1);
    }


    /**
     * gets engagement rate using reach formula
     * 
     * @return
     *         engagement rate
     */
    public double getReachEngagementRate() {
        return ((this.getTotalEngagement() / this.views) * 0.1);
    }


    /**
     * sets up each individual influencer
     * 
     * @param mon
     *            month
     * @param user
     *            username
     * @param chanName
     *            channel Name
     * @param count
     *            country location
     * @param top
     *            topic of user
     * @param lik
     *            likes
     * @param post
     *            amount of posts
     * @param follow
     *            follower count
     * @param comm
     *            comment count
     * @param view
     *            views received
     */
    public Influencer(
        String mon,
        String user,
        String chanName,
        String count,
        String top,
        int lik,
        int post,
        int follow,
        int comm,
        int view) 
    {
        this.month = mon;
        this.username = user;
        this.channelName = chanName;
        this.country = count;
        this.topic = top;
        this.likes = lik;
        this.posts = post;
        this.followers = follow;
        this.comments = comm;
        this.views = view;
    }


    /**
     * getter method, gets month
     * 
     * @return
     *         month
     */
    public String getMonth() {
        return month;
    }


    /**
     * getter method, gets user name
     * 
     * @return
     *         username
     */
    public String getUserName() {
        return username;
    }


    /**
     * getter method, gets channel name
     * 
     * @return
     *         channelName
     */
    public String getChannelName() {
        return channelName;
    }


    /**
     * getter method, gets country
     * 
     * @return
     *         country
     */
    public String getCountry() {
        return country;
    }


    /**
     * getter method, gets topic
     * 
     * @return
     *         topic
     */
    public String getTopic() {
        return topic;
    }


    /**
     * getter method, gets likes
     * 
     * @return
     *         likes
     */
    public int getLikes() {
        return likes;
    }


    /**
     * getter method, gets posts
     * 
     * @return
     *         posts
     */
    public int getPosts() {
        return posts;
    }


    /**
     * getter method, gets followers
     * 
     * @return
     *         followers
     */
    public int getFollowers() {
        return followers;
    }


    /**
     * getter method, gets comments
     * 
     * @return
     *         comments
     */
    public int getComments() {
        return comments;
    }


    /**
     * getter method, gets views
     * 
     * @return
     */
    public int getViews() {
        return views;
    }


    /**
     * sets likes
     * 
     * @param likes
     *            new value
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }


    /**
     * sets posts
     * 
     * @param posts
     *            new value
     */
    public void setPosts(int posts) {
        this.posts = posts;
    }


    /**
     * sets followers
     * 
     * @param followers
     *            new value
     */
    public void setFollowers(int followers) {
        this.followers = followers;
    }


    /**
     * sets comments
     * 
     * @param comments
     *            new value
     */
    public void setComments(int comments) {
        this.comments = comments;
    }


    /**
     * sets views
     * 
     * @param views
     *            new value
     */
    public void setViews(int views) {
        this.views = views;
    }
}