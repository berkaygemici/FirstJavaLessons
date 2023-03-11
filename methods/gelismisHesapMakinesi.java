package giris.methods;

import java.util.Scanner;
import java.lang.Math;

public class gelismisHesapMakinesi {
    static void toplama() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaç sayıyı toplamak istediğinizi yazın:");
        int donguSayi = input.nextInt();
        int toplam = 0;
        for (int i = 1; i <= donguSayi; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz:");
            int degerler = input.nextInt();
            toplam += degerler;
        }
        System.out.println(toplam);
    }

    static void cikartma() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen çıkartmak istediğiniz sayıyı giriniz:");
        int toplam = input.nextInt();
        System.out.print("Lütfen kaç sayıyı çıkartmak istediğinizi yazın:");
        int donguSayi = input.nextInt();
        for (int i = 1; i <= donguSayi; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz:");
            int degerler = input.nextInt();
            toplam -= degerler;
        }
        System.out.println(toplam);
    }

    static void carpma() {
        System.out.println("[ 1 SAYISI GİRİLENE KADAR ÇARPMA İŞLEMİNE DEVAM EDER! ]");
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı:");
            number = input.nextInt();
            if (number == 1) {
                break;
            } else if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
            if (i != 2) {
                System.out.println("Girdiğiniz sayıların çarpımı: " + result);
            }
        }
        System.out.println("Sonuç: " + result);
    }

    static void bolme() {
        System.out.println("[ 1 SAYISI GİRİLENE KADAR BÖLME İŞLEMİNE DEVAM EDER! ]");
        Scanner input = new Scanner(System.in);
        double number, result = 1;
        int i = 1;
        while (true) {
            System.out.print(i++ + ". sayı:");
            number = input.nextDouble();
            if (number == 1) {
                break;
            } else if (number == 0) {
                System.out.println("Sayılar 0'a bölünemez!");
                System.out.println(result);
                return;
            }
            if (i == 2) {
                result = number;
                continue;
            }
            if (result == 0) {
                System.out.println("Bölme işlemi sırasında sıfıra bölme hatası!");
                return;
            }
            result /= number;
            System.out.println("Girdiğiniz sayıların bölümü: " + result);
        }
        System.out.println("Sonuç: " + result);
    }

    static void usluSayi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Taban Sayısını Giriniz:");
        int taban = input.nextInt();
        System.out.print("Lütfen Kuvvet Değerini Giriniz:");
        int kuvvet = input.nextInt();
        int toplam = 1;
        for (int i = 1; i <= kuvvet; i++) {
            toplam *= taban;
        }
        System.out.println(toplam);
    }

    static void faktoriyel() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Faktöriyelini İstediğiniz Sayıyı Giriniz:");
        int nummer = input.nextInt();
        int toplam = 1;
        for (; nummer >= 1; nummer--) {
            toplam *= nummer;
        }
        System.out.println(toplam);
    }

    static void modAl() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bölünmesini İstediğiniz Sayı Değerini Giriniz: ");
        int erste = input.nextInt();
        System.out.print("Lütfen Bölüm Değerini Giriniz: ");
        int zweite = input.nextInt();
        int kalan = erste % zweite;
        System.out.println(kalan);
    }

    static void dikdortgen() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dikdörtgenin Kısa Kenarını Yazınız:");
        double kisa = input.nextDouble();
        System.out.print("Lütfen Dikdörtgenin Uzun Kenarını Yazınız:");
        double uzun = input.nextDouble();
        double cevre = 0, alan = 0;
        alan = kisa * uzun;
        cevre = (kisa * 2) + (uzun * 2);
        System.out.println("Dikdörtgeninizin Alanı: " + alan);
        System.out.println("Dikdörtgeninizin Çevresi: " + cevre);
    }

    static void hipotenus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dik Kenarlardan Birinci Kenarı Giriniz:");
        int kenarBir = input.nextInt();
        System.out.print("Lütfen Dik Kenarlardan İkinci Kenarı Giriniz:");
        int kenarIki = input.nextInt();
        double cevap = Math.sqrt(Math.pow(kenarBir, 2) + Math.pow(kenarIki, 2));
        System.out.println(cevap);
    }

    static void yuzde() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yüzdesini hesaplamak istediğiniz sayıyı giriniz:");
        double giris = input.nextDouble();
        System.out.print("Yüzde Kaci:");
        double yuzde = input.nextDouble();
        double sonuc = ((giris * yuzde) / 100);
        System.out.println(sonuc);
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "9- Dik Üçgende Hipotenüs Hesabı\n"
                + "10- Yüzde Hesabı\n"
                + "0- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    Thread.sleep(2000);
                    break;
                case 2:
                    cikartma();
                    Thread.sleep(2000);
                    break;
                case 3:
                    carpma();
                    Thread.sleep(2000);
                    break;
                case 4:
                    bolme();
                    Thread.sleep(2000);
                    break;
                case 5:
                    usluSayi();
                    Thread.sleep(2000);
                    break;
                case 6:
                    faktoriyel();
                    Thread.sleep(2000);
                    break;
                case 7:
                    modAl();
                    Thread.sleep(2000);
                    break;
                case 8:
                    dikdortgen();
                    Thread.sleep(2000);
                    break;
                case 9:
                    hipotenus();
                    Thread.sleep(2000);
                    break;
                case 10:
                    yuzde();
                    Thread.sleep(2000);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz!");
            }

        } while (select != 0);
    }
}
