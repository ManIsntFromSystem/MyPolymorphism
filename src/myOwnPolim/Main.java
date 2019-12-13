package myOwnPolim;

import myOwnPolim.computerParts.*;
import myOwnPolim.computerTypes.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setTypeComp(ComputerType.DESKTOP);
        laptop.setNameComp("MSI Aegis 3 8RC-206RU");
        laptop.setDescriptionComp("Powerful beast");
        laptop.setProcessor(new Processor("Intel Core i7-8700", TypeProcessor.DISCRETE, 6, 12, 3200.0));
        System.out.println(laptop);
    }
}
