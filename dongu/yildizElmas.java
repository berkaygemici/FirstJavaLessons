package giris.dongu;

import java.util.Scanner;

public class yildizElmas {
    public static void main(String[] args) {
        String yildiz = "*";
        String bosluk = " ";
        Scanner input = new Scanner(System.in);
        System.out.print("Ne Büyüklükte Bir Yıldız İstiyorsunuz[Yalnızca Tek Sayı Giriniz]: ");
        int yildizNumber = input.nextInt();
        if (yildizNumber % 2 == 0) {
            System.out.println("Lütfen yalnızca tek sayı giriniz!");
        } else {
            int half = yildizNumber / 2;
            for (int i = 1; i <= yildizNumber; i += 2) {
                System.out.println(" ".repeat(half - i / 2) + yildiz.repeat(i));
            }
            for (int i = yildizNumber - 2; i >= 1; i -= 2) {
                System.out.println(" ".repeat(half - i / 2) + yildiz.repeat(i));
            }
        }
    }
}