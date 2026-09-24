import java.util.Scanner;

public class Extra5 {
    public static void main(String[] args) {
        int nota;
        Scanner lector =new Scanner(System.in);

        System.out.println("Inserte tu nota");
        nota = lector.nextInt();
        System.out.println("Terminaste tu Practicas(Si/No)");
        String prac = lector.next();

        if (nota < 5)
        {
            System.out.println("Tu nota es Suspenso");
        }
        else if (prac.equals("No"))
        {
            System.out.println("Tu nota es Suspenso por prácticas pendientes");
        }
        else if (nota < 7)
        {
            System.out.println("Tu nota es Aprobado");
        } else if (nota < 9)
        {
            System.out.println("Tu nota es Notable");
        }
        else if (nota <= 10)
        {
            System.out.println("Tu nota es Sobresaliente");
        }
    }
}
