package myOwnPolim.computerParts;

import myOwnPolim.AllEnums.TypeGraphicsCard;

public class GraphicsCard {
    private String nameGraphicsCard;
    private TypeGraphicsCard typeGraphicsCard;
    private double frequencyOfCore;
    private int memorySizeGraphicsCard;
    private double frequencyOfMemory;

    public GraphicsCard(String nameGraphicsCard, TypeGraphicsCard typeGraphicsCard, double frequencyOfCore, int memorySizeGraphicsCard,int frequencyOfMemory) {
        this.nameGraphicsCard = nameGraphicsCard;
        this.typeGraphicsCard = typeGraphicsCard;
        this.frequencyOfCore = frequencyOfCore;
        this.memorySizeGraphicsCard = memorySizeGraphicsCard;
        this.frequencyOfMemory =  frequencyOfMemory;
    }

    public String getNameGraphicsCard() {
        return nameGraphicsCard;
    }

    public void setNameGraphicsCard(String nameGraphicsCard) {
        this.nameGraphicsCard = nameGraphicsCard;
    }

    public TypeGraphicsCard getTypeGraphicsCard() {
        return typeGraphicsCard;
    }

    public void setTypeGraphicsCard(TypeGraphicsCard typeGraphicsCard) {
        this.typeGraphicsCard = typeGraphicsCard;
    }

    public double getFrequencyOfCore() {
        return frequencyOfCore;
    }

    public void setFrequencyOfCore(double frequencyOfCore) {
        this.frequencyOfCore = frequencyOfCore;
    }

    public int getMemorySizeGraphicsCard() {
        return memorySizeGraphicsCard;
    }

    public void setMemorySizeGraphicsCard(int memorySizeGraphicsCard) {
        this.memorySizeGraphicsCard = memorySizeGraphicsCard;
    }

    public double getFrequencyOfMemory() {
        return frequencyOfMemory;
    }

    public void setFrequencyOfMemory(double frequencyOfMemory) {
        this.frequencyOfMemory = frequencyOfMemory;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" + "\n" +
                "   NameGraphicsCard : " + nameGraphicsCard +  ";\n" +
                "   TypeGraphicsCard : " + typeGraphicsCard + ";\n" +
                "   FrequencyOfCore : " + frequencyOfCore + " MHz;\n" +
                "   MemorySizeGraphicsCard : " + memorySizeGraphicsCard + " MB;\n" +
                "   FrequencyOfMemory : " + frequencyOfMemory + " MHz;\n" +
                '}';
    }
}