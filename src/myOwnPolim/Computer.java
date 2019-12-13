package myOwnPolim;

import myOwnPolim.computerParts.GraphicsCard;
import myOwnPolim.computerParts.Motherboard;
import myOwnPolim.computerParts.Processor;
import myOwnPolim.computerParts.RAM;

public abstract class Computer {
    private ComputerType typeComp;
    private String nameComp;
    private String descriptionComp;
    private Processor processor;
    private GraphicsCard graphicsCard;
    private RAM ram;
    private Motherboard motherboard;

    public abstract void eventCalculation();

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

    @Override
    public String toString() {
        return "Computer{" +
                "typeComp=" + typeComp +
                ", nameComp='" + nameComp + '\'' +
                ", descriptionComp='" + descriptionComp + '\'' +
                ", processor=" + processor +
                ", graphicsCard=" + graphicsCard +
                ", ram=" + ram +
                ", motherboard=" + motherboard +
                '}';
    }
}

enum ComputerType {
    LAPTOP,
    DESKTOP,
    MONOBLOCK,
    TABLETS;
}