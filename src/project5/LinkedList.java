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
    
    public void add(Influencer added) {
        Influencer current = firstNode;
        int count = 0;
        while (current != null && count < size) {
            if (current.getNext() == null && count == size-1) {
                current.setNext(added);
            }
            
            current = current.getNext();
            count++;
        }
    }
    
    public Influencer remove() {
        Influencer current = firstNode;
        Influencer node = null;
        mainLoop: while (current != null) {
            if (current.getNext() != null) {
                if (current.getNext().getNext() == null) {
                    node = current.getNext();
                    current.setNext(null);
                    break mainLoop;
                }
            }
            
            current = current.getNext();
        }
        return node;
    }
    
    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            
        }
        return output;
    }
}
