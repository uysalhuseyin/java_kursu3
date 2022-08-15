package Gun06;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {
        //equal ile ayni calisir fakat buyuk kucuk harf ayrimi yapmaz/
        String s1="Merhaba";
        String s2="MERHABA";
        System.out.println("s1 ve s2 esitmi = " + s1.equalsIgnoreCase(s2));
    }
}
