package Gun04;

public class _00_Giris {
    public static void main(String[] args) {
        byte ogr1Not=90;

        int notToplam= ogr1Not; // byte turunu int turune atamis olduk.

        ogr1Not=(byte) notToplam; // int turunu byte turune donustururken
        // bunu bilerek yaptigimizi belirtmemiz gerekir.
    }
}
