import java.util.Scanner;

public class Extra2_cajero {
    public static void main(String[] args) {
        int cajero,retirada,cantidad,Salida=1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca Saldo inicial");
        cajero= lector.nextInt();
        do {
            System.out.println("Saldo:"+cajero+"€");
            System.out.println("1.Ingresar  2.Retirar    3.Salir");
            retirada= lector.nextInt();
            if (retirada==1)
            {
                System.out.print("Cantidad a Ingresar:");
                cantidad= lector.nextInt();
                cajero=cajero+cantidad;
            } else if (retirada==2) {
                System.out.print("Cantidad a Retirar:");
                cantidad= lector.nextInt();
                if (cantidad<=cajero)
                {
                    cajero=cajero-cantidad;
                }
                else
                {
                    System.out.println("No tienes tanto saldo");
                }
            } else if (retirada==3) {
                Salida=0;
            }
        }while(Salida==1);
    }
}
