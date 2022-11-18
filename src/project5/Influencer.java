package project5;

public class Influencer {
    private Influencer nextNode;
    
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
}
