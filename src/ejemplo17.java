import java.util.Scanner;

public class ejemplo17 {
    public static void main(String[] args) {
        int mes;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdusca un mes");
        mes = lector.nextInt();
        switch (mes)
        {
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tu mes tiene 31 días");
                break;
            case 2:
                System.out.println("Tu mes tiene 28 días");
                break;
            default:
                System.out.println("Tu mes tiene 30 días");
                break;
        }
    }
}
