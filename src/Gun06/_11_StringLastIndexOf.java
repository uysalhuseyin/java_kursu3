package Gun06;

public class _11_StringLastIndexOf {
    public static void main(String[] args) {
        //index of gibi calisir ama sondan itibaren index verir.
        String s1="Merhaba";
        System.out.println("Bastan a nin index = " + s1.indexOf("a"));
        System.out.println("Sonden baslayarak a nin index = " + s1.lastIndexOf("a"));
        // index her zmaan soldan sayilarak o dan itibaren baslar.
    }
}
