package myOwnPolim.computerParts;

import myOwnPolim.AllEnums.TypeChipset;
import myOwnPolim.AllEnums.TypeFormFactor;
import myOwnPolim.AllEnums.TypeProcessor;
import myOwnPolim.AllEnums.TypeSocket;

public class Motherboard {
    private String nameMotherboard;
    private TypeFormFactor typeFormFactor;
    private TypeChipset typeChipset;
    private TypeSocket typeSocket;
    private int numberOfSlotsRAM;

    public Motherboard(String nameMotherboard, TypeFormFactor typeFormFactor, TypeChipset typeChipset, TypeSocket typeSocket, int numberOfSlotsRAM) {
        this.nameMotherboard = nameMotherboard;
        this.typeFormFactor = typeFormFactor;
        this.typeChipset = typeChipset;
        this.typeSocket = typeSocket;
        this.numberOfSlotsRAM = numberOfSlotsRAM;
    }

    public String getNameMotherboard() {
        return nameMotherboard;
    }

    public void setNameMotherboard(String nameMotherboard) {
        this.nameMotherboard = nameMotherboard;
    }

    public TypeFormFactor getTypeFormFactor() {
        return typeFormFactor;
    }

    public void setTypeFormFactor(TypeFormFactor typeFormFactor) {
        this.typeFormFactor = typeFormFactor;
    }

    public TypeChipset getTypeChipset() {
        return typeChipset;
    }

    public void setTypeChipset(TypeChipset typeChipset) {
        this.typeChipset = typeChipset;
    }

    public TypeSocket getTypeSocket() {
        return typeSocket;
    }

    public void setTypeSocket(TypeSocket typeSocket) {
        this.typeSocket = typeSocket;
    }

    public int getNumberOfSlotsRAM() {
        return numberOfSlotsRAM;
    }

    public void setNumberOfSlotsRAM(int numberOfSlotsRAM) {
        this.numberOfSlotsRAM = numberOfSlotsRAM;
    }

    @Override
    public String toString() {
        return "Motherboard{\n" +
                "   NameMotherboard : " + nameMotherboard + ";\n" +
                "   TypeFormFactor : " + typeFormFactor + ";\n" +
                "   TypeChipset : " + typeChipset + ";\n" +
                "   TypeSocket : " + typeSocket + ";\n" +
                "   NumberOfSlotsRAM : " + numberOfSlotsRAM + ";\n" +
                '}';
    }
}