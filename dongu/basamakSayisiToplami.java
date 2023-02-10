package giris.dongu;

import java.util.Scanner;

public class basamakSayisiToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı:");
        String converted = input.nextLine();
        int basSayi = converted.length();
        int enSonuc=0;
        for (int i = 0; i < basSayi;i++ ) {
            int t = Integer.parseInt(String.valueOf(converted.charAt(i)));
            enSonuc +=t;
        }
        System.out.println(enSonuc);

    }
}
