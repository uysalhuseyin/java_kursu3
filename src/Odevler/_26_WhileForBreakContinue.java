package Odevler;

public class _26_WhileForBreakContinue {
    public static void main(String[] args) {
     // 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
        for (int i=0; i<=100; i++){
            if (i%4==0 && i%5==0){
                System.out.println("i="+i);
            }
        }
    }
}
