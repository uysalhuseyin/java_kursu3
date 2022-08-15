package Odevler;

public class _24_Dowhile {
    public static void main(String[] args) {
        int number=0;
        while (number<=100){
            if (number%4==0 && number%5==0){
                System.out.println("Numbers remaining 0 from both division 4 and division 5="+number);
            }
            number++;
        }

    }
}
