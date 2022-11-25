package prj5;

import java.text.ParseException;
import java.util.Scanner;

public class FileHandlerTest extends student.TestCase 
{
    @SuppressWarnings("unused")
    private String fileName;
    @SuppressWarnings("unused")
    private Scanner fileData;
    /**
     * sets up any needed variables for test methods
     */
    public void setUp() {
        fileData = null;
    }
    /**
     * Test the program with input.txt and planetsHighSkill
     * 
     * @throws SpaceColonyDataException 
     * @throws ParseException
     * 
     */
    public void testMain()
        throws java.io.IOException,
        ParseException {
        Exception e = null; 
        try {
            Input.main(new String[] { "SampleInput1_2022.csv"});
        }
        catch (Exception exception) {  
            e = exception;
        }
     //   assertNotNull(e);
    }
}