package Gun06;

public class _07_StringContains {
    public static void main(String[] args) {
        // bir string icinde karakterlerin var olup olmadigi soyler.
        // bolean cinsinden true veya false dondurur.
        String kelime="Merhaba Dunya";
        boolean varmi=kelime.contains("a");
        System.out.println("varmi = " + varmi);
        System.out.println("varmi = " + kelime.contains("f"));
    }
}
