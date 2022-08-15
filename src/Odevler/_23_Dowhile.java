package Odevler;

public class _23_Dowhile {
    public static void main(String[] args) {
        //100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        int number=100;
        while (number>0){

            if (number%2==1){
                System.out.println("Ones number"+number);
            }
            number--;

        }
    }
}
