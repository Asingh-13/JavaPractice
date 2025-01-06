package Day12_07_01_2025;

public class StringMethods {




    public static void main(String[] args) {
        //First Method
        // public char charAt(int index); // this method return the character at specific index ;
        String name = "Aman";
        System.out.println(name.charAt(2));
        // We will get run time exception System.out.println(name.charAt(30));

        // Concatenation
        // 2 methods .concat
        // public string concat(String s)   and Overloaded operator + and += are meant for concatenation only
        String s = "Aman";
        s  = s.concat(" GRRAS");
        System.out.println(s);
        System.out.println(s + " AMAN");
        System.out.println(s += " Solutions");


        // Methods 4 equals
        //To perform  content comparison where case is important this is overridden version of Object class equals() methods
        System.out.println(s.equals("Aman GRRAS Solutions"));
        System.out.println(s.equals("aman grras solutions"));


        // Method 3  ** specially designed for strings like email id in which case sensitivity is not required
        // public boolean equalsIgnoreCase(String s);

        System.out.println(s.equalsIgnoreCase("Aman GRRAS Solutions"));

        //Method 5 substring
        String string1 = "abcdefgh";

        System.out.println(string1.substring(3)); // this will give Substring starting from 3 index  O/P defgh

        System.out.println(string1.substring(2,6)); // this will give substring from 2 - 5th index O/P will be cdef.

        //Method  5
        System.out.println(s.length());

        //Method string
        //public String replace(char oldChar, char newChar)

        System.out.println(string1.replace("k","c"));

        //public String toLowerCase();
        // public String toUpperCase();


        //Trim
        // public String trim()


        //public int indexOf(Char ch){}

        // public int lastIndexOf(Char ch)




    }
}

