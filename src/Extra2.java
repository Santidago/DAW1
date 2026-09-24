import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        double kwh,coste;
        Scanner lector = new Scanner(System.in);

        System.out.println("Cuanto es tu consumo mensual de kWh");
        kwh = lector.nextDouble();
        if (kwh <= 100)
        {
            coste = 0.10*kwh;
        } else if (kwh <= 300)
        {
            coste = 0.10*100;
            kwh = kwh-100;
            coste = coste + 0.15*kwh;
        }
        else
        {
            kwh = kwh - 300;
            coste = 0.10*100 + 0.15*200 + 0.20*kwh;
        }
        System.out.println("Tu coste mensual deberia ser " + coste);
    }
}
