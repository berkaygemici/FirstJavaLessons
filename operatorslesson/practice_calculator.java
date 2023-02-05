package giris.operatorslesson;

import java.util.Scanner;

public class practice_calculator {
    public static void main(String[] args) {
        double sonuc;
        //Basit düzeyde bir hesap makinesi, tek sorgulu ve tek işlem yapma kapasitesine sahiptir.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yapmak istediginiz islemi yazin[toplama/cikarma/carpma/bolme]: ");
        String islem = input.nextLine();
        System.out.print(islem + " yapmak istediginiz sayilari girin\nSayı1:");
        double sayi1 = input.nextDouble();
        System.out.print("Lütfen 2.sayıyı giriniz:");
        double sayi2 = input.nextDouble();
        switch (islem) {
            case "toplama":
                sonuc = (sayi1 + sayi2);
                System.out.println("İşleminizin sonucu: " + sonuc);
                break;
            case "cikarma":
                sonuc = (sayi1 - sayi2);
                System.out.println("İşleminizin sonucu: " + sonuc);
                break;
            case "carpma":
                sonuc = (sayi1 * sayi2);
                System.out.println("İşleminizin sonucu: " + sonuc);
                break;
            case "bolme":
                if (sayi2 == 0) {
                    System.out.println("Bir sayi 0'a bolunemez!");
                    break;
                } else {
                    sonuc = (sayi1 / sayi2);
                    System.out.println("İşleminizin sonucu: " + sonuc);
                    break;
                }


            default:
                System.out.println("Geçersiz işlem seçildi.");
        }
        }


    }

