package myOwnPolim;

import myOwnPolim.computerParts.*;
import myOwnPolim.computerTypes.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setTypeComp(ComputerType.DESKTOP);
        laptop.setProcessor("", "", );
        System.out.println(laptop);
    }
}
