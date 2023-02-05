package giris.operatorslesson;

import java.util.Scanner;

public class ucakBiletiUcretiHesaplama {
    public static void main(String[] args) {
        //Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen KM verisi girin: ");
        int km = input.nextInt();
        System.out.print("Lütfen YAŞ verisi girin: ");
        int yas = input.nextInt();
        System.out.print("Lütfen Gidiş-Dönüş verisi girin[1:TEK YÖN/2 GİDİŞ-DÖNÜŞ]: ");
        int tip = input.nextInt();
        double kmucret = 0.10;
        if ((km > 0) && (tip == 1)) {
            double fullucret = km * kmucret;
            System.out.println("Uçuşunuzun indirimsiz hali: " + fullucret);
            if (yas < 12) {
                double indirimli = fullucret * 0.5;
                System.out.println("Yaş indirimi kazandınız! Uçuşunuzun son fiyatı: " + indirimli);
            } else if ((yas >= 12) && (yas <= 24)) {
                double indirimli = fullucret - ((fullucret * 10) / 100);
                System.out.println("Yaş indirimi kazandınız! Uçuşunuzun son fiyatı: " + indirimli);
            } else if (yas > 65) {
                double indirimli = fullucret - ((fullucret * 30) / 100);
                System.out.println("Yaş indirimi kazandınız! Uçuşunuzun son fiyatı: " + indirimli);
            }
        } else if ((km > 0) && (tip == 2)) {
            double fullucret = km * kmucret;
            System.out.println("Uçuşunuzun indirimsiz hali: " + fullucret);
            if (yas < 12) {
                double indirimli = fullucret * 0.5;
                double sonindirim = ((fullucret * 20) / 100);
                double sonucret = indirimli - sonindirim;
                System.out.println("Yaş ve gidiş-dönüş indirimi kazandınız! Uçuşunuzun son fiyatı: " + sonucret);
            } else if ((yas >= 12) && (yas <= 24)) {
                double indirimli = fullucret - ((fullucret * 10) / 100);
                double sonindirim = ((fullucret * 20) / 100);
                double sonucret = indirimli - sonindirim;
                System.out.println("Yaş ve gidiş-dönüş indirimi kazandınız! Uçuşunuzun son fiyatı: " + sonucret);
            } else if (yas > 65) {
                double indirimli = fullucret - ((fullucret * 30) / 100);
                double sonindirim = ((fullucret * 20) / 100);
                double sonucret = indirimli - sonindirim;
                System.out.println("Yaş ve gidiş-dönüş indirimi kazandınız! Uçuşunuzun son fiyatı: " + sonucret);
            }
        } else {
            System.out.println("KM verisi pozitif olmalı ve gidiş-dönüş seçeneği[1/2] seçilmelidir!");
        }
    }
}
//TODO GELECEKTE HESABA DAYALI MIL IŞLEMİ YAPILABİLİR
