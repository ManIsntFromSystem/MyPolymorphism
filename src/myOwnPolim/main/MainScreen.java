package myOwnPolim.main;

import javax.swing.*;
import java.awt.*;

public class MainScreen{

    public MainScreen(){
        createGUI();
    }

    public JFrame createGUI(){
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Reviewer Computers");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 350, dimension.height/2 -250, 700, 500);
        jFrame.setLayout(new BorderLayout());
        jFrame.setVisible(false);
        return jFrame;
    }
}
