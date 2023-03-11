package giris.methods;
import java.util.Scanner;

public class recursivePower {
    public static int usAlici(int taban,int us) {
        Scanner input = new Scanner(System.in);
        if (us==0) {
            return 1;
        } else if (us==1){
            return taban;
        } else {
            return taban*usAlici(taban,us-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Taban Sayısını Giriniz:");
        int taban = input.nextInt();
        System.out.print("Lütfen Üs Değerini Giriniz:");
        int us = input.nextInt();
        int sonuc = usAlici(taban,us);
        System.out.println("Sonuç: "+sonuc);
    }
}
