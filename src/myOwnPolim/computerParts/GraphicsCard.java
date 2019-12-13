package myOwnPolim.computerParts;

public class GraphicsCard {
    private String nameGraphicsCard;
    private TypeGraphicsCard typeGraphicsCard;
    private int memorySizeGraphicsCard;
    private double frequencyOfCore;

    public GraphicsCard(String nameGraphicsCard, TypeGraphicsCard typeGraphicsCard, int memorySizeGraphicsCard, double frequencyOfCore) {
        this.nameGraphicsCard = nameGraphicsCard;
        this.typeGraphicsCard = typeGraphicsCard;
        this.memorySizeGraphicsCard = memorySizeGraphicsCard;
        this.frequencyOfCore = frequencyOfCore;
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

    public int getMemorySizeGraphicsCard() {
        return memorySizeGraphicsCard;
    }

    public void setMemorySizeGraphicsCard(int memorySizeGraphicsCard) {
        this.memorySizeGraphicsCard = memorySizeGraphicsCard;
    }

    public double getFrequencyOfCore() {
        return frequencyOfCore;
    }

    public void setFrequencyOfCore(double frequencyOfCore) {
        this.frequencyOfCore = frequencyOfCore;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "nameGraphicsCard='" + nameGraphicsCard + '\'' +
                ", typeGraphicsCard=" + typeGraphicsCard +
                ", memorySizeGraphicsCard=" + memorySizeGraphicsCard +
                ", frequencyOfCore=" + frequencyOfCore +
                '}';
    }
}
enum TypeGraphicsCard{
    INTEGRATED,
    DISCRETE,
    DESKTOP;
}
