package PemlanUAP.bases;

import PemlanUAP.interfaces.*;

public abstract class Shape implements ThreeDimensional, PIRequired, MassCalculable {
    protected String name;
    
    public Shape() {}
    
    public void setName(String inputName) {
        this.name = inputName;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void printInfo();
    
    public double getMass() {
        return getVolume() * THICKNESS * DENSITY;
    }
}