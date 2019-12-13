package myOwnPolim.computerParts;

public class Motherboard {
    private String nameMotherboard;
    private TypeProcessor typeMotherboard;
    private TypeSocket typeSocket;
    private int numberOfSlotsRAM;

    @Override
    public String toString() {
        return "Motherboard{" +
                "nameMotherboard='" + nameMotherboard + '\'' +
                ", typeMotherboard=" + typeMotherboard +
                ", typeSocket=" + typeSocket +
                ", numberOfSlotsRAM=" + numberOfSlotsRAM +
                '}';
    }
}
enum TypeMotherboard{
    INTEGRATED,
    DISCRETE;
}
enum TypeSocket{
    AM4,
    AM4_PLUS,
    LA1151,
    LA1155;
}
