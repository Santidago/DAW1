import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        double Preci, Precf;
        Scanner lector = new Scanner(System.in);

        System.out.println("Inserte el precio base del producto");
        Preci = lector.nextDouble();
        
        if (Preci < 6)
        {
         Precf = Preci;
        } else if (Preci < 60)
        {
         Precf = Preci*0.95;
        }
        else
        {
         Precf = Preci*0.90;
        }
        System.out.print("El precio actaul de tu producto es : " + Precf);
    }
}
