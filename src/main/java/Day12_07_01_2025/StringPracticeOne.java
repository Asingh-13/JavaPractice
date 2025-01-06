package Day12_07_01_2025;

public class StringPracticeOne {
    public static void main(String[] args) {
        String s1 = new String("durga");
        String s2 = new String("durga").intern();
        System.out.println("Equal Operator " + s1 == s2);  // Yh puchna padega
        System.out.println("Equals Method " + s1.equals(s2));

        // In String class equals method is overridden for content comparison hence object are different
        // but in SB class it's ment for object comparison
        System.out.println( " -------- String Builder ----- ");
        StringBuilder sb = new StringBuilder("durga");
        StringBuilder sb2 = new StringBuilder("durga");
        System.out.println(sb == sb2);
        System.out.println( sb.equals(sb2));


    }
}
