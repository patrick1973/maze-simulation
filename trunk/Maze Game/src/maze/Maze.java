package maze;
import javax.swing.*;

/**
 *
 * @author patrick.vanieperen
 */
public class Maze {
    public static void main(String[] args)
    {
        new Maze();
    }

    public Maze()
    {
        JFrame f = new JFrame();
        f.setTitle("Maze Game");
        f.setSize(400, 500);
        //f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
}
