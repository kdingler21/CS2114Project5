package prj5;

import java.awt.Color;
import java.util.Arrays;
import cs2.Button;
import cs2.Shape;
import cs2.Window;
import cs2.WindowSide;

public class InfluencerWindow {
    private LinkedList list;
    private Window window;
    private Button janButton;
    private Button febButton;
    private Button marchButton;
    private Button firstQButton;
    private Button tradEngButton;
    private Button reachEngButton;
    private Button sortChanButton;
    private Button sortEngButton;
    private Button quitButton;
    private String period;
    private String sortMethod;
    private String engageType;

    /**
     * Constructor
     * 
     * @param mainList
     *            list of influencers
     */
    public InfluencerWindow(LinkedList mainList) {
        this.list = mainList;
        this.period = "";
        this.sortMethod = "";
        this.engageType = "";
        window = new Window("Social Media Visual");
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");

        janButton = new Button("January");
        janButton.onClick(this, "clickedJanuary");

        febButton = new Button("February");
        febButton.onClick(this, "clickedFebruary");

        marchButton = new Button("March");
        marchButton.onClick(this, "clickedMarch");

        firstQButton = new Button("First Quarter (Jan - March)");
        firstQButton.onClick(this, "clickedfirstQButton");

        tradEngButton = new Button("Traditional Engagement Rate");
        tradEngButton.onClick(this, "clickedTradEngButton");
        reachEngButton = new Button("Reach Engagement Rate");
        reachEngButton.onClick(this, "clickedReachEngButton");
        sortChanButton = new Button("Sort by Channel Name");
        sortChanButton.onClick(this, "clickedSortChanButton");
        sortEngButton = new Button("Sort by Engagement Rate");
        sortEngButton.onClick(this, "clickedSortEngButton");

        window.addButton(janButton, WindowSide.SOUTH);
        window.addButton(febButton, WindowSide.SOUTH);
        window.addButton(marchButton, WindowSide.SOUTH);
        window.addButton(firstQButton, WindowSide.SOUTH);
        window.addButton(sortChanButton, WindowSide.NORTH);
        window.addButton(sortEngButton, WindowSide.NORTH);
        window.addButton(quitButton, WindowSide.NORTH);
        window.addButton(tradEngButton, WindowSide.WEST);
        window.addButton(reachEngButton, WindowSide.WEST);
    }


    /**
     * gets the window worked in
     * 
     * @return window is where the project is displayed
     */
    public Window getWindow() {
        return window;
    }


    /**
     * creates a quit button
     * 
     * @param button
     *            new quit button
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }


    /**
     * creates a January button
     * 
     * @param button
     *            new January button
     */
    public void clickedJanuary(Button button) {
        period = "January";
        updateBars(updateHeights(list));
    }


    /**
     * creates a February button
     * 
     * @param button
     *            new February button
     */
    public void clickedFebruary(Button button) {
        period = "February";
        updateBars(updateHeights(list));
    }


    /**
     * creates a March button
     * 
     * @param button
     *            new March button
     */
    public void clickedMarch(Button button) {
        period = "March";
        updateBars(updateHeights(list));
    }


    /**
     * creates a first quarter button
     * 
     * @param button
     *            new first quarter button
     */
    public void clickedfirstQButton(Button button) {
        period = "FirstQuarter";
        updateBars(updateHeights(list));
    }


    /**
     * creates a first quarter button
     * 
     * @param button
     *            new first quarter button
     */
    public void clickedTradEngButton(Button button) {
        engageType = "Traditional";
        updateBars(updateHeights(list));
    }


    /**
     * creates a first quarter button
     * 
     * @param button
     *            new first quarter button
     */
    public void clickedReachEngButton(Button button) {
        engageType = "Reach";
        updateBars(updateHeights(list));
    }


    /**
     * creates a first quarter button
     * 
     * @param button
     *            new first quarter button
     */
    public void clickedSortChanButton(Button button) {
        sortMethod = "Channel";
        updateBars(updateHeights(list));
    }


