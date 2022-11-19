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

    
    public void add(Influencer added) {
        if (this.firstNode != null) {
            Influencer current = this.firstNode;
            int count = 0;
            while (current != null && count < size) {
                if (current.getNext() == null && count == size - 1) {
                    current.setNext(added);
                }

                current = current.getNext();
                count++;
            }
        }

        else {
            this.firstNode.setNext(added);
        }
        size++;
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
        size--;
        return node;
    }
}
