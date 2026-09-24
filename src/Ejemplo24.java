import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        int nota=0,notaf=0,num=-1,dies=0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba las notas (introdusca -1 como la ultima nota)");
        do {
            notaf = notaf + nota;
            num++;
            if (nota == 10)
            {
                dies++;
            }
            nota = lector.nextInt();
        }while (nota != -1);
        nota = notaf/num;
        System.out.println("La nota media es " + nota + " de un total de " + num + " notas");
        System.out.println(dies +  " de las notas fueron un 10");
    }
}
