package myOwnPolim.main;

import javax.swing.*;
import java.awt.*;

public class CreateMainScreen{
    private JFrame jFrame;
    private JPanel jPanel;
    public void CreateGUI(){
        createJFrame();
        createJTabMain();
    }

    private void createJFrame(){
        jFrame = new JFrame();
        jFrame.setTitle("Reviewer Computers");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 350, dimension.height/2 -250, 700, 500);
        jFrame.setLayout(new BorderLayout());
        jFrame.setVisible(true);
    }
    private void createJTabMain(){
        JTabbedPane jTabPan  = new JTabbedPane();
        ImageIcon iconFilter = new ImageIcon("/source/icons/filter.png");

        JPanel jpFilterTab = createInnerPanel("FilterTab: show all computer");
        jTabPan.addTab("Filter", iconFilter, jpFilterTab);
        jTabPan.setSelectedIndex(0);

        ImageIcon iconAddComp = new ImageIcon("source/icons/computerAdd.png");

        JPanel jpAddTab = createInnerPanel("AddTab: add new computer");
        jTabPan.addTab("Add", iconAddComp, jpAddTab);
        jFrame.add(jTabPan);
    }

    private JPanel createInnerPanel(String text) {
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(text));
        return jPanel;
    }
}
