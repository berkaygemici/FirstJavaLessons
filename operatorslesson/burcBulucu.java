package giris.operatorslesson;

import java.util.Scanner;

public class burcBulucu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğdunuz ayı giriniz [1/12] formatında: ");
        int ay = input.nextInt();
        if (((ay <= 12) && (ay >= 1))) {
            System.out.print("Lütfen doğdunuz günü giriniz[1/31] formatında: ");
            int gun = input.nextInt();
            if ((gun <= 31) && (gun >= 1)) {
                if (ay == 3) {
                    if ((gun >= 21) && (gun <= 31)) {
                        System.out.println("Sizin burcunuz KOÇ");
                    } else {
                        System.out.println("Sizin burcunuz BALIK");
                    }
                }
                if (ay == 2) {
                    if ((gun >= 20 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz BALIK");
                    } else {
                        System.out.println("Sizin burcunuz KOVA");
                    }
                }
                if (ay == 1) {
                    if ((gun >= 22 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz KOVA");
                    } else {
                        System.out.println("Sizin burcunuz OĞLAK");
                    }
                }
                if (ay == 12) {
                    if ((gun >= 22 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz OĞLAK");
                    } else {
                        System.out.println("Sizin burcunuz YAY");
                    }
                }
                if (ay == 11) {
                    if ((gun >= 22 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz YAY");
                    } else {
                        System.out.println("Sizin burcunuz AKREP");
                    }
                }
                if (ay == 10) {
                    if ((gun >= 23 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz AKREP");
                    } else {
                        System.out.println("Sizin burcunuz TERAZİ");
                    }
                }
                if (ay == 9) {
                    if ((gun >= 23 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz TERAZİ");
                    } else {
                        System.out.println("Sizin burcunuz BAŞAK");
                    }
                }
                if (ay == 8) {
                    if ((gun >= 23 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz BAŞAK");
                    } else {
                        System.out.println("Sizin burcunuz ASLAN");
                    }
                }
                if (ay == 7) {
                    if ((gun >= 23 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz ASLAN");
                    } else {
                        System.out.println("Sizin burcunuz YENGEÇ");
                    }
                }
                if (ay == 6) {
                    if ((gun >= 23 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz YENGEÇ");
                    } else {
                        System.out.println("Sizin burcunuz İKİZLER");
                    }
                }
                if (ay == 5) {
                    if ((gun >= 22 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz İKİZLER");
                    } else {
                        System.out.println("Sizin burcunuz BOĞA");
                    }
                }
                if (ay == 4) {
                    if ((gun >= 21 && (gun <= 31))) {
                        System.out.println("Sizin burcunuz BOĞA");
                    } else {
                        System.out.println("Sizin burcunuz KOÇ");
                    }
                }
            } else {
                System.out.println("Girdiğiniz gün [1/31] arasında olmalıdır.");
            }


        } else {
            System.out.println("Girdiğiniz ay [1/12] arasında olmalıdır.");
        }
    }
}
