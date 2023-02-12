package giris.dongu;

import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen N sayısını giriniz:");
        int nNumber = input.nextInt();
        double harmonikSeri =0;
        for (int i = 1; i <= nNumber;i++) {
            harmonikSeri += (1.0/i);
        }
        System.out.println(harmonikSeri);
    }
}