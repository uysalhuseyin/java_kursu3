package Gun17;

public class _10_ArrayOdev5 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.

        int [] dizi={5,6,8,12,14,19};
        int sonuc=0;

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2==0){
                sonuc+=dizi[i];
            }
            else
                sonuc-=dizi[i];

        }
        System.out.println("tek ise cikar cift ise topla="+sonuc);
    }

}
