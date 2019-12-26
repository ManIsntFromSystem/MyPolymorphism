package myOwnPolim.computerParts;

public class RAM {
    private String nameRAM;
    private int memorySizeRAM;
    private double frequencyOfRAM;

    public RAM(String nameRAM, int memorySizeRAM, double frequencyOfRAM) {
        this.nameRAM = nameRAM;
        this.memorySizeRAM = memorySizeRAM;
        this.frequencyOfRAM = frequencyOfRAM;
    }

    public String getNameRAM() {
        return nameRAM;
    }

    public void setNameRAM(String nameRAM) {
        this.nameRAM = nameRAM;
    }

    public int getMemorySizeRAM() {
        return memorySizeRAM;
    }

    public void setMemorySizeRAM(int memorySizeRAM) {
        this.memorySizeRAM = memorySizeRAM;
    }

    public double getFrequencyOfRAM() {
        return frequencyOfRAM;
    }

    public void setFrequencyOfRAM(double frequencyOfRAM) {
        this.frequencyOfRAM = frequencyOfRAM;
    }

    @Override
    public String toString() {
        return "RAM{\n" +
                "   NameRAM : " + nameRAM + ";\n" +
                "   MemorySizeRAM : " + memorySizeRAM + " GB;\n" +
                "   FrequencyOfRAM : " + frequencyOfRAM + " MHz;\n" +
                '}';
    }
}
