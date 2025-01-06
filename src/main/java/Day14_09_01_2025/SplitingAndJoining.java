package Day14_09_01_2025;

import java.util.Arrays;

public class SplitingAndJoining {
    public static void main(String[] args) {
        String str = "Hey this is Java";
        String[] parts = str.split(" ");
        System.out.println(Arrays.toString(parts));
        System.out.println(String.join(" ", parts));
    }
}
