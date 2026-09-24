package Refuerzos1;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        int sueldo,gastos;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el sueldo y cambio estimado");
        sueldo = lector.nextInt();
        gastos = lector.nextInt();
        if (sueldo+gastos >= 0)
        {
            System.out.println("SI");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
