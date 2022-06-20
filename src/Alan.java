import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3;
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenar : ");
        kenar1 = girdi.nextDouble();
        System.out.println("2.Kenar : ");
        kenar2 = girdi.nextDouble();
        System.out.println("3. Kenar : ");
        kenar3 = girdi.nextDouble();

        double b = (kenar1 + kenar2 + kenar3 ) / 2;
        double c = b * (b - kenar1) * (b - kenar2) * (b - kenar3);
        double alan = Math.sqrt(c);
        System.out.println(alan);





    }
}
