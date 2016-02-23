import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Created by Josh on 2/22/2016.
 */
public class ChessGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChessPanel panel = new ChessPanel();
        frame.getContentPane().add(panel);
        Dimension sizeOfScreen = Toolkit.getDefaultToolkit().
                getScreenSize();
        frame.setSize((int)sizeOfScreen.getWidth(),
                (int)sizeOfScreen.getHeight());
        frame.pack();
        frame.setVisible(true);
    }
}