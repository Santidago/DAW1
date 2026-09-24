import java.util.Scanner;

public class Ejemplo30 {
    public static void main(String[] args) {
        int tamano,bucle,pala=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un Palindromo");
        String Frase = lector.next();
        tamano = Frase.length();
        for (bucle = tamano-1;bucle > -1 ;bucle--)
        {
                if (Frase.charAt(pala) == Frase.charAt(bucle)) {
                    pala++;
                    if (bucle == 0) {
                        pala = -5;
                        break;
                    }
                } else {
                    break;
                }
            }
        if (pala ==-5)
        {
            System.out.println("yes");
        }
    }
}
