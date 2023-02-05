package giris.operatorslesson;
import java.util.Scanner;
public class sinifgecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ortalama 55 üstü ise öğrenciyi geçir, girilen not 0,100 arasında ise ortalamaya dahil etme!
        int matematik, fizik, turkce, kimya, muzik, dersSayisi = 0, gecmenotu = 55;
        double ortalama = 0;
        System.out.print("Lütfen matematik dersinden aldiginiz notu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Lütfen fizik dersinden aldiginiz notu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Lütfen türkçe dersinden aldiginiz notu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Lütfen kimya dersinden aldiginiz notu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Lütfen müzik dersinden aldiginiz notu giriniz: ");
        muzik = input.nextInt();
        if ( 0 <= matematik && 100 >= matematik) {
            dersSayisi +=1;
            ortalama += matematik;
        }
        if ( 0 <= fizik && 100 >= fizik) {
            dersSayisi +=1;
            ortalama += fizik;
        }
        if ( 0 <= turkce && 100 >= turkce) {
            dersSayisi +=1;
            ortalama += turkce;
        }
        if ( 0 <= kimya && 100 >= kimya) {
            dersSayisi +=1;
            ortalama += kimya;
        }
        if ( 0 <= muzik && 100 >= muzik) {
            dersSayisi +=1;
            ortalama += muzik;
        }
        ortalama /= dersSayisi;
        if (ortalama < gecmenotu) {
            String gecmedi = String.format("Maalesef ortalamanız geçmeye yetmedi! Ortalamanız: %s",ortalama);
            System.out.println(gecmedi);
        }
        else {
            String gecti = String.format("Başarı ile geçtiniz! Ortalamanız: %s",ortalama);
            System.out.println(gecti);

        }

    }
}
