package giris;
import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu kg cinsinden giriniz:");
        double kg = input.nextDouble();
        System.out.print("Lütfen boyunuzu M cinsinden giriniz:");
        double cm = input.nextDouble();
        double vki = (kg/(Math.pow(cm,2)));
        System.out.println("VÜCUT KİTLE İNDEXİNİZ: "+vki);




    }
}
