package project5;


public class Sorter{

    public Sorter() {
        // Do Nothing...
    }


    /**
     * sorts channel data
     * 
     * @return LinkedList
     *         sorted list
     */
    public LinkedList sortChannels(LinkedList list) {
        LinkedList sorted = new LinkedList();
        Influencer current = list.getFirstNode();
        int count = 0;
        while (current != null && count < list.getSize()) {
            Influencer found = sorted.findName(current.getChannelName());
            if (found != null) {
                found.setLikes(found.getLikes() + current.getLikes());
                found.setPosts(found.getPosts() + current.getPosts());
                found.setFollowers(found.getFollowers() + current
                    .getFollowers());
                found.setComments(found.getComments() + current.getComments());
                found.setViews(found.getViews() + current.getViews());
            }

            else {
                sorted.add(current);
            }

            count++;
            current = current.getNext();
        } 
        return sorted;
    }


    /**
     * sorts list alphabetical order by channel name
     * 
     * @return LinkedList
     *         sorted list
     */
    public LinkedList sortByChannelName(LinkedList list) {
        Influencer[] arr = list.toArray();
        
        
        
        return null;
    }


    /**
     * sorts list by traditional engagement rate
     * @param list
     *            
     * @return LinkedList
     *         sorted list
     */
    public Influencer[] sortByTraditioanlEngagementRate(LinkedList list) {
        Influencer[] arr = list.toArray();
        int size = arr.length;
        
        for(int i = 1; i < size; i++) {
            Influencer key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j].getTraditionalEngagementRate() > key.getTraditionalEngagementRate()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
   
        return arr;
    }
    
    /**
     * sorts list by reach engagement rate
     * @param list
     * @return
     */
    public Influencer[] sortByReachEngagementRate(LinkedList list) {
        Influencer[] arr = list.toArray();
        int size = arr.length;
        
        for(int i = 1; i < size; i++) {
            Influencer key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j].getReachEngagementRate() > key.getReachEngagementRate()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
   
        return arr;
    }

//    @Override
//    public int compareTo(Object obj) 
//    {
//        if (obj != null)
//        {
//            Influencer other = ((Influencer)obj);
//        }
//        
//        return 0;
//    }
}
