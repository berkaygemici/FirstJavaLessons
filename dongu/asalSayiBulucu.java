package giris.dongu;

import java.util.Scanner;

public class asalSayiBulucu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean asal;
        System.out.println("Lütfen hangi sayıya kadar taramak istiyorsanız yazınız");
        System.out.println("[UYARI] Çok büyük sayılar yazmak programın yavaş çalışmasına sebep olur ve bilgisayarınızı yavaşlatır!");
        int sinir = input.nextInt();
        for (int i = 2; i <= sinir; i++) {
            asal = true;
            for (int k = 2; k < i; k++) {
                if (i%k == 0) {
                    asal= false;
                    break;
                }
            }
            if (asal) {
                System.out.println(i);
        }
        }
    }
}