    /**
     * creates a first quarter button
     * 
     * @param button
     *            new first quarter button
     */
    public void clickedSortEngButton(Button button) {
        sortMethod = "Engagement";
        updateBars(updateHeights(list));
    }


    /**
     * updates display bars based on data
     * 
     * @param heights
     *            array of heights
     */
    public void updateBars(int heights[]) {
        Shape bars[] = new Shape[heights.length];
        Color colors[] = randomizeColors(heights.length);
        
        int best = 0;
        for (int i = 0; i < heights.length; i++) {
            if (i == 0) {
                best = heights[i];
            }
            
            else {
                if (heights[i] > best) {
                    best = heights[i];
                }
            }
        }
        
        for (int i = 0; i < bars.length; i++) {           
            bars[i] = new Shape(10, 100, 25, heights[i]);
            bars[i].setBackgroundColor(colors[i]);
            window.addShape(bars[i]);
        }
    }
    
    /**
     * updates display bars based on data
     * 
     * @param heights
     *            array of heights
     */
    public Color[] randomizeColors(int size) {
        Color colors[] = new Color[size];
        for (int i = 0; i < colors.length; i++) {
            int red = (int)(Math.random() * 255);
            int green = (int)(Math.random() * 255);
            int blue = (int)(Math.random() * 255);
            
            colors[i] = new Color(red, blue, green);
        }
        return colors;
    }


