package project5;

public class Sorter {

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
        return null;
    }


    /**
     * sorts list by engagement rate
     * 
     * @return LinkedList
     *         sorted list
     */
    public LinkedList sortByEngagementRate(LinkedList list) {
        return null;
    }
}
