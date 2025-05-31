package PemlanUAP.models;

import PemlanUAP.bases.Shape;
import PemlanUAP.interfaces.*;

public class Torus extends Shape implements ShippingCostCalculator, MassConverter {
    private double majorRadius;
    private double minorRadius;
    
    public Torus() {}
    
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }
    
    @Override
    public double getVolume() {
        return 2 * PI * PI * minorRadius * minorRadius * majorRadius;
    }
    
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * minorRadius * majorRadius;
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