    /**
     * updates the heights of the bars
     * 
     * @param list
     *            list of influencer data
     * @return heights
     *         array of bar heights
     */
    public int[] updateHeights(LinkedList list) {
        int heights[] = new int[list.getSize()];
        Sorter sorter = new Sorter();

        if (list != null) {
            if (period.equals("January")) {
                if (sortMethod.equals("Channel") && engageType.equals(
                    "Traditional")) {
                    Influencer[] janChannelTrad = sorter.sortByChannelName(
                        list);
                    for (int i = 0; i < janChannelTrad.length; i++) {
                        heights[i] = (int)(Math.round(janChannelTrad[i]
                            .getJanTradEngagementRate()) * 10);
                    }
                }
                else if (sortMethod.equals("Channel") && engageType.equals(
                    "Reach")) {
                    Influencer[] janChannelReach = sorter.sortByChannelName(
                        list);
                    for (int i = 0; i < janChannelReach.length; i++) {
                        heights[i] = (int)(Math.round(janChannelReach[i]
                            .getJanReachEngagementRate()) * 10);
                    }
                }
                else if (sortMethod.equals("Engagement") && engageType.equals(
                    "Traditional")) {
                    Influencer[] janEngTrad = sorter
                        .sortByTraditionalEngagementRate(list, "Jan");
                    for (int i = 0; i < janEngTrad.length; i++) {
                        heights[i] = (int)(Math.round(janEngTrad[i]
                            .getJanTradEngagementRate()) * 10);
                    }
                }
                else if (sortMethod.equals("Engagement") && engageType.equals(
                    "Reach")) {
                    Influencer[] janEngReach = sorter.sortByReachEngagementRate(
                        list, "Jan");
                    for (int i = 0; i < janEngReach.length; i++) {
                        heights[i] = (int)(Math.round(janEngReach[i]
                            .getJanReachEngagementRate()) * 10);
                    }
                }
            }

            if (period.equals("February")) {
                if (sortMethod.equals("Channel") && engageType.equals(
                    "Traditional")) {
                    Influencer[] febChannelTrad = sorter.sortByChannelName(
                        list);
                    for (int i = 0; i < febChannelTrad.length; i++) {
                        heights[i] = (int)(Math.round((febChannelTrad[i]
                            .getFebTradEngagementRate()) * 10));
                    }
                }
                else if (sortMethod.equals("Channel") && engageType.equals(
                    "Reach")) {
                    Influencer[] febChannelReach = sorter.sortByChannelName(
                        list);
                    for (int i = 0; i < febChannelReach.length; i++) {
                        heights[i] = (int)(Math.round((febChannelReach[i]
                            .getFebReachEngagementRate()) * 10));
                    }
                }
                else if (sortMethod.equals("Engagement") && engageType.equals(
                    "Traditional")) {
                    Influencer[] febEngTrad = sorter
                        .sortByTraditionalEngagementRate(list, "Feb");
                    for (int i = 0; i < febEngTrad.length; i++) {
                        heights[i] = (int)(Math.round((febEngTrad[i]
                            .getFebTradEngagementRate()) * 10));
                    }
                }
                else if (sortMethod.equals("Engagement") && engageType.equals(
                    "Reach")) {
                    Influencer[] febEngReach = sorter.sortByReachEngagementRate(
                        list, "Feb");
                    for (int i = 0; i < febEngReach.length; i++) {
                        heights[i] = (int)(Math.round((febEngReach[i]
                            .getFebReachEngagementRate()) * 10));
                    }
                }
            }

            if (period.equals("March")) {
                if (sortMethod.equals("Channel") && engageType.equals(
                    "Traditional")) {
                    Influencer[] marChannelTrad = sorter.sortByChannelName(
                        list);
                    for (int i = 0; i < marChannelTrad.length; i++) {
                        heights[i] = (int)(Math.round((marChannelTrad[i]
                            .getMarchTradEngagementRate()) * 10));
                    }
                }
                else if (sortMethod.equals("Channel") && engageType.equals(
                    "Reach")) {
                    Influencer[] marChannelReach = sorter.sortByChannelName(
                        list);
                    for (int i = 0; i < marChannelReach.length; i++) {
                        heights[i] = (int)(Math.round((marChannelReach[i]
                            .getMarchReachEngagementRate()) * 10));
                    }
                }
                else if (sortMethod.equals("Engagement") && engageType.equals(
                    "Traditional")) {
                    Influencer[] marEngTrad = sorter
                        .sortByTraditionalEngagementRate(list, "March");
                    for (int i = 0; i < marEngTrad.length; i++) {
                        heights[i] = (int)(Math.round((marEngTrad[i]
                            .getMarchTradEngagementRate()) * 10));
                    }
                }
                else if (sortMethod.equals("Engagement") && engageType.equals(
                    "Reach")) {
                    Influencer[] marEngReach = sorter.sortByReachEngagementRate(
                        list, "March");
                    for (int i = 0; i < marEngReach.length; i++) {
                        heights[i] = (int)(Math.round((marEngReach[i]
                            .getMarchReachEngagementRate()) * 10));
                    }
                }
            }
        }
        
        if (period.equals("First Quarter")) {
            if (sortMethod.equals("Channel") && engageType.equals(
                "Traditional")) {
                Influencer[] marChannelTrad = sorter.sortByChannelName(
                    list);
                for (int i = 0; i < marChannelTrad.length; i++) {
                    heights[i] = (int)(Math.round((marChannelTrad[i]
                        .getTraditionalEngagementRate()) * 10));
                }
            }
            else if (sortMethod.equals("Channel") && engageType.equals(
                "Reach")) {
                Influencer[] marChannelReach = sorter.sortByChannelName(
                    list);
                for (int i = 0; i < marChannelReach.length; i++) {
                    heights[i] = (int)(Math.round((marChannelReach[i]
                        .getReachEngagementRate()) * 10));
                }
            }
            else if (sortMethod.equals("Engagement") && engageType.equals(
                "Traditional")) {
                Influencer[] marEngTrad = sorter
                    .sortByTraditionalEngagementRate(list, "March");
                for (int i = 0; i < marEngTrad.length; i++) {
                    heights[i] = (int)(Math.round((marEngTrad[i]
                        .getMarchTradEngagementRate()) * 10));
                }
            }
            else if (sortMethod.equals("Engagement") && engageType.equals(
                "Reach")) {
                Influencer[] marEngReach = sorter.sortByReachEngagementRate(
                    list, "March");
                for (int i = 0; i < marEngReach.length; i++) {
                    heights[i] = (int)(Math.round((marEngReach[i]
                        .getReachEngagementRate()) * 10));
                }
            }
        }
        return heights;
    }

}