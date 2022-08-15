package Gun16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _04_Dizikolayhali {
    public static void main(String[] args) {
        // Arrays.toString(dizi) > diziyi string olarak direk yazdirir.
        String[] isimler={"ahmet","melike","hasan","osman"};
        System.out.println("Arrays.toString(isimler)"+ Arrays.toString(isimler));
        //Arrays.sort(isimler)> diziyi siralar
        Arrays.sort(isimler);
        System.out.println(".sort="+Arrays.toString(isimler));

        //diziler esitmi? Arrays.equals(dizi1,dizi2)
        int[] a={1,2,8,9};
        int[] b={1,2,8,9};
        int[] c={1,2,8,9};
        int[] d={1,3,8,9};
        System.out.println("Arrays.equals(a,b)="+Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,c)="+Arrays.equals(a,c));

    }
}
