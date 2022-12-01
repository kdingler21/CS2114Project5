package prj5;

/**
 * 
 * @author Mike Ferrante, Katie Dingler, Sushen Kolakaketi
 * @version 11.19.2022
 */
public class Sorter {
    /**
     * constructor
     */
    public Sorter() {
        // Do Nothing...
    }



    /**
     * sorts list alphabetical order by channel name
     * 
     * @param list
     *            list to be sorted
     * @return arr
     *         sorted list as an array
     */
    public Influencer[] sortByChannelName(LinkedList list) {
        Influencer[] arr = list.toArray();

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i].getChannelName().toLowerCase().compareTo(arr[j].getChannelName().toLowerCase() ) > 0)
                {
                    Influencer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }


    /**
     * sorts list by traditional engagement rate
     * 
     * @param list
     *            list to be sorted
     * @param timeframe
     *            timeframe to get engagement rate
     * @return arr
     *         sorted list as an array
     */
    public Influencer[] sortByTraditionalEngagementRate(LinkedList list, String timeframe) {
        Influencer[] arr = list.toArray();
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            Influencer key = arr[i];
            int j = i - 1;

            switch (timeframe) {
                case "Jan":
                    while (j >= 0 && arr[j].getJanTradEngagementRate() > key
                        .getJanTradEngagementRate()) {
                        arr[j + 1] = arr[j];
                        j = j - 1; 
                    }
                break;
                
                case "Feb":
                    while (j >= 0 && arr[j].getFebTradEngagementRate() > key
                        .getFebTradEngagementRate()) {
                        arr[j + 1] = arr[j];
                        j = j - 1; 
                    }
                break;
                
                case "March":
                    while (j >= 0 && arr[j].getMarchTradEngagementRate() > key
                        .getMarchTradEngagementRate()) {
                        arr[j + 1] = arr[j];
                        j = j - 1; 
                    }
                break;
                
                case "All":
                    while (j >= 0 && arr[j].getTraditionalEngagementRate() > key
                        .getTraditionalEngagementRate()) {
                        arr[j + 1] = arr[j];
                        j = j - 1; 
                    }
                break;
            }
            arr[j + 1] = key;
        }

        return arr;
    }


    /**
     * sorts list by reach engagement rate and timefrane
     * 
     * @param list
     *            list to be sorted
     * @param timeframe
     *            timeframe to get engagement rate
     * @return arr
     *         sorted list as an array
     */
    public Influencer[] sortByReachEngagementRate(LinkedList list, String timeframe) {
        Influencer[] arr = list.toArray();
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            Influencer key = arr[i];
            int j = i - 1;

            switch (timeframe) {
                case "Jan":
                    while (j >= 0 && arr[j].getJanReachEngagementRate() > key
                        .getJanReachEngagementRate()) {
                        arr[j + 1] = arr[j];
                        j = j - 1; 
                    }
                break;
                
                case "Feb":
                    while (j >= 0 && arr[j].getFebReachEngagementRate() > key
                        .getFebReachEngagementRate()) {
                        arr[j + 1] = arr[j];
                        j = j - 1; 
                    }
                break;
                
                case "March":
                    while (j >= 0 && arr[j].getMarchReachEngagementRate() > key
                        .getMarchReachEngagementRate()) {
                        arr[j + 1] = arr[j];
                        j = j - 1; 
                    }
                break;
                
                case "All":
                    while (j >= 0 && arr[j].getReachEngagementRate() > key
                        .getReachEngagementRate()) {
                        arr[j + 1] = arr[j];
                        j = j - 1; 
                    }
                break;
            }
            arr[j + 1] = key;
        }

        return arr;
    }
}
