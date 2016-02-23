/**
 * Created by Josh on 2/22/2016.
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ChessPanel extends JPanel {

    private JButton[][] board;
    private ChessModel model;

    JPanel bottom = new JPanel();
    JPanel center = new JPanel();
    JPanel top = new JPanel();
    public int borderSize=8;
    // declare other instance variables as needed
    private ButtonListener buttonListener = new ButtonListener();

    public ChessPanel() {
        //complete this
        center.setLayout(new GridLayout(borderSize, borderSize));
        board = new JButton[borderSize][borderSize];

        for (int row = 0; row < borderSize; row++)
            for (int col = 0; col < borderSize; col++) {
                board[row][col] = new JButton("");
                board[row][col].setPreferredSize(new Dimension(50,
                        50));
                board[row][col].addActionListener(buttonListener);
                board[row][col].setMargin(new Insets(0, 0, 0, 0));
                center.add(board[row][col]);
            }
        //8X8 board
        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

    }

    // method that updates the board
    private void displayBoard() {
        //complete this
        //update buttons to the correct image
    }

    // add other helper methods as needed

    // inner class that represents action listener for buttons
    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            // complete this
        }
    }
}

