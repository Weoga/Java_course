package OutOfLesson;

import javax.swing.JFrame;

public class CreateWindow{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test Frame");
        frame.setVisible(true);
    }
}
