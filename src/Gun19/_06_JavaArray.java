package Gun19;

public class _06_JavaArray {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et
        int [][] tablo ={{1,2,3},{2,3,1},{5,5,5},{2,10,3}};
        int enb=tablo[0][0];
        for (int i = 0; i <tablo.length ; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]>enb)
                    enb=tablo[i][j];
            }

        }
        System.out.println("enb="+enb);

    }

}
