import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        int num,positive=0,check=0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba el numero 0");
        do {
            num = lector.nextInt();
            if (num == 0)
            {
                check = 1;
            } else if (num > 0)
            {
            positive++;
            }
        }while (check == 0);
        System.out.println("Escribiste " + positive + " numeros positivos antes de escribir 0");
    }
}
