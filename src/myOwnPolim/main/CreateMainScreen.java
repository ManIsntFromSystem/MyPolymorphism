package myOwnPolim.main;

import myOwnPolim.AllEnums.ComputerType;
import myOwnPolim.computerTypes.Computer;
import myOwnPolim.computerTypes.Laptop;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

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
        String[] compType = Arrays.toString(ComputerType.values()).
                replaceAll("^.|.$", "").split(", ");

        JPanel jPanFilter = new JPanel(new GridBagLayout());
        jPanFilter.setBorder(BorderFactory.createEmptyBorder(4, 10, 10, 10));
        //GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel jlabSearchName = new JLabel("Input Name: ");
        JTextField jTxtFSearchName = new JTextField(40);

        JLabel jlabTypeOfComp = new JLabel("Computer type: ");
        JComboBox compTypeJCB = new JComboBox(compType);

        //JLabel jlabTypeOfProcessor = new JLabel("Processor type: ");
        Box sizeBox = Box.createVerticalBox();
        JRadioButton processorDisTypeJRB = new JRadioButton("Discrete", true);
        JRadioButton processorInTypeJRB = new JRadioButton("Integrated", false);
        sizeBox.add(processorDisTypeJRB);
        sizeBox.add(processorInTypeJRB);
        sizeBox.setBorder(BorderFactory.createTitledBorder("Processor: "));
        JTable jTableComps = new JTable();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        //gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.anchor = GridBagConstraints.EAST;
        //gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(5,0,0,0);
        jPanFilter.add(jlabSearchName, gbc);


        gbc.gridwidth = 1;
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.anchor = GridBagConstraints.WEST;
        jPanFilter.add(jTxtFSearchName, gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.EAST;
        //gbc.fill = GridBagConstraints.NONE;
        jPanFilter.add(jlabTypeOfComp, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        jPanFilter.add(compTypeJCB, gbc);
        jPanFilter.add(sizeBox, gbc);

        gbc.gridy++;
        gbc.gridx = GridBagConstraints.HORIZONTAL;
        gbc.gridheight = 10;
        jPanFilter.add(jTableComps, gbc);

        return jPanFilter;
    }
}
