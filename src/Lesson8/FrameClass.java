package Lesson8;

import javax.swing.*;
import java.awt.event.*;

public class FrameClass{
    public static void main(String[] Args){


        JFrame f = new JFrame("Button Example");


        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);


        tf.setText("HEllo world");

        JButton btn = new JButton("Click me!:)");
        btn.setBounds(50, 100, 95, 30);
        f.add(btn);


        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);



        f.add(tf);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Swing:)");
            }
        });

    }
}