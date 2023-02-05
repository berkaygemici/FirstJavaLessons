package giris.operatorslesson;

import java.util.Scanner;

public class sayisirala {
    public static void main(String[] args) {
        // Küçükten büyüğe sıralama
        double sayi1, sayi2, sayi3,enkucuk=0,orta=0,enbuyuk = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz: ");
        sayi3 = input.nextDouble();
        if ((sayi1 > sayi2) && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                enkucuk = sayi3;
                orta = sayi2;
                enbuyuk = sayi1;
            } else {
                //s1>s3>s2
                enbuyuk = sayi1;
                enkucuk = sayi2;
                orta = sayi3;
            }
        } else if ((sayi2 > sayi3) && (sayi2 > sayi1)) {
            if (sayi3>sayi1) {
                // s2>s3>s1
                enbuyuk = sayi2;
                enkucuk = sayi1;
                orta = sayi3;
            } else {
                //s2>s1>s3
                enbuyuk = sayi2;
                enkucuk = sayi3;
                orta = sayi1;
            }

        } else if ((sayi3>sayi2) &&(sayi2>sayi1)) {
            //s3>s2>s1
            enbuyuk = sayi3;
            enkucuk = sayi1;
            orta = sayi2;
        } else if ((sayi3>sayi2) &&(sayi1>sayi2)) {
            //s3>s1>s2
            enbuyuk = sayi3;
            enkucuk = sayi2;
            orta = sayi1;
        }
        String siralama = String.format("Küçükten büyüğe sıralama şu şekildedir %s<%s<%s",enkucuk,orta,enbuyuk);
        System.out.println(siralama);
    }
}
