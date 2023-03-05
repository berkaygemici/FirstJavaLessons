package giris.methods;

import java.util.Scanner;

public class palindromSayi {
    static boolean isPalindrom() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen öğrenmek istediğiniz sayıyı giriniz:");
        int keks = input.nextInt();
        int lastnumber = 0;
        int temp = keks;
        do {
            int lstWord = temp % 10;
            lastnumber = (lastnumber * 10) + lstWord;
            temp /= 10;

        } while (temp > 0);
        if (keks == lastnumber) {
            System.out.println(keks + " Sayısı palindrom bir sayıdır");
            return true;
        } else {
            System.out.println(keks + " Sayısı palindrom bir sayı değildir");
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrom();

    }
}
