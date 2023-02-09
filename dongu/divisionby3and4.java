package giris.dongu;
import java.util.Scanner;
public class divisionby3and4 {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayıya kadar hesaplansın: ");
        int kadar = input.nextInt();
        int sonsayi =0 ,bolumsayi = 0,ortalama = 0;
        for (int i=1; i<=kadar;i++) {
            if ((i%3==0) && (i%4==0)) {
                bolumsayi++;
                 sonsayi += i;


            }
        }
        sonsayi /= bolumsayi;
        System.out.println(sonsayi);


    }
}
