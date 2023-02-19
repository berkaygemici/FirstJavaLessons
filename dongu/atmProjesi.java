package giris.dongu;

import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kul_adi, sifre;
        int hak = 3, bakiye = 0;
        boolean isLogged = false;
        boolean isRunning = true;
        while ((hak > 0) && (isLogged == false)) {
            System.out.print("Lütfen kullanıcı adınızı giriniz:");
            kul_adi = input.nextLine();
            System.out.print("Lütfen şifrenizi giriniz:");
            sifre = input.nextLine();
            if ((kul_adi.equalsIgnoreCase("admin")) && (sifre.equalsIgnoreCase("beko"))) {
                isLogged = true;
                while (isRunning) {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    int giris = input.nextInt();
                    switch (giris) {
                        case 1:
                            System.out.print("Lütfen yatırmak istediğiniz para miktarını giriniz: ");
                            int yatirma = input.nextInt();
                            bakiye += yatirma;
                            System.out.println("Güncel bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.print("Lütfen çekmek istediğiniz bakiye miktarını giriniz: ");
                            int cekme = input.nextInt();
                            if (cekme > bakiye) {
                                System.out.println("Çekmek istediğiniz miktar güncel bakiyenizden fazla olamaz!");
                            } else {
                                bakiye -= cekme;
                            }
                            System.out.println("Güncel bakiyeniz: " + bakiye);
                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor....");
                            isRunning = false;
                            break;
                    }
                }
            } else {
                System.out.println("Kullanıcı adı veya şifre hatalı!");
                hak -= 1;
                System.out.println("Kalan hakkınız:" + hak);
            }
        }
        System.out.println("Hakkınız dolmuştur. Lütfen bankanızla iletişime geçiniz");

    }
}
//TODO SQL E BAĞLI OLARAK ÇALIŞAN HESAP BİLGİSİ ÇEKEN SİSTEM YAP