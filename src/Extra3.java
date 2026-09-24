import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        double lad,ladb,ladc;
        Scanner lector = new Scanner(System.in);

        System.out.println("introdusca los 3 lados de un triangulo");
        lad = lector.nextDouble();
        ladb = lector.nextDouble();
        ladc = lector.nextDouble();
        if ((lad+ladb) > ladc && (lad+ladc) > ladb && (ladb+ladc) > lad)
        {
            if (lad == ladb && ladc == lad)
            {
                System.out.println("Tu triangulo es equilátero");
            } else if (lad != ladb && lad != ladc && ladb != ladc)
            {
                System.out.println("Tu triangulo es escaleno");
            }
            else
            {
                System.out.println("Tu triangulo es isósceles");
            }
        }
        System.out.println("Por favor inserte un valores reales");
    }
}
