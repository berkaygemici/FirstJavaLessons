package giris;
import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz");
        muzik = input.nextInt();
        System.out.println("Ortalama hesaplaniyor.....");
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/6.0;
        System.out.println("Ortalamanız:" + ortalama);
        String son = ortalama > 60 ? "Gecti" : "Kaldi";
        System.out.println(son);


    }
}
