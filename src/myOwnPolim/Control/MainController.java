package myOwnPolim.Control;

import myOwnPolim.computerTypes.Computer;

import java.util.List;

public interface MainController {
    void addComputer();

    void save(Computer computer);

    void remove(Computer computer);

    Computer getById(Integer id);
    
    List<Computer> getComputers();


}
