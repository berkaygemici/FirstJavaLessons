package giris;

public class operators {
    public static void main(String[] args) {
        int a=5,b=6,c=5;
        boolean kosul1 = a==c;
        boolean kosul2 = a <=b;
        boolean sonuc = kosul1|| kosul2;
        System.out.println(sonuc);

        String str = sonuc ? "Doğru" : "Değil"; // 1:0
        System.out.println(str);
        //sirf degisiklik olsun die

    }
}
