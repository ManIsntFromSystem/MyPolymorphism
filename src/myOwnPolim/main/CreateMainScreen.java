package myOwnPolim.main;

import myOwnPolim.AllEnums.ComputerType;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class CreateMainScreen{
    private JFrame jFrame;
    private JPanel jPanel;
    private JPanel jPanFilter;
    private JPanel jPanAdd;
    private JPanel jPanUser;

    public void CreateGUI(){
        createJFrame();
        createJTabMain();
        jFrame.revalidate();
    }

    private void createJFrame(){
        jFrame = new JFrame();
        jPanel = new JPanel();
        jFrame.setTitle("Reviewer Computers");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 300, dimension.height/2 -250, 600, 500);
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

        JPanel jpAddTab = createAddPanel();
        jTabPan.addTab("Add new Computer", iconAddComp, jpAddTab, "");

        JPanel jpUserTab = createUserPanel();
        jTabPan.addTab("User info", iconUser, jpUserTab, "");

        jFrame.add(jTabPan);
    }

   private JPanel createFilterJPanel() {
        String[] compType = Arrays.toString(ComputerType.values()).
                replaceAll("^.|.$", "").split(", ");

        jPanFilter = new JPanel(new GridBagLayout());
        jPanFilter.setBorder(BorderFactory.createEmptyBorder(4, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel jlabSearchName = new JLabel("Input Name: ");
        JTextField jTxtFSearchName = new JTextField(35);

        JLabel jlabTypeOfComp = new JLabel("Computer type: ");
        JComboBox compTypeJCB = new JComboBox(compType);

        Box sizeBoxProc = Box.createVerticalBox();
        JRadioButton processorDisTypeJRB = new JRadioButton("Discrete", false);
        JRadioButton processorInTypeJRB = new JRadioButton("Integrated", false);
        sizeBoxProc.add(processorDisTypeJRB);
        sizeBoxProc.add(processorInTypeJRB);
        sizeBoxProc.setBorder(BorderFactory.createTitledBorder("Processor: "));

        Box sizeBoxGraphCard = Box.createVerticalBox();
        JCheckBox graphCardDisTypeJCB = new JCheckBox("Discrete", false);
        JCheckBox graphCardInTypeJCB = new JCheckBox("Integrated", false);
        sizeBoxGraphCard.add(graphCardDisTypeJCB);
        sizeBoxGraphCard.add(graphCardInTypeJCB);
        sizeBoxGraphCard.setBorder(BorderFactory.createTitledBorder("Graphics card: "));

        ComputersRender computersJlist = new ComputersRender();
        //JTable jTableComps = new JTable();


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(5,0,0,0);
        jPanFilter.add(jlabSearchName, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 4;
        gbc.insets = new Insets(5,15,0,0);
        jPanFilter.add(jTxtFSearchName, gbc);


        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5,0,0,0);
       jPanFilter.add(jlabTypeOfComp, gbc);

        gbc.insets = new Insets(5,15,0,0);
        gbc.gridx = 2;
        jPanFilter.add(compTypeJCB, gbc);

        gbc.gridx = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        jPanFilter.add(sizeBoxProc, gbc);

        gbc.gridx = 4;
        gbc.ipadx = 10;
        jPanFilter.add(sizeBoxGraphCard, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5,0,0,0);
        jPanFilter.add(computersJlist, gbc);

        return jPanFilter;
    }

    private JPanel createAddPanel() {
        jPanAdd = new JPanel(new GridBagLayout());
        return jPanAdd;
    }

    private JPanel createUserPanel() {
        jPanUser = new JPanel(new GridBagLayout());
        return jPanUser;
    }
}
