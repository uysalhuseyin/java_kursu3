package Gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
        // String belli bir bolumunu alma islemi yapar
        String s1="Merhaba arkadaslar";
        String parca1=s1.substring(2,6);// 2 nolu indexten 6 yada kadar olani aliyor. 6 dahil degil.
        System.out.println("parca1 = " + parca1);

        System.out.println(" 3.bolum arkadaslar " +s1.substring(8));
        // verilen yerden baslayarak sonuna kadar kimi alir.
    }
}
