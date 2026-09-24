package Refuerzos1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int num;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un numero");
        num = lector.nextInt();
        System.out.println(num + " x 2 = " + (num*2));
        System.out.println(num + " x 3 = " + (num*3));
    }
}
