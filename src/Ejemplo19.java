import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        double horas,salario;
        double im = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("introdusca tu horas trabajadas y tu paga horaria");
        horas = lector.nextDouble();
        salario = lector.nextDouble();

        double pago,pagof;
        if (horas >35)
        {
            pagof = salario*35;
            horas = horas-35;
            salario = salario*1.5;
            pagof = pagof + (salario*horas);
        }
        else
        {
            pagof = salario*horas;
        }
        System.out.println("Tu pago bruto es: "+ pagof);
        if (pagof > 500)
        {
            pago = 500;
            pagof = pagof-500;
            if (pagof > 400)
            {
                pago = pago + 300;
                pagof = pagof-400;
                im = 100;
                if (pagof > 0)
                {
                    im = pagof;
                    pagof = pagof*0.65;
                    pago = pago +pagof;
                    im = 100 + im - pagof;
                }
            }
            else
            {
                pagof = pagof*0.75;
                pago = pago + pagof;
            }
        }
        else
        {
            pago = pagof;
        }
        System.out.println("Tu salario neto: "+ pago);
        System.out.println("Y tuviste que pagar " + im + " de impuestos");
    }
}
