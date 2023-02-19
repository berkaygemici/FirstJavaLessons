package giris.dongu;

import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaç yıldızlı bir üçgen istediğiniz yazın(Sadece Tek Sayı): ");
        String yildiz = "*";
        int boslukSayi = 0;
        String bosluk = " ";
        int giris = input.nextInt();
        if (!(giris % 2 == 0)) {
            for (int i = giris; i >= 0; i = i - 2) {
                System.out.print(bosluk.repeat(boslukSayi));
                System.out.println(yildiz.repeat(i));
                boslukSayi +=1;
            }

        } else {
            System.out.println("Sadece tek sayı giriniz");
        }

    }
}
