package java_swings;
import javax.swing.*;
import java.awt.*;

public class HeaderFooterExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame
            JFrame frame = new JFrame("Header and Footer Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a JPanel for the header
            JPanel headerPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g.create();

                    // Set shadow color and draw shadow
                    g2d.setColor(new Color(0, 0, 0, 50));
                    g2d.fillRect(0, 0, 10, getHeight());

                    g2d.dispose();
                }
            };
            headerPanel.setBackground(Color.WHITE);
            JLabel headerLabel = new JLabel("Header");
            headerPanel.add(headerLabel);

            // Create a JPanel for the footer
            JPanel footerPanel = new JPanel();
            footerPanel.setBackground(Color.GREEN);
            JLabel footerLabel = new JLabel("Footer");
            footerPanel.add(footerLabel);

            // Set layout for the frame
            frame.setLayout(new BorderLayout());

            // Add header and footer panels to the frame
            frame.add(headerPanel, BorderLayout.NORTH);
            frame.add(footerPanel, BorderLayout.SOUTH);

            // Display the frame
            frame.setVisible(true);
        });
    }
}
