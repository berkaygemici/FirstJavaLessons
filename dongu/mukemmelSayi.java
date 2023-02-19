package giris.dongu;
import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam=0;
        System.out.print("Lütfen öğrenmek istediğiniz sayıyı giriniz:");
        int giris = input.nextInt();
        for (int i =1;i<giris;i++) {
            if (giris%i == 0) {
                toplam +=i;

            }
        }

        if (giris == toplam) {
            System.out.println(giris +" sayısı mükemmel bir sayıdır");
        } else {
            System.out.println(giris + " sayısı mükemmel bir sayı değildir");
        }
    }
}
