import java.util.Scanner;

public class Ejemplo21 {
    public static void main(String[] args) {
        int Year,op,op2,check=0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Inserte Año");
        Year = lector.nextInt();

        op = Year%400;
        if (op == 0)
        {
            check = 1;
        }
        op = Year%4;
        op2 = Year%100;
        if (op == 0 && op2 != 0)
        {
            check = 1;
        }
        if (check == 1)
        {
            System.out.println(Year + " es un año bisiesto");
        }
        else
        {
            System.out.println(Year + " no es un año bisiesto ");
        }

    }
}
