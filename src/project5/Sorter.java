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


    /**
     * calculates engagement rate using traditional engagement rate formula
     * 
     * @return engagement rates array
     *         engagement rate
     */
    public double[] getEngagementRates(LinkedList list) {
        double array[] = new double[list.getSize()];
        Influencer current = list.getFirstNode();
        int count = 0;
        while (current != null && count < array.length) {
            double totalEngagement = current.getComments() + current.getLikes();
            double engagementRate = (totalEngagement / current.getFollowers())
                * 0.1;
            array[count] = engagementRate;

            count++;
            current = current.getNext();
        }
        return array;
    }


    /**
     * gets total engagement
     * 
     * @return engagement array
     *         total engagement
     */
    public double[] getTotalEngagement(LinkedList list) {
        double array[] = new double[list.getSize()];
        Influencer current = list.getFirstNode();
        int count = 0;
        while (current != null && count < array.length) {
            double totalEngagement = current.getComments() + current.getLikes();
            array[count] = totalEngagement;

            count++;
            current = current.getNext();
        }
        return array;
    }


    /**
     * gets total number of followers
     * 
     * @return followers array
     *         total followers
     */
    public double[] getTotalFollowers(LinkedList list) {
        double array[] = new double[list.getSize()];
        Influencer current = list.getFirstNode();
        int count = 0;
        while (current != null && count < array.length) {
            array[count] = current.getFollowers();

            count++;
            current = current.getNext();
        }
        return array;
    }
}
