import java.util.Scanner;

public class Extra2_Collatz {
    public static void main(String[] args) {
        int Collatz,Intentos=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca un numero natural");
        Collatz = lector.nextInt();
        do {
            if (Collatz%2==0)
            {
                Collatz=Collatz/2;
            }
            else
            {
                Collatz=Collatz*3;
                Collatz++;
            }
            Intentos++;
        }while(Collatz !=1);
        System.out.println("Tardo "+Intentos+" iteraciones");
    }
}
