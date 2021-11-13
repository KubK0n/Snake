package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public static JLabel score;

    public MainFrame() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sneak");

        score = new JLabel("Score: ", SwingConstants.CENTER);
        score.setFont(new Font(score.getFont().getName(), Font.BOLD, 30));

        add(new MainPanel());
        add(score, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }


}
