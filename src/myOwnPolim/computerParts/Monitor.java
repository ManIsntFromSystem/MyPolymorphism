package myOwnPolim.computerParts;

import myOwnPolim.AllEnums.TypeMonitor;

public class Monitor {
    private String nameMonitor;
    private int sizeMonitor;
    private TypeMonitor typeMonitor;

    public Monitor(String nameMonitor, int sizeMonitor, TypeMonitor typeMonitor) {
        this.nameMonitor = nameMonitor;
        this.sizeMonitor = sizeMonitor;
        this.typeMonitor = typeMonitor;
    }

    public String getNameMonitor() {
        return nameMonitor;
    }

    public void setNameMonitor(String nameMonitor) {
        this.nameMonitor = nameMonitor;
    }

    public int getSizeMonitor() {
        return sizeMonitor;
    }

    public void setSizeMonitor(int sizeMonitor) {
        this.sizeMonitor = sizeMonitor;
    }

    public TypeMonitor getTypeMonitor() {
        return typeMonitor;
    }

    public void setTypeMonitor(TypeMonitor typeMonitor) {
        this.typeMonitor = typeMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "nameMonitor='" + nameMonitor + '\'' +
                ", sizeMonitor=" + sizeMonitor +
                ", typeMonitor=" + typeMonitor +
                '}';
    }
}