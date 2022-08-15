package Gun16;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // Asagidaki sekilde cikti veren programi print icerisinde
        // sadece bir tane # kullanrak yazdiriniz.

        for (int j=1; j<=5; j++){
            for (int i=1; i<=5; i++)
                System.out.print("#");
            System.out.println();
        }
    }
}
