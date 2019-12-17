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

    @Override
    public String toString() {
        return "RAM{\n" +
                "   NameRAM : " + nameRAM + ";\n" +
                "   MemorySizeRAM : " + memorySizeRAM + " GB;\n" +
                "   FrequencyOfRAM : " + frequencyOfRAM + " MHz;\n" +
                '}';
    }
}
