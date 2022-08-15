package Gun06;

public class _04_StringIndexOf {
    public static void main(String[] args) {
        // verilen karakterin veya karakterlerin string icerisinde ki index ni verir.
        //Merhaba kelimesinde ki r nin indexi ni bulmak istersek kelime.IndexOf("r"); r nin kacta oldunu veriyor yani 2

        String kelime="Merhaba Dunya";
        System.out.println("kelime.IndexOf(r) = " + kelime.indexOf("r"));
        System.out.println("kelime.IndexOf(ha) = " + kelime.indexOf("ha"));
        System.out.println("kelime.IndexOf(a) = " + kelime.indexOf("a"));
        System.out.println("kelime.IndexOf(ny) = " + kelime.indexOf("ny"));
        System.out.println("kelime.IndexOf() = " + kelime.indexOf(" "));
        System.out.println("kelime.IndexOf() = " + kelime.indexOf("a",5));// 5 den sonrakinleri ariyor.
    }
}
