package Gun07;

public class _03_StringEndsWith {
    public static void main(String[] args) {
        // endswith= .. ile bitiyormu? sonuc true veya false
        String text="Merhaba Dunya";
        System.out.println("ya ile bitiyor mu ? = " + text.endsWith("ya"));
        System.out.println("ya ile bitiyor mu ? = " + text.endsWith("a"));
        System.out.println("ya ile bitiyor mu ? = " + text.endsWith("A"));
    }
}
