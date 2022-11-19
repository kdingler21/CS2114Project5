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


    public Influencer getFirstNode() {
        return this.firstNode;
    }

    
    public int getSize() {
        return this.size;
    }

    public Influencer findName(String name) {
        Influencer current = this.firstNode;
        int count = 0;
        while (current != null && count < this.size) {
            if (current.getChannelName() == name) {
                return current;
            }
            
            count++;
            current = current.getNext();
        }
        return null;
    }
    
    public void add(Influencer added) {
        if (this.firstNode != null) {
            Influencer current = this.firstNode;
            int count = 0;
            while (current != null && count < this.size) {
                if (current.getNext() == null && count == this.size - 1) {
                    current.setNext(added);
                }

                current = current.getNext();
                count++;
            }
        }

        else {
            this.firstNode.setNext(added);
        }
        this.size++;
    }

    public Influencer remove() {
        Influencer node = null;
        if (this.firstNode != null && this.firstNode.getNext() != null) {
            Influencer current = this.firstNode;
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
        }
        
        else {
            node = this.firstNode;
            this.firstNode = null;
        }
        this.size--;
        return node;
    }
    
    /**
     * converts linked list to an array
     * @return
     *        linked list as an array
     */
    public Influencer[] toArray() {
        
        Influencer[] newArray = new Influencer[size];
        Influencer node = this.getFirstNode();
        
        int i = 0;
        while(node != null) {
            newArray[i] = node;
            node = node.getNext();
            i++;
        }

        return newArray;  
    }
}
