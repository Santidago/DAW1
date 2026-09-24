import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        double Inicial;
        double Descuento;

        Scanner lector = new Scanner(System.in);
        System.out.print("Introdusca precio original ");
        Inicial = lector.nextDouble();
        System.out.print("Introdusca precio actual ");
        Descuento = lector.nextDouble();

        double Salva = ((Inicial-Descuento)/Inicial*100);

        System.out.print("Esta actualmente en un " + Salva + "% de descuento");
    }
}
