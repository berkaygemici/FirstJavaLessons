package giris;
import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dik kenarlardan birincisini giriniz:");
        double kenar1 = input.nextDouble();
        System.out.print("Dik kenarlardan ikincisini giriniz:");
        double kenar2 = input.nextDouble();
        System.out.println("Hipotenüs hesaplanıyor.....");
        double hipo = Math.sqrt(((Math.pow(kenar1,2)) +(Math.pow(kenar2,2))));
        System.out.println(hipo);

    }
}
