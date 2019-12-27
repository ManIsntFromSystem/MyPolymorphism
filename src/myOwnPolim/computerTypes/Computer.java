package myOwnPolim.computerTypes;

import myOwnPolim.AllEnums.ComputerType;
import myOwnPolim.computerParts.*;

import javax.swing.*;

public class Computer {
    private ComputerType typeComp;
    private String nameComp;
    private String descriptionComp;
    private Processor processor;
    private GraphicsCard graphicsCard;
    private RAM ram;
    private Motherboard motherboard;
    private Monitor monitor;
    private String compImageStr;
    private ImageIcon compImageIcon;

    public Computer(ComputerType typeComp, String nameComp, String descriptionComp, Processor processor, GraphicsCard graphicsCard, RAM ram, Motherboard motherboard, Monitor monitor, String compImageStr) {
        this.typeComp = typeComp;
        this.nameComp = nameComp;
        this.descriptionComp = descriptionComp;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.compImageStr = compImageStr;
    }

    public void eventCalculation() {}

    public ComputerType getTypeComp() {
        return typeComp;
    }

    public void setTypeComp(ComputerType typeComp) {
        this.typeComp = typeComp;
    }

    public String getNameComp() {
        return nameComp;
    }

    public void setNameComp(String nameComp) {
        this.nameComp = nameComp;
    }

    public String getDescriptionComp() {
        return descriptionComp;
    }

    public void setDescriptionComp(String descriptionComp) {
        this.descriptionComp = descriptionComp;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public ImageIcon getCompImageIcon() {
        if (compImageIcon == null) {
            compImageIcon = new ImageIcon(compImageStr);
        }
        return compImageIcon;
    }

    public void setCompImageIcon(ImageIcon compImageIcon) {
        this.compImageIcon = compImageIcon;
    }

    @Override
    public String toString() {
        return "Computer{\n" +
                "   TypeComp : " + typeComp + ";\n" +
                "   NameComp : " + nameComp + ";\n" +
                "   DescriptionComp : '" + descriptionComp + ";\n" +
                "Processor : " + processor +";\n" +
                "GraphicsCard : " + graphicsCard +";\n" +
                "RAM : " + ram + ";\n" +
                "Motherboard : " + motherboard + ";\n" +
                "Monitor : " + monitor + ";\n" +
                "Image : " + compImageIcon + ";\n" +
                '}';
    }
}