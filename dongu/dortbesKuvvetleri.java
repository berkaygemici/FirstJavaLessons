package giris.dongu;

import java.util.Scanner;
import java.lang.Math;

public class dortbesKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 4 ve 5 in katlarını görmek istediğiniz sınır sayıyı girin:");
        int sinir = input.nextInt();
        int i;
        System.out.println("4'ün katları:");
        for (i = 1; i <= sinir; i++) {
            if ((Math.pow(4, i)) <= sinir) {
                System.out.println((Math.pow(4, i)));
            }
        }
        System.out.println("---------------------------------");
        System.out.println("5'in katları:");
        for (i = 1; i <= sinir; i++) {
            if ((Math.pow(5, i)) <= sinir) {
                System.out.println((Math.pow(5, i)));
            }
        }

    }
}
