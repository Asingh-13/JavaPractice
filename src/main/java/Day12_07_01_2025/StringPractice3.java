package Day12_07_01_2025;

public class StringPractice3 {
    public static void main(String[] args) {
        String s= new String(); // create an  empty string object

        String s1 = new String("Aman"); // Create string object in heap of give String literally

        String sb = new String(new StringBuffer("Aman")); // Create equivalent string object in heap for give sb object

        String charString = new String(new char[]{'A','M','A','N'}); //  For given char array we can create

        String byteString = new String(new byte[]{100,101,102,103}); // o/p defg


    }
}
