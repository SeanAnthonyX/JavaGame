import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Window extends Canvas {

    public Window(int width, int height, String title, Game game){
        JFrame frame = new JFrame(title); // frame of window

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops program completely upon exiting
        frame.setResizable(false); // do not allow user to change size of window
        frame.setLocationRelativeTo(null); // starting position of window is middle of screen
        frame.add(game);
        frame.setVisible(true);
        game.start(); // created method
    }


}
