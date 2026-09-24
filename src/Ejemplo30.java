import java.util.Scanner;

public class Ejemplo30 {
    public static void main(String[] args) {
        int tamaño,bucle=0,pala=1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un Palindromo");
        String Frase = lector.next();
        tamaño = Frase.length();
        for (bucle = tamaño;bucle > -1 ;bucle--)
        {
            if (Frase.charAt(pala) == Frase.charAt(bucle))
            {}
        }



    }
}
