package giris.operatorslesson;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen öğrenmek istediğiniz yılı giriniz: ");
        int yil = input.nextInt();
        if (yil%4 == 0) {
            if (yil%100 == 0) {
                if (yil%400 == 0) {
                    System.out.println("Girdiğiniz yıl tam 400'ün katı bir ARTIK YIL! BİNGO!");
                }else {
                    System.out.println("Girdiğiniz yıl 4'ün katı fakat;Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.");
                }
            } else {
                System.out.println("Girdiğiniz "+yil+" yılı ARTIK YILDIR!");
            }

        } else {
            System.out.println("Girdiğiniz "+yil+" yılı artık yıl değildir.");
        }
    }
}
