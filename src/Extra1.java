import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        double m,kg,imc;
        Scanner lector = new Scanner(System.in);

        System.out.println("introdusca tu peso y altura ");
        kg = lector.nextDouble();
        m = lector.nextDouble();
        imc = kg/(m*m);
        if (imc < 18.5)
        {
            System.out.println("Segun el Índice de Masa Corporal estas abajo de el peso normal ");
        } else if (imc < 24.9)
        {
            System.out.println("Segun el Índice de Masa Corporal sos el peso normal ");
        } else if (imc < 29.9)
        {
            System.out.println("Segun el Índice de Masa Corporal estas sobre el peso normal ");
        }
        else
        {
            System.out.println("Segun el Índice de Masa Corporal tenes obesidad ");
        }
    }
}
