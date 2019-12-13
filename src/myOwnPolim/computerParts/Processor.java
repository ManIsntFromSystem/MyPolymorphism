package myOwnPolim.computerParts;

public class Processor {
    private String nameProcessor;
    private TypeProcessor typeProcessor;
    private int numberOfCores;
    private int numberOfThreads;
    private double frequencyOfCore;

    @Override
    public String toString() {
        return "Processor{" +
                "nameProcessor='" + nameProcessor + '\'' +
                ", typeProcessor=" + typeProcessor +
                ", numberOfCores=" + numberOfCores +
                ", numberOfThreads=" + numberOfThreads +
                ", frequencyOfCore=" + frequencyOfCore +
                '}';
    }
}
enum TypeProcessor{
    INTEGRATED,
    DISCRETE;
}
