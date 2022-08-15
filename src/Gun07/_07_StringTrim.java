package Gun07;

public class _07_StringTrim {
    public static void main(String[] args) {
        // trim= Stringin basindaki veya sonundaki bosluk karakterlerini temizler.
        String text="  Merhaba dunya  ";
        System.out.println("text orjinal hali= -"+text+"-");
        System.out.println("bosluk yok="+text.trim());
    }
}
