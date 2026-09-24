import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {
        int nota;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca tu nota:");
        nota = lector.nextInt();

        if (nota < 3)
        {
            System.out.println("Tu nota es Muy Deficiente");
        } else if ( nota < 5)
        {
            System.out.println("Tu nota es Insuficiente");
        }
        else if (nota < 6)
        {
            System.out.println("Tu nota es Suficiente");
        }
        else if (nota < 7)
        {
            System.out.println("Tu nota es Bien");
        }
        else if (nota < 9)
        {
            System.out.println("Tu nota es Notable");
        }
        else if (nota < 10)
        {
            System.out.println("Tu nota es Sobresaliente");
        }
        else
        {
            System.out.println("Tu nota no es correcta");
        }
    }
}
