package giris.operatorslesson;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        // kan verme uyumluluğu checker
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        if (yas<18) {
            System.out.println("Yaşınız 18'den küçük olduğu için kan veremezsiniz.");
        }
        else if ((18 <= yas) && (yas < 50)) {

                System.out.print("Lütfen kilonuzu giriniz");
                int kilo = input.nextInt();
                if ( 40 < kilo && kilo <100) {
                    System.out.println("Kilonuz 40 ve 100 arasında olduğundan kan verebilirsiniz");
                }
                else {
                    System.out.println("Kilonuz 40 ve 100 arasında olmadığından kan veremezsiniz ");
                }


            }
        else {
            System.out.println("Yaşınız 50den büyük olduğundan kan veremezsiniz.");
        }
        }
    }

