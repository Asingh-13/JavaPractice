public class Operators
{
    public static void main(String[] args) {

//        int a = 10;
//        a = a++;
//        a = a++;
//        int b = a++;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a);
        char c = 97;
        System.out.println(c);
        long d = 12345678901l;
//        float f = 299_999_999_999_999_999_999_999_999_999_999_999_999.9f;
        int result = 10 + 2 * 5 - 3 / 3; // In this First Evaluation will be of 2*5 as we have same
        // two operator of same precedence - * and / so first priority would be given to one on left
        // resultant would be 10 + 10 - 3/3 , now priority would be given to / so : 10 + 10 -1
        // now again left to right so : 20 - 1 = 19
//        System.out.println(result);

        int a = 5;
        a = a++ + ++a; // 5 + 7
//        System.out.println(a);

        int x =  10;
        System.out.println(x << 2); // in this 2 bit would shift to left which would give 101000 = 40
        System.out.println(x >> 2);
        System.out.println(x >>> 2);

        int y =  -10; // 0b11111111111111111111111111110110
        System.out.println(y << 2); // in this 2 bit would shift to left which would give 101000 = 40
        System.out.println(y >> 2); // Final binary representation after 2's compliment would be 0b[1]__00000000000000000000000000011
        System.out.println(y >>> 2); // 0b00111111111111111111111111111101

        int intVAr = 10;
        double doubleVar =  10.0;
        System.out.println(intVAr == doubleVar);

        System.out.println(5 & 10); // 0101 & 1010 = 0

        int var1 = 5, var2 = 10;
        System.out.println(var1 > 5 && var2++ > 10);
        System.out.println(var2);

        int var3 = true ? 1 : 0;
        System.out.println(var3);

        int bin1 = 0b1010;
        int bin2 = 0b1100;
        System.out.println(bin1 & bin2); //1000 - 8
        System.out.println(bin1 | bin2); //1110 - 14
        System.out.println(bin1 ^ bin2); // 0110 - 6

        System.out.println(0.1f+ 0.2f == 0.3f); // this will return false as
        System.out.println(5 + 5 + "Hello" + 5 + 5);
        char ch = 'A';
        System.out.println(ch + 1); //we will get 66 as answer

        // How would you use the & operator to check whether a given number is a power of 2? Write a program to demonstrate.
        int n = 9;
        if( (n & n-1) == 0) System.out.println(true);
        else System.out.println(false);

        x = 10;
        x += x-- + ++x; // 30

        x = 8;  // Binary: 1000
        // System.out.println(~x);     -9

        //Write a program to demonstrate how the left shift (<<) operator multiplies a number by powers of 2.
        int number = 8;
        System.out.println(number<<1);

        //What happens if you use the bitwise XOR (^) operator with the same numbers? we will get 04
        //Explain the result of this code:
        a = 12; // Binary: 1100
        int b = 10; // Binary: 1010
        a &= b;
        System.out.println(a);
        // Write a Java program to toggle the nth bit of a number using the XOR operator.



    }
}
