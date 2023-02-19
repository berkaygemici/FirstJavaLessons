package giris.dongu;

import java.util.Scanner;

public class sayiSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayıyı sıralamak istiyorsunuz: ");
        int donguSayi = input.nextInt();
        int guncelDongu = 1;
        System.out.print("Lütfen 1. sayıyı giriniz:");
        int buyuksayi = input.nextInt();
        int kucuksayi = buyuksayi;
        while (guncelDongu < donguSayi) {
            String guncelsayi = "Lütfen " + (guncelDongu + 1) + ". sayıyı giriniz:";
            System.out.print(guncelsayi);
            int alinanSayi = input.nextInt();
            if (alinanSayi > buyuksayi) {
                buyuksayi = alinanSayi;
            }
            if (alinanSayi < kucuksayi) {
                kucuksayi = alinanSayi;
            }
            guncelDongu += 1;
        }
        System.out.println("Girdiğiniz sayılardan en büyüğü: " + buyuksayi);
        System.out.println("Girdiğiniz sayılardan en küçüğü: " + kucuksayi);
    }
}

