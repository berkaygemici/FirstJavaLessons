package giris.operatorslesson;
import java.util.Scanner;

public class havasicakligi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        double sicaklik = input.nextDouble();

        if (sicaklik < 5) {
            System.out.println("Sıcaklık 5 dereceden düşük olduğu için KAYAK sporunu öneriyoruz.");
        }
        else if ((5 <= sicaklik) && sicaklik < 15) {
            System.out.println("Sıcaklık 5 derece ile 15 derece arasında olduğundan SINEMA sporunu öneriyoruz.");
        }
        else if ((15 <= sicaklik) && sicaklik < 25) {
            System.out.println("Sıcaklık 15 derece ile 25 derece arasında olduğundan PIKNIK sporunu öneriyoruz.");
        }
        else if (sicaklik >= 25) {
            System.out.println("Sıcaklık 25 dereceden fazla olduğundan YUZME sporunu öneriyoruz.");
        }



    }
}



//todo Gelecek güncellemelerle hava sıcaklığını otomatik olarak internet üzerinden çeken bir program.