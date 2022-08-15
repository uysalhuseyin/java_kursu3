package Gun19;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] dizi=new int[3]; // 1  boyutlu dizi 3 tane elemani var.
        int [] dizi2={34,56,77}; // 1 boyutlu diziyi baslangic degerleri vererek tanimladik.

        // 2 ders, 3 ogrencilik bilgileri birarada tutacak tablo lazim.
        int [][] tablo1=new int[2][3];
        int [][] tablo2={{34,45,56},{34,56,76}};

        for (int satir = 0; satir <2 ; satir++) {
            for (int sutun = 0; sutun <3 ; sutun++) {
                System.out.println(satir+","+sutun+"="+tablo2[satir][sutun]);
            }
        }

    }
}
