import java.util.Scanner;

public class Extra4 {
    public static void main(String[] args) {
        double coste;
        Scanner lector = new Scanner(System.in);

        System.out.println("Inserte el total de tus productos");
        coste = lector.nextDouble();
        System.out.println("Eres un socio (Si/No) ");
        String socio = lector.next();
        if (socio.equals("Si"))
        {
            if (coste > 100)
            {
                coste = coste*0.85;
            }
            else if (coste > 50)
            {
             coste = coste*0.90;
            }
        }
        else
        {
            if (coste > 50)
            {
                coste = coste*0.95;
            }
        }
        System.out.print("El precio de tu compro termino siendo: " + coste);
    }
}
