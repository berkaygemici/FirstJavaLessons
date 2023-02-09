package giris.dongu;
import java.util.Scanner;

public class powerNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı:");
        int toplam = 1;
        int temel = input.nextInt();
        System.out.print("Kaçıncı Kuvveti:");
        int power = input.nextInt();
        for (int i = power; i>0;i--) {
            toplam *= temel;
        }
        System.out.println(toplam);
    }
}
