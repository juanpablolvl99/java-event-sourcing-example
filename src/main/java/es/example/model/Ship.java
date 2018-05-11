package es.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Juan
 */
public class Ship {
    private int id;
    private String name;
    private Port port;
    private List<Cargo> cargos;
    
    Ship(int id, String name, Port port) {
        this.id = id;
        this.name = name;
        this.port = port;
        this.cargos = new ArrayList<>();
    }

    public boolean addCargo(Cargo cargo) {
        return cargos.add(cargo);
    }

    public void emptyCargo() {
        cargos.clear();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the port
     */
    public Port getPort() {
        return port;
    }

    /**
     * @return the cargos
     */
    public List<Cargo> getCargos() {
        return cargos;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param port the port to set
     */
    public void setPort(Port port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", name: " + this.name + ", port: " + this.port.getName() + ", cargos: " + cargos;
    }
}