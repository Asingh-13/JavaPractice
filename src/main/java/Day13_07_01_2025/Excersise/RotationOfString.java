package Day13_07_01_2025.Excersise;

public class RotationOfString {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "DABC";

        System.out.println(new RotationOfString().isRotation(s1,s2));


        char ch = 64000;

        System.out.print(ch);






    }

    private boolean isRotation(String s1, String s2){
        return s1.length() == s2.length() && (s1+s1).contains(s2);
    }
}
