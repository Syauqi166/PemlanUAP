package PemlanUAP.models;

import PemlanUAP.bases.Shape;
import PemlanUAP.interfaces.*;

public class Sphere extends Shape implements ShippingCostCalculator, MassConverter {
    private double radius;
    
    public Sphere() {}
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }
    
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return getVolume() * THICKNESS * DENSITY;
    }
    
    @Override
    public void printInfo() {
        System.out.printf("Volume : %.2f cm³%n", getVolume());
        System.out.printf("Luas permukaan : %.2f cm²%n", getSurfaceArea());
        System.out.printf("Massa : %.2f gram%n", getMass());
    }
   
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }
    
    @Override
    public double calculateCost(){
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }
}
