import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UI TEST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("number guessing game 1 to 999");
        JButton button = new JButton("guess");
        JTextField textField = new JTextField(20);
        JLabel outputLabel = new JLabel("output");
        Random random = new Random(); 
        int qe = random.nextInt(1000);
         
        panel.setLayout(new GridLayout(4, 1));      
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(outputLabel);
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int gue = Integer.parseInt(textField.getText());
                    if (gue == qe) {
                        outputLabel.setText("you won the number was" + qe);
                    } else if (gue < qe) {
                        outputLabel.setText("too low");
                    } else {
                        outputLabel.setText("too high");
                    }
                } catch (NumberFormatException ex) {
                    outputLabel.setText("invalid input");
                }
                textField.requestFocusInWindow();
                textField.selectAll();
                
            }
            
        }); // this sec is AI-generated

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.doClick(); // Simulates a button click when Enter is pressed in a text field.
            }
        });

        textField.requestFocusInWindow();
       
    }
}
