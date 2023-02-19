package giris.dongu;

import java.util.Scanner;

public class fibonacciDizisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaç basamaklı bir fibonacci dizisi olmasını istediğinizi yazınız: ");
        int n =input.nextInt();
        int current = 0;
        int last = 1;

        System.out.print("[");
        for (int i = 1; i <= n; i++) {
            System.out.print(current);
            if (i < n) {
                System.out.print(", ");
            }

            int temp = last;
            last = current;
            current = last + temp;
        }
        System.out.println("]");
    }
}