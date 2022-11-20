package project5;

/**
 * Linked list class
 * @author Mike Ferrante, Katie Dingler, Sushen Kolakaketi
 * @version 11/19/22
 */
public class LinkedList {
    private Influencer firstNode;
    private Influencer nextNode;
    private int size;

    /**
     * dafault constructor 
     */
    public LinkedList() {
        this.firstNode = null;
        this.nextNode = null;
        this.size = 0;
    }

    /**
     * has parameter constructor
     * @param first in the list
     */
    public LinkedList(Influencer first) {
        this.firstNode = first;
        this.size++;
    }

    /**
     * gets the first influencer 
     * @return
     */
    public Influencer getFirstNode() {
        return this.firstNode;
    }
    /**
     * Sets the node after this node
     *
     * @param n
     *            the node after this one
     */
    public void setNext(Influencer n) {
        nextNode = n;
    }

    /**
     * Gets the next node
     *
     * @return the next node
     */
    public Influencer next() {
        return nextNode;
    }

    /**
     * gets size 
     * @return the size of the list 
     */
    public int getSize() {
        return this.size;
    }
    /**
     * finds the influencer w the given name 
     * @param name being found
     * @return infleuncer with that name 
     */
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
    /**
     * adds infleuncer 
     * @param added infleuncer wanting to be added 
     */
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

    /**
     * removes specific influencer 
     * @return 
     */
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
