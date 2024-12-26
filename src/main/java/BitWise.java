public class BitWise {
    public static void main(String[] args) {
        System.out.println(isEven(3));;
    }

    // Write a program to check whether a given number is odd or even using a bitwise operator
    public static boolean isEven(int number){
        if(((number & 1) == 0)) return true;
        return false;
    }
}
