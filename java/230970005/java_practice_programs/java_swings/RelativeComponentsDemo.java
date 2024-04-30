package java_swings;
import javax.swing.*;
import java.awt.*;

public class RelativeComponentsDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Relative Components Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Calculate screen dimensions
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            // Set preferred sizes for components based on screen size
            int buttonWidth = (int) (screenWidth * 0.2); // 20% of screen width
            int buttonHeight = (int) (screenHeight * 0.1); // 10% of screen height

            // Create buttons with preferred sizes
            JButton button1 = new JButton("Button 1");
            button1.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
            JButton button2 = new JButton("Button 2");
            button2.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

            // Add buttons to panels with BorderLayout
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(button1, BorderLayout.NORTH);
            panel.add(button2, BorderLayout.SOUTH);

            frame.add(panel);
            frame.setSize(screenWidth / 2, screenHeight / 2); // Set initial frame size
            frame.setLocationRelativeTo(null); // Center the frame on the screen
            frame.setVisible(true);
        });
    }
}
