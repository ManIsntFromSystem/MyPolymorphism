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
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel jlabSearchName = new JLabel("Input Name: ");
        gbc.fill   = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10,10,0,0);
        gbc.gridheight = 1;
        gbc.gridwidth  = 1;
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbl.setConstraints(jlabSearchName, gbc);
        jPanFilter.add(jlabSearchName);

        JTextField jTxtFSearchName = new JTextField(35);
        gbc.fill   = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10,-120,0,0);
        gbc.gridheight = 1;
        gbc.gridwidth  = GridBagConstraints.REMAINDER;
        gbc.ipadx = 32;
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbl.setConstraints(jTxtFSearchName, gbc);
        jPanFilter.add(jTxtFSearchName);

       /* JButton jButtonSearch = new JButton("Search");
        gbc.fill   = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(5,10,0,0);
        gbc.gridheight = 1;
        gbc.gridwidth  = GridBagConstraints.REMAINDER;
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbl.setConstraints(jButtonSearch, gbc);
        jPanFilter.add(jButtonSearch);*/

       //restore the changed parameters
        gbc.ipadx = 0;
        gbc.gridwidth  = 1;
        gbc.gridy = 2;

        JLabel jlabChooseTypeOfComp = new JLabel("Choose type of computer: ");
        gbc.fill   = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10,10,0,0);
        gbc.gridheight = 1;
        gbc.gridwidth  = 1;
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbl.setConstraints(jlabChooseTypeOfComp, gbc);
        jPanFilter.add(jlabChooseTypeOfComp);

        jPanFilter.setLayout(gbl);

        return jPanFilter;
    }
}
