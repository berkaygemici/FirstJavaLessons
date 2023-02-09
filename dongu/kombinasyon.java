package giris.dongu;

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaçın:");
        int upper = input.nextInt();
        System.out.print("Kaçlısı:");
        int downer = input.nextInt();
        int ustToplam = 1,altToplam =1;
        for (int i =upper;i>(upper-downer);i--) {
            ustToplam *=i;
        }
        for (int i = downer;i>1;i--) {
            altToplam *=i;
        }
       double sonuc = ustToplam/altToplam;
        System.out.println(sonuc);

    }
}