package Day2;

public class Int {
    int def;
    int x = 5;
    public final int y = 5;

    public static void main(String[] args) {
        integerPractice();
        int factorial =  factorial(13);
        System.out.println(factorial);
        System.out.println(palindrome(122));
    }

    
    public static void integerPractice(){
        int firstInteger = 101;
        //int secondInteger = 10.0; we can not assign double to
        int  secondInteger = 2;
        System.out.println(firstInteger/secondInteger); // if divide two integers output would be an integer

        //int bigNumber = 2147483648; if we try to assign number greater than 2147483647 then we will get compile time error
        int bigNumber = 2147483647;

        System.out.println(bigNumber);

        int y = 'y'; // We can convert char to int type

        System.out.println(y); // WE will get integer ascii value of y we will get 121

        // int x = "x";  we can not assign String character to an int variable
        // Predict the output of the following code:
        int a = 10;
        int b = 20;
        a = a++ + ++b;
        System.out.println(a + " " + b); // 31 21


        int result = 100_000_000 + 100_100_000;
        System.out.println(result);
        //Can an int variable store a value of type long directly? Why or why not?
        long longVar = a;
        // yes int can be stored into long directly as there will be an internal type casting
        System.out.println(longVar);

        // int intResult = 5/2.0; this would be an error saying incompatible types
         int pi =(int) 3.14;
        System.out.println(pi);

        int negDivision = 5/-2;
        System.out.println(negDivision);

        // How can you calculate the square of an integer without using the multiplication (*) operator?
        int number = 5;
        int sqr = 0;
        for (int i = 0; i < number; i++) {
            sqr = sqr+number;
        }
        System.out.println(sqr);

        int binaryVar = 0b10100;

        System.out.println(binaryVar);

    }
//  Write a program to calculate the factorial of a number using the int data type.
//  What happens if the input is greater than 12? -- In this case we will get irregular output as it's greater than INTEGER.MAX_VALUE().
    public static int factorial(int input){
        if(input ==0){
            return 1;
        }
        return input * factorial(input-1);
    }

//  Write a method to determine if a given integer is a palindrome (e.g., 121, 12321).
    public static boolean palindrome(int input){
        int num = input;
        int result = 0;
        while (num>0){
            result = result*10 +num%10;
            num = num / 10;
        }
        return result == input;
    }
//  Write a program to count the number of bits set to 1 in the binary representation of an int.

}
