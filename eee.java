import javax.swing.*;
import java.awt.*;
class eee {
    public static void main(String[] args) {
        JFrame frame = new JFrame("four");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);        
        JPanel panel = new JPanel();
        JButton lbutton = new JButton("0"); 
        JButton button = new JButton("1"); 
        JButton ebutton = new JButton("2");
        JButton eebutton = new JButton("3");     
        panel.setLayout(new GridLayout(2, 2));
        panel.add(lbutton);       
        panel.add(button);      
        panel.add(ebutton);
        panel.add(eebutton);      
        frame.getContentPane().add(panel);
        frame.setVisible(true);
       
    }
    
}