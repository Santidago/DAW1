import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        float num1;
        float num2;
        float orden;

        Scanner lector = new Scanner(System.in);
        System.out.print("Introdusca numero 1 = ");
        num1 = lector.nextFloat();
        System.out.print("Introdusca numero 2 = " );
        num2 = lector.nextFloat();
        System.out.print("Prefiere los numeros en 1.ascendente o 2.descendentemente " );
        orden = lector.nextFloat();

        if (orden == 1)
        {
            if (num1 > num2) {
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num1);
                System.out.println(num2);
            }
        }
        else if (orden == 2)
        {
            if (num1 < num2) {
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num1);
                System.out.println(num2);
            }
        }
    }
}
