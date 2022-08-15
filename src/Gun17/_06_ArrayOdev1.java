package Gun17;

public class _06_ArrayOdev1 {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.

        String[] dizi={"apple","orange","banan","pineapple"};
        boolean varmi;
        for (int i = 0; i < dizi.length ; i++) {
            if(dizi[i]=="orange"){
                varmi=true;
                System.out.println(varmi);

            }




        }


    }
}
