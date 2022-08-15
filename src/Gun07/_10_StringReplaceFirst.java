package Gun07;

public class _10_StringReplaceFirst {
    public static void main(String[] args) {

        // replace ile ayni sadece ilk bulani degistirir.
        String text="Merhaba Dunya";
        System.out.println("Orjinal hali="+text);
        System.out.println("butun a lar degistirelim -"+text.replace("a","*"));
        System.out.println("ilk a yi degistirelim sadece -"+text.replaceFirst("a","*"));
    }
}
