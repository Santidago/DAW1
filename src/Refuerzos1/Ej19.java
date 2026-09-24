package Refuerzos1;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        double distancia,velocidadmax,tiempo,limite;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca la distancia(metros), velocidad maxima(hm/h) y el tiempo(segundos)");
        distancia = lector.nextDouble();
        velocidadmax = lector.nextDouble();
        tiempo = lector.nextDouble();
        velocidadmax = velocidadmax/3.6;//de km/h a m/s
        limite = distancia/tiempo;
        if (limite < velocidadmax)
        {
            System.out.println("OK");
        }
        else if (limite < velocidadmax*1.2)
        {
            System.out.println("Multa");
        }
        else if (limite > velocidadmax)
        {
            System.out.println("Puntos");
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}
