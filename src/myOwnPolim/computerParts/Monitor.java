package myOwnPolim.computerParts;

public class Monitor {
    private String nameMonitor;
    private int sizeMonitor;
    private TypeMonitor typeMonitor;

    @Override
    public String toString() {
        return "Monitor{" +
                "nameMonitor='" + nameMonitor + '\'' +
                ", sizeMonitor=" + sizeMonitor +
                ", typeMonitor=" + typeMonitor +
                '}';
    }
}

enum TypeMonitor{
    IPS,
    OLED,
    LED,
    VA,
    TN,
    MVA,
    QLED;
}
