package myOwnPolim.computerParts;

import myOwnPolim.AllEnums.TypeProcessor;

public class Processor {
    private String nameProcessor;
    private TypeProcessor typeProcessor;
    private int numberOfCores;
    private int numberOfThreads;
    private double frequencyOfCore;

    public Processor(String nameProcessor, TypeProcessor typeProcessor, int numberOfCores, int numberOfThreads, double frequencyOfCore) {
        this.nameProcessor = nameProcessor;
        this.typeProcessor = typeProcessor;
        this.numberOfCores = numberOfCores;
        this.numberOfThreads = numberOfThreads;
        this.frequencyOfCore = frequencyOfCore;
    }

    @Override
    public String toString() {
        return "Processor{\n" +
                "   NameProcessor : " + nameProcessor + ";\n" +
                "   TypeProcessor : " + typeProcessor + ";\n" +
                "   NumberOfCores : " + numberOfCores + ";\n" +
                "   NumberOfThreads :" + numberOfThreads + ";\n" +
                "   FrequencyOfCore : " + frequencyOfCore + " MHz;\n" +
                '}';
    }
}
