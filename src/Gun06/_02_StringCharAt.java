package Gun06;

public class _02_StringCharAt {
    public static void main(String[] args) {
        // istenen noktadaki karakteri verir.
        // Karekterin sirasi 0 dan baslar buna index denir/
        String kelime="merhaba Dunya";
        System.out.println("3.Harf(indexe gore) = " + kelime.charAt(3));
        char ilkharf=kelime.charAt(0);
        System.out.println("ilkharf = " + ilkharf);
    }
}
