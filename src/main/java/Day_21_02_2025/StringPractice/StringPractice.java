package Day_21_02_2025.StringPractice;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        int a = 10;
        int b = 20;
        System.out.println(a + b + " " + s1 + s2 + a + b);

        // Rule Number -- It will follow operator precidence

        // arithmatic Operator * / %   >  + -

        System.out.println(a + b++ + s1 + a * b++);

    }

    public static void printCharInSeparateLine(String s){
        for (int i = 0 ; i< s.length(); i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    public static void upperCaseONly(String s){
        for (int i = 0 ; i< s.length(); i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                System.out.print(c + " " );
            }
        }
    }

    public static void pigLatin(String s){
        String pl = "";
        for(int i = 0; i < s.length(); i++ ){
           char l = s.toLowerCase().charAt(i);
           if(l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')
               if (i == 0) {
                   pl = s + "way";
                   System.out.println(pl);
                   return;
               }
               else {
                   pl = s.substring(i)+s.substring(0,i)+"ay";
                   System.out.println(pl);
                   return;
               }
        }
    }
}
