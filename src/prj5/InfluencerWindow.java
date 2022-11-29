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
    
    
    public InfluencerWindow(LinkedList mainList)
    {
        this.list = mainList;
        window = new Window("Social Media Visual"); 
        Button quitButton = new Button("Quit");
        quitButton.onClick(this,"clickedQuit");
        window.addButton(quitButton,WindowSide.EAST);
        
        list = mainList;
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
    
    public void clickedJanuaryButton(Button button)
    {
        
    }
}
