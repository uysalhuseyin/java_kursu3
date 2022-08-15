package Gun06;

public class _06_StringConcat {
    public static void main(String[] args) {
        // Concat bir string digerine ekler
        String s1="merhaba";
        String s2="dunya";
        System.out.println("birlesik hali = " + s1.concat(s2));
        System.out.println("birlesik hali = " + s1.concat(" ").concat(s2));
    }
}
