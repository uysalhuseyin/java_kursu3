package Gun19;

public class _05_JavaArray {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

        int [][] dizi=new int[0][20];
        int [][] dizi2={{1,2,3},{2,3,1},{5,5,5},{2,10,3},};

        for (int i = 0; i <20 ; i++) {
            for (int j = 0; j <20 ; j++) {
                dizi[i][j]=(int) Math.max(i,j);
            }
        }
    }
}
