package prj5;

import cs2.Button;
import cs2.Shape;
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
    
    /**
     * Constructor
     * @param mainList
     *                list of influencers
     */
    public InfluencerWindow(LinkedList mainList)
    {
        this.list = mainList;
        window = new Window("Social Media Visual"); 
        Button quitButton = new Button("Quit");
        quitButton.onClick(this,"clickedQuit");     
        
        janButton = new Button("January");
        janButton.onClick(this, "clickedJanuary");
        
        febButton = new Button("February");
        febButton.onClick(this, "clickedFebruary");
        
        marchButton = new Button("March");
        marchButton.onClick(this, "clickedMarch");
        
        firstQButton = new Button("First Quarter (Jan - March");
        firstQButton.onClick(this, "clickedFirstQButton");        
        
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
        
    }
    
    /**
     * creates a February button
     * @param button
     *              new February button
     */
    public void clickedFebruary(Button button) {
        
    }
    
    /**
     * creates a March button
     * @param button
     *              new March button
     */
    public void clickedMarch(Button button) {
        
    }
    
    /**
     * creates a first quarter button
     * @param button
     *              new first quarter button
     */
    public void clickedFirstQuarter(Button button) {
        
    }
    
    
    
    
    
}
