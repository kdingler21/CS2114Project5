package project5;

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

    public Influencer() {
        this.nextNode = null;
    }


    public Influencer(Influencer next) {
        this.nextNode = next;
    }


    public void setNext(Influencer next) {
        this.nextNode = next;
    }


    public Influencer getNext() {
        return nextNode;
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
        int view) {
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


    public String getMonth() {
        return month;
    }


    public String getUserName() {
        return username;
    }


    public String getChannelName() {
        return channelName;
    }


    public String getCountry() {
        return country;
    }


    public String getTopic() {
        return topic;
    }


    public int getLikes() {
        return likes;
    }


    public int getPosts() {
        return posts;
    }


    public int getFollowers() {
        return followers;
    }


    public int getComments() {
        return comments;
    }


    public int getViews() {
        return views;
    }
    
    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public void setPosts(int posts) {
        this.posts = posts;
    }
    
    public void setFollowers(int followers) {
        this.followers = followers;
    }
    
    public void setComments(int comments) {
        this.comments = comments;
    }
    
    public void setViews(int views) {
        this.views = views;
    }
}
