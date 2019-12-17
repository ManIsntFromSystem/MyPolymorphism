package myOwnPolim.computerParts;

import myOwnPolim.AllEnums.TypeMonitor;

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