package prj5;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class Input 
{
    public static void main(String args) throws FileNotFoundException, ParseException
    {
        if (args != null)
        {
            FileReader fileReader = new FileReader(args);
        }
        FileReader fileReader = new FileReader("SampleInput1_2022.csv");
        new Window(fileReader);
    }
}
