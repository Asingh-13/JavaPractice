package Day14_09_01_2025;

public class ContainsSUbstring {
    public static void main(String[] args) {
        System.out.println(containsSubstring("ABCDEFGH","EFG"));
    }
    public static boolean containsSubstring(String str, String substring) {
        return str.contains(substring);
    }

}
