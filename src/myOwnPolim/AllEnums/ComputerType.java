package myOwnPolim.AllEnums;

public enum ComputerType {
    LAPTOP("Laptop"),
    DESKTOP("Desktop"),
    MONOBLOCK("Monoblock"),
    TABLETS("Tablet");

    private final String nameOfTypeComp;

    ComputerType(String nameOfTypeComp) {
        this.nameOfTypeComp = nameOfTypeComp;
    }

    public String getNameOfTypeComp() {
        return nameOfTypeComp;
    }
}
