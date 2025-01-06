package Day13_07_01_2025.Excersise;


public class WhiteSpaceRemoval {

    public static void main(String[] args) {
        System.out.println(new WhiteSpaceRemoval().removeWhiteSpace("Hey this is my string with white space"));
    }

    public String removeWhiteSpace(String str){
        System.out.println(str.replace(" " , "") );
        return String.join("",str.split(" "));
    }
}
