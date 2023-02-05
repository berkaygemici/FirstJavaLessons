package giris.operatorslesson;

import java.util.Scanner;

public class usersystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı giriniz:");
        String kuladi, sifre;
        kuladi = input.nextLine();
        System.out.print("Lütfen şifrenizi  giriniz:");
        sifre = input.nextLine();
        if ((kuladi.equals("admin")) && (sifre.equals("demo"))) {
            System.out.println("Giriş başarılı!");
        } else if ((kuladi.equals("admin")) && !sifre.equals("demo")) {
            System.out.print("Şifreyi yanlış girdiniz. Şifrenizi sıfırlamak isterseniz Y'ye basın istemiyorsanız N'ye basınız.[Y/N]");
            String rtnn = input.nextLine();
            if (rtnn.equals("Y")) {
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                String passnewer = input.nextLine();
                if (!passnewer.equals("demo")) {
                    System.out.print("Lütfen doğrulama amacıyla şifrenizi bir daha giriniz: ");
                    String checklast = input.nextLine();
                    if (passnewer.equals(checklast)) {
                        sifre = checklast;
                        System.out.println("Şifreniz başarıyla güncellenmiştir!");
                    } else {
                        System.out.println("Girdiğiniz şifreler eşleşmemiştir.");
                    }

                } else {

                    System.out.println("Yeni şifre eski şifrenizden farklı olmalıdır!");
                }



            } else if (rtnn.equals("N")) {
                System.out.println("Şifreniz değiştirilmedi.");
            }

        } else {
            System.out.println("Kullanıcı adı yanlış. Yanlış hesaba girmeye çalışıyorsunuz.");
        }
    }
}

