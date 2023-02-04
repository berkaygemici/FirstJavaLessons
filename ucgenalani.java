package giris;
import java.util.Scanner;

public class ucgenalani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenar:");
        double kenarbir = input.nextDouble();

        System.out.print("İkinci kenar:");
        double kenariki = input.nextDouble();

        System.out.print("Üçüncü kenar:");
        double kenaruc = input.nextDouble();
        double ux = ((kenarbir+kenariki+kenaruc)/2);
        double alan = Math.sqrt((ux*(ux-kenarbir)*(ux-kenariki)*(ux-kenaruc)));
        System.out.println("Üçgeninizin alanı: "+alan);
    }
}
