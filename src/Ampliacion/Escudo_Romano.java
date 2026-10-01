package Ampliacion;

import java.util.Scanner;

public class Escudo_Romano {
    public static void main(String[] args) {
        int Romanos,cant,forma;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca la cantidad de Romanos");
        Romanos = lector.nextInt();
        do {
            cant= 0;
            do
            {
                cant++;
                forma=Romanos-(cant*cant);
                if (forma<0)
                {
                    System.out.printf("Una formacion de %d por %d%n", cant - 1, cant - 1);
                }
            }while (forma>=0);
            Romanos = Romanos-((cant-1)*(cant-1));
            if (Romanos<0)
            {
                Romanos = -Romanos;
            }
            if (Romanos==1)
            {
                Romanos=0;
                System.out.printf("Una formacion de 1 por 1%n");
            }
        }while (Romanos>0);
    }
}
