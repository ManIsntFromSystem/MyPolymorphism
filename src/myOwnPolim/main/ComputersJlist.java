package myOwnPolim.main;

import myOwnPolim.computerTypes.Computer;

import javax.swing.*;
import java.awt.*;

public class ComputersJlist extends JPanel implements ListCellRenderer<Computer> {

    private JLabel lbNameComp = new JLabel();
    private JLabel lbNameProc = new JLabel();
    private JLabel lbNameGraphCard = new JLabel();
    private JLabel lbImageIcon = new JLabel();

    public ComputersJlist() {
        setLayout(new BorderLayout(5,5));
        JPanel panelComps = new JPanel(new GridLayout(0,1));
        panelComps.add(lbNameComp);
        panelComps.add(lbNameProc);
        panelComps.add(lbNameGraphCard);
        add(lbImageIcon, BorderLayout.WEST);
        add(panelComps, BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Computer> list, Computer computer, int index, boolean isSelected, boolean cellHasFocus) {

        lbImageIcon.setIcon(new ImageIcon(getClass().getResource(
                "/source/images/" + computer.getCompImageIcon() + ".png")));
        lbNameComp.setText(computer.getNameComp());
        lbNameProc.setText(computer.getProcessor().getNameProcessor());
        lbNameGraphCard.setText(computer.getGraphicsCard().getNameGraphicsCard());
        lbNameGraphCard.setForeground(Color.red);

        return this;
    }
}