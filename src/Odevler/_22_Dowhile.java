package Odevler;

public class _22_Dowhile {
    public static void main(String[] args) {
        //0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz
        int number=0;
        int ones=0;
        int even=0;
        while (number<100){

            if (number%2==0){
             even=even+number;

            }
            else {
                ones=ones+number;
            }
            number++;

        }
        System.out.println("even numbers = " + even);
        System.out.println("ones = " + ones);


    }
}
