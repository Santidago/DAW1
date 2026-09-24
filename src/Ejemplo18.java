import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        int hora, minuto,segundo;
        Scanner lector = new Scanner(System.in);

        System.out.println("Cual es el horario");
        hora = lector.nextInt();
        minuto = lector.nextInt();
        segundo = lector.nextInt();
        segundo++;
        if (segundo == 60)
        {
            segundo = 0;
            minuto++;
            if (minuto == 60)
            {
                minuto = 0;
                hora++;
                if (hora == 24)
                {
                    hora = 0;
                }
            }
        }
        System.out.print("La hora aumento a: " + hora + ":" + minuto + ":" + segundo);
    }
}
