package giris.dongu;
import java.util.Scanner;

public class teksayitoplami {
    public static void main(String[] args) {
        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if (n%4 ==0){
                total +=n;
            }

        } while (n%2 == 0);
        System.out.println("Toplam:"+total);

        }

        }

