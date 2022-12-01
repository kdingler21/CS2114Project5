package prj5;

import java.awt.Rectangle;
import cs2.Button;
import cs2.Shape;
import cs2.SquareShape;
import cs2.Window;
import cs2.WindowSide;

public class InfluencerWindow 
{
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
    private Shape one;
    private Shape two;
    private Shape three;
    private Shape four;
    private double height;
    private String period;
    private String sortMethod;
    private String engageType; 
    
    /**
     * Constructor
     * @param mainList
     *                list of influencers
     */
    public InfluencerWindow(LinkedList mainList)
    {      
        this.list = mainList;
        this.period = "";
        this.sortMethod = "";
        this.engageType = "";
        window = new Window("Social Media Visual"); 
        quitButton = new Button("Quit");
        quitButton.onClick(this,"clickedQuit");     
        
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
        window.addButton(quitButton,WindowSide.NORTH);
        window.addButton(tradEngButton, WindowSide.WEST);
        window.addButton(reachEngButton, WindowSide.WEST);
        
        window.addShape(one);
        
    }
  
    /**
     * gets the window worked in
     * @return window is where the project is displayed
     */
    public Window getWindow()
    {
        return window;
    }
    /**
     * creates a quit button
     * @param button new quit button
     */
    public void clickedQuit(Button button)
    {
        System.exit(0);
    }
    
    /**
     * creates a January button
     * @param button 
     *              new January button
     */
    public void clickedJanuary(Button button)
    {
        period = "January";
        one = new Shape(10, 100, 25, (int)Math.round(updateHeights(list)[0]));
        window.addShape(one);
    }
    
    /**
     * creates a February button
     * @param button
     *              new February button
     */
    public void clickedFebruary(Button button) 
    {
        period = "February";
        updateHeights(list);
    }
    
    /**
     * creates a March button
     * @param button
     *              new March button
     */
    public void clickedMarch(Button button) 
    {
        period = "March";
        updateHeights(list);
    }
    
    /**
     * creates a first quarter button
     * @param button
     *              new first quarter button
     */
    public void clickedfirstQButton(Button button) 
    {
        period = "FirstQuarter";
        updateHeights(list);
    }
    /**
     * creates a first quarter button
     * @param button
     *              new first quarter button
     */
    public void clickedTradEngButton(Button button) 
    {
        engageType = "Traditional";
        updateHeights(list);
    }
    /**
     * creates a first quarter button
     * @param button
     *              new first quarter button
     */
    public void clickedReachEngButton(Button button) 
    {
        engageType = "Reach";
        updateHeights(list);
    }
    /**
     * creates a first quarter button
     * @param button
     *              new first quarter button
     */
    public void clickedSortChanButton(Button button) 
    {
        sortMethod = "Channel";
        updateHeights(list);
    }
    /**
     * creates a first quarter button
     * @param button
     *              new first quarter button
     */
    public void clickedSortEngButton(Button button) 
    {
        sortMethod = "Engagement";
        updateHeights(list);
    }

    /**
     * updates the heights of the bars 
     * @param list
     * @return
     */
    public Double[] updateHeights(LinkedList list)
    {
        Double[] heights = new Double[4];
        Sorter sorter = new Sorter();
       
        if (list != null)
          {
              if (period.equals("January"))
              {
                  if (sortMethod.equals("Channel") && engageType.equals("Traditional"))
                  {
                      Influencer[] janChannelTrad = sorter.sortByChannelName(list);
                      for (int i = 0; i < janChannelTrad.length; i++)
                      {
                          heights[i] = (janChannelTrad[i].getJanTradEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Channel") && engageType.equals("Reach"))
                  {
                      Influencer[] janChannelReach = sorter.sortByChannelName(list);
                      for (int i = 0; i < janChannelReach.length; i++)
                      {
                          heights[i] = (janChannelReach[i].getJanReachEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Engagement") && engageType.equals("Traditional"))
                  {
                      Influencer[] janEngTrad = sorter.sortByTraditionalEngagementRate(list);
                      for (int i = 0; i < janEngTrad.length; i++)
                      {
                          heights[i] = (janEngTrad[i].getJanTradEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Engagement") && engageType.equals("Reach"))
                  {
                      Influencer[] janEngReach = sorter.sortByReachEngagementRate(list);
                      for (int i = 0; i < janEngReach.length; i++)
                      {
                          heights[i] = (janEngReach[i].getJanReachEngagementRate()) * 10;
                      }
                  }
              }
              
              if (period.equals("February"))
              {
                  if (sortMethod.equals("Channel") && engageType.equals("Traditional"))
                  {
                      Influencer[] febChannelTrad = sorter.sortByChannelName(list);
                      for (int i = 0; i < febChannelTrad.length; i++)
                      {
                          heights[i] = (febChannelTrad[i].getFebTradEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Channel") && engageType.equals("Reach"))
                  {
                      Influencer[] febChannelReach = sorter.sortByChannelName(list);
                      for (int i = 0; i < febChannelReach.length; i++)
                      {
                          heights[i] = (febChannelReach[i].getFebReachEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Engagement") && engageType.equals("Traditional"))
                  {
                      Influencer[] febEngTrad = sorter.sortByTraditionalEngagementRate(list);
                      for (int i = 0; i < febEngTrad.length; i++)
                      {
                          heights[i] = (febEngTrad[i].getFebTradEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Engagement") && engageType.equals("Reach"))
                  {
                      Influencer[] febEngReach = sorter.sortByReachEngagementRate(list);
                      for (int i = 0; i < febEngReach.length; i++)
                      {
                          heights[i] = (febEngReach[i].getFebReachEngagementRate()) * 10;
                      }
                  }
              }
              
              if (period.equals("March"))
              {
                  if (sortMethod.equals("Channel") && engageType.equals("Traditional"))
                  {
                      Influencer[] marChannelTrad = sorter.sortByChannelName(list);
                      for (int i = 0; i < marChannelTrad.length; i++)
                      {
                          heights[i] = (marChannelTrad[i].getMarchTradEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Channel") && engageType.equals("Reach"))
                  {
                      Influencer[] marChannelReach = sorter.sortByChannelName(list);
                      for (int i = 0; i < marChannelReach.length; i++)
                      {
                          heights[i] = (marChannelReach[i].getMarchReachEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Engagement") && engageType.equals("Traditional"))
                  {
                      Influencer[] marEngTrad = sorter.sortByTraditionalEngagementRate(list);
                      for (int i = 0; i < marEngTrad.length; i++)
                      {
                          heights[i] = (marEngTrad[i].getMarchTradEngagementRate()) * 10;
                      }
                  }
                  else if (sortMethod.equals("Engagement") && engageType.equals("Reach"))
                  {
                      Influencer[] marEngReach = sorter.sortByReachEngagementRate(list);
                      for (int i = 0; i < marEngReach.length; i++)
                      {
                          heights[i] = (marEngReach[i].getMarchReachEngagementRate()) * 10;
                      }
                  }
              }
          }
        return heights;
    }
   
    
    
}
