package giris.dongu;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı girin: ");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı girin: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("En büyük ortak bölen: " + ebob);
        System.out.println("En küçük ortak kat: " + ekok);
    }
}
