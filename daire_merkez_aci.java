package giris;
import java.util.Scanner;
public class daire_merkez_aci {
    public static void main(String[] args) {
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program
        double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Merkez Alfa Açısını giriniz:");
        int alfa = input.nextInt();

        System.out.print("Yarıçapı giriniz:");
        int yaricap = input.nextInt();

        double alan = (pi*(Math.pow(yaricap,2))*alfa)/360;
        System.out.println("Dairenin Alanı: " +alan);





    }
}
