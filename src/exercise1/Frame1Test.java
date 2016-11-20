package exercise1;

//import statements
import javax.swing.WindowConstants;

/**
 * Created by Mudrak on 11/6/2016.
 */
public class Frame1Test {
    public static void main(String[] args) {
        //Creating an object of Frame1
        Frame1 newFrame = new Frame1();
        newFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        newFrame.setSize(750, 350);
        newFrame.setVisible(true);
    }
}
