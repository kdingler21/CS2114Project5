package project5;

public class LinkedList {
    private Influencer firstNode;
    private int size;
    
    public LinkedList() {
        this.firstNode = null;
        this.size = 0;
    }
    
    public LinkedList(Influencer first) {
        this.firstNode = first;
        this.size++;
    }
}
