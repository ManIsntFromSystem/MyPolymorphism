package myOwnPolim.main;

import myOwnPolim.AllEnums.ComputerType;

import javax.swing.*;
import java.awt.*;
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
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel jlabSearchName = new JLabel("Input Name: ");
        JTextField jTxtFSearchName = new JTextField(40);

        JLabel jlabTypeOfComp = new JLabel("Computer type: ");
        JComboBox compTypeJCB = new JComboBox(compType);

        JLabel jlabTypeOfProcessor = new JLabel("Processor type: ");
        Box sizeBox = Box.createVerticalBox();
        JRadioButton processorDisTypeJRB = new JRadioButton("Discrete", true);
        JRadioButton processorInTypeJRB = new JRadioButton("Integrated", false);
        ButtonGroup buttonGroupProc = new ButtonGroup();
        buttonGroupProc.add(processorDisTypeJRB);
        buttonGroupProc.add(processorInTypeJRB);
        sizeBox.add(processorDisTypeJRB);
        sizeBox.add(processorInTypeJRB);
        sizeBox.setBorder(BorderFactory.createTitledBorder("Processor: "));

        gbl.setConstraints(jlabSearchName, gbc);
        jPanFilter.add(jlabSearchName);

        gbl.setConstraints(jTxtFSearchName, gbc);
        jPanFilter.add(jTxtFSearchName);


        gbl.setConstraints(jlabTypeOfComp, gbc);
        jPanFilter.add(jlabTypeOfComp);

        gbl.setConstraints(compTypeJCB, gbc);
        jPanFilter.add(compTypeJCB);

        gbl.setConstraints(jlabTypeOfProcessor, gbc);
        jPanFilter.add(jlabTypeOfProcessor);

        gbl.setConstraints(sizeBox, gbc);
        jPanFilter.add(sizeBox);

        return jPanFilter;
    }
}
