import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener{
    static JTextField tf; 
    public String S;
    boolean userInput = false;

    public GUI(){
    }

    public void start(){
        JFrame f = new JFrame("BST no Balance");
        JButton b = new JButton("Run");
        JLabel j = new JLabel("What are the number you would like to be inputted to the tree?");
        tf = new JTextField();
        tf.setBounds(20, 50, 340, 30);
        b.setBounds(250,310,95,30);
        j.setBounds(5, 5, 500, 30);
        f.add(b);
        f.add(j);
        f.add(tf);

        /*Listener*/
        b.addActionListener(this);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        S = tf.getText();
        userInput = true;
    }


}
