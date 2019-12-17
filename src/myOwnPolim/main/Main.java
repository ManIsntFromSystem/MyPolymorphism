package myOwnPolim.main;

import Control.MainController;
import myOwnPolim.AllEnums.*;
import myOwnPolim.computerParts.*;
import myOwnPolim.computerTypes.Computer;
import myOwnPolim.computerTypes.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Main implements MainController {
    private List<Computer> computersList = new ArrayList<>();

    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        mainScreen.createGUI().setVisible(true);
    }

    @Override
    public void addComputer(){
        Computer laptop = new Laptop();
        Laptop laptop2 = new Laptop();
        laptop.setTypeComp(ComputerType.DESKTOP);
        laptop.setNameComp("MSI Aegis 3 8RC-206RU");
        laptop.setDescriptionComp("Powerful beast");
        laptop.setProcessor(new Processor("Intel Core i7-8700", TypeProcessor.DISCRETE,
                6, 12, 3200.0));
        laptop.setGraphicsCard(new GraphicsCard("NVIDIA GeForce GTX 1060", TypeGraphicsCard.DISCRETE,
                1556,6144, 8008));
        laptop.setRam(new RAM(null, 8, 2400));
        laptop.setMotherboard(new Motherboard("MSI B360", TypeFormFactor.ATX, TypeChipset.INTEL_B_360, TypeSocket.LGA_1151_V2, 4));
        laptop.setMonitor(null);
        System.out.println(laptop);
    }

    @Override
    public void save(Computer computer) {
        computersList.add( computer);
    }

    @Override
    public void remove(Computer computer) {
        computersList.remove(computer)
    }

    @Override
    public Computer getById(Integer id) {
        computersList.get(computersList.indexOf(id));
    }

    @Override
    public List<Computer> getComputers() {
        return computersList;
    }
}
