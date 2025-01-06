package Day13_07_01_2025.Excersise;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Aman";
        System.out.println(new ReverseAString().reverse(s));

    }

    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
