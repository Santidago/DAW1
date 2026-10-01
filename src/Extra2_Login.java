import java.util.Scanner;

public class Extra2_Login {
    public static void main(String[] args) {
        int Incorectos=1;
        String Verdad = "Truetry";
        Scanner lector = new Scanner(System.in);
        for (int intentos=0;intentos<5;intentos++) {
            System.out.println("Introdusca Contraseña");
            String Contrasena = lector.next();
            if (Contrasena.equals(Verdad))
            {
                System.out.println("Acceso concedido");
                Incorectos=0;
                break;
            }
        }
        if (Incorectos==1) {
            System.out.println("Intentos maximos alcanzados");
        }
        }
}
