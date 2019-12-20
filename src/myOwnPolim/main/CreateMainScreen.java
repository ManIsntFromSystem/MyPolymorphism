package myOwnPolim.main;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.WEST;

public class CreateMainScreen{
    private JFrame jFrame;
    private JPanel jPanel;
    public void CreateGUI(){
        createJFrame();
        createJTabMain();
        jFrame.revalidate();
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


        ImageIcon iconFilter = new ImageIcon("src/source/icons/computerWind.png");
        ImageIcon iconAddComp = new ImageIcon("src/source/icons/computerAdd2.png");
        ImageIcon iconUser = new ImageIcon("src/source/icons/user2.png");

        JPanel jpFilterTab = createFilterJPanel();
        jTabPan.addTab("Filter of Computers", iconFilter, jpFilterTab, "");

        JPanel jpAddTab = createInnerPanel("");
        jTabPan.addTab("Add new Computer", iconAddComp, jpAddTab, "");

        JPanel jpUserTab = createInnerPanel("");
        jTabPan.addTab("User info", iconUser, jpUserTab, "");

        jFrame.add(jTabPan);
    }

    private JPanel createInnerPanel(String text) {
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(text));
        return jPanel;
    }

    private JPanel createFilterJPanel() {
        JPanel jPanFilter = new JPanel();
        GridBagLayout gbag =new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        jPanFilter.setLayout(gbag);

        jPanFilter.setLayout(new GridBagLayout());
        JLabel jlabSearchName = new JLabel("Input Name: ");
        jPanFilter.add(jlabSearchName);

        JTextField jTxtFSearchName = new JTextField();
        jPanFilter.add(jTxtFSearchName);

        return jPanFilter;
    }
}
