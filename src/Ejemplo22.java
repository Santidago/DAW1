import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        int num,positive=0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba 10 numeros");
        for (int counter = 1;counter <11; counter++)
        {
            num = lector.nextInt();
            if (num >= 0)
            {
                positive++;
            }
        }
        System.out.println(positive + " de 10 numeros fueron positivos");
    }
}
