package giris;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut =2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilogram Patlıcan?:");
        double adet_pat = input.nextDouble();
        System.out.print("Kaç kilogram Armut?:");
        double adet_arm = input.nextDouble();
        System.out.print("Kaç kilogram Elma?:");
        double adet_elm = input.nextDouble();
        System.out.print("Kaç kilogram Domates?:");
        double adet_dom = input.nextDouble();
        System.out.print("Kaç kilogram Muz?:");
        double adet_muz = input.nextDouble();
        double toplam = ((adet_pat*patlican)+(adet_arm*armut)+(adet_dom*domates)+(adet_muz*muz)+(adet_elm*elma));
        System.out.println(toplam);

    }
}
