package giris;
import java.util.Scanner;
public class kdv_hesapla {
    public static void main(String[] args) {
        int kdvbir = 18,kdv2 = 8;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen hesaplamak istediğiniz miktarı giriniz:");
        int miktar = input.nextInt();

        int islem = (miktar <1000) ? kdvbir : kdv2;
        String str = (miktar <1000) ? "Miktarınız 1000TL'den düşük olduğundan %18 KDV uygulanmıştır" : "Miktarınız 1000TL'den yüksek olduğundan %18 KDV uygulanmıştır";
        System.out.println(str);
        double lastprice = (miktar < 1000) ? (((miktar * kdvbir)/100.0)+miktar) : (((miktar * kdv2)/100.0)+miktar);
        System.out.println("KDV'siz Fiyat:"+miktar);
        System.out.println("KDV'li Fiyat:"+lastprice);







    }
}
