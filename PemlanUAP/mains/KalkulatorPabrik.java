package PemlanUAP.mains;

import PemlanUAP.models.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat rupiah = new DecimalFormat("#,###");
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("SYAUQI AHNAF HEDIYANTO");
        System.out.println("245150701111022");
        System.out.println("=============================================");
        
        // Donat dengan lubang (Torus)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius : ");
        double majorRadius = input.nextDouble();
        System.out.print("Isikan radius : ");
        double minorRadius = input.nextDouble();
        
        Torus torus = new Torus(majorRadius, minorRadius);
        
        System.out.println("=============================================");
        torus.printInfo();
        System.out.printf("Massa dalam kg : %.2f kg%n", torus.gramToKilogram());
        System.out.printf("Biaya kirim : Rp%s%n", rupiah.format(torus.calculateCost()));
        System.out.println("=============================================");
        
        // Donat tanpa lubang (Sphere)
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius : ");
        double sphereRadius = input.nextDouble();
        
        Sphere sphere = new Sphere(sphereRadius);
        
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.printf("Massa dalam kg : %.2f kg%n", sphere.gramToKilogram());
        System.out.printf("Biaya kirim : Rp%s%n", rupiah.format(sphere.calculateCost()));
        System.out.println("=============================================");
        
        input.close();
    }
}