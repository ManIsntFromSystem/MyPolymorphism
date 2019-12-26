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

    public String getNameProcessor() {
        return nameProcessor;
    }

    public void setNameProcessor(String nameProcessor) {
        this.nameProcessor = nameProcessor;
    }

    public TypeProcessor getTypeProcessor() {
        return typeProcessor;
    }

    public void setTypeProcessor(TypeProcessor typeProcessor) {
        this.typeProcessor = typeProcessor;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getNumberOfThreads() {
        return numberOfThreads;
    }

    public void setNumberOfThreads(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    public double getFrequencyOfCore() {
        return frequencyOfCore;
    }

    public void setFrequencyOfCore(double frequencyOfCore) {
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
