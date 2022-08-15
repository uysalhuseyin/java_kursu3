package Gun07;

public class _09_StringRelaceAll {
    public static void main(String[] args) {
        // ReplaceAll= replace gibi calisiyor farki sadece kriter(regax)
        //regax: regular expression / duzenli ifade
        //regex olarak neler yazilabilir google dan arastirilacak.
        String text="Merhaba Dunya";
        System.out.println("Orjinal hali="+text);
        System.out.println("a,b,n -"+text.replaceAll("[abn]","*"));
        System.out.println("a,b,n -"+text.replaceAll("[A-Z]","*"));
    }
}
