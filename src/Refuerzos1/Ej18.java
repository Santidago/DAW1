package Refuerzos1;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        int num,gen;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un numero");
        num = lector.nextInt();
        for(gen = 1; gen<6;gen++)
        {
            if (num % 2 == 1)//impar
            {
                num++;
                System.out.println((num+(gen*2)-2));
                num--;
            }
            else//par
            {
                System.out.println((num+(2*gen)));
            }
        }
    }
}
