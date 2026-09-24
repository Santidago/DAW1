package Refuerzos1;

import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        double hoja,edificio,dobles;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el grosor del papel(micras) y altura del edificio(metros)");
        hoja = lector.nextDouble();
        edificio = lector.nextDouble();
        hoja = hoja/1000000;
        for (dobles=0;edificio>hoja;dobles++)
        {
            hoja= hoja*2;
        }
        System.out.println(dobles);
    }
}
