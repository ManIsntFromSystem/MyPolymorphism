package myOwnPolim.main;

import myOwnPolim.Control.MainController;
import myOwnPolim.AllEnums.*;
import myOwnPolim.computerParts.*;
import myOwnPolim.computerTypes.Computer;
import myOwnPolim.computerTypes.Desktop;
import myOwnPolim.computerTypes.Laptop;


import java.util.List;

public class Main implements MainController {

    public static void main(String[] args) {
        CreateMainScreen createMainScreen = new CreateMainScreen();
        createMainScreen.CreateGUI();
    }

    @Override
    public void addComputer(){
        Computer desktop = new Desktop();
        Laptop laptop2 = new Laptop();
        desktop.setTypeComp(ComputerType.DESKTOP);
        desktop.setNameComp("MSI Aegis 3 8RC-206RU");
        desktop.setDescriptionComp("Powerful beast");
        desktop.setProcessor(new Processor("Intel Core i7-8700", TypeProcessor.DISCRETE,
                6, 12, 3200.0));
        desktop.setGraphicsCard(new GraphicsCard("NVIDIA GeForce GTX 1060", TypeGraphicsCard.DISCRETE,
                1556,6144, 8008));
        desktop.setRam(new RAM(null, 8, 2400));
        desktop.setMotherboard(new Motherboard("MSI B360", TypeFormFactor.ATX, TypeChipset.INTEL_B_360, TypeSocket.LGA_1151_V2, 4));
        desktop.setMonitor(null);
        System.out.println(desktop);
    }

    @Override
    public void save(Computer computer) {
        //computersList.add( computer);
    }

    @Override
    public void remove(Computer computer) {
        //computersList.remove(computer);
    }

    @Override
    public Computer getById(Integer id) {
        return null;//computersList.get(computersList.indexOf(id));
    }

    @Override
    public List<Computer> getComputers() {
        //return computersList;
        return null;
    }
}
