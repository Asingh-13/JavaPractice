package Day3;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;
        System.out.println(a + b * c);
        a = 5;
        b = 2;
        c = 8;
        System.out.println(a + b << c - b); // first precedence would be given to + and - and then <<

        int x = 10, y = 20, z = 30;
        System.out.println(x + y > z ? x : y); // y

        a = 10;
        b = 20;
        c = 30;
        int result = a + b * c / a - b % c; //50
        System.out.println(result);

        a = 10;
        b = 5;
        c = 2;
        result = a > b ? a + b : c * b / c - a;
        System.out.println(result);

        a = 5; b = 10; c = 15;
        result = a + b > c || c - b < a && b % c > a ? b : c; // first it will check for  a + b > c
        // as it is false it will go on and check as it is also false and next operator is &&
        // so it will not check further and will assign 15 to the result.
        System.out.println(result);

        x = 3;
        y = 4;
        System.out.println(x++ + --y * x / y);  // firstly 3 + ((3*4) / 3) == 3 + (12/3) == 3+4 == 7

        a = 10; b = 20; c = 30;
        System.out.println(a < b == b > c);

        a = 2; b = 3; c = 4;
        result = a * b + c << b;
        System.out.println(result);


        a = 2; b = 4; c = 6;
        result = a + b > c && c - a < b || a * c < b ? a : c;
        System.out.println(result);

        x = 10; y = 5;
        result = x * x / y % x + y - x;
        System.out.println(result);
        x = 5 ; y = 2;
        System.out.println(x > y && x > 0 & y < 10);

        System.out.println(5 + 2 * 3 % 2);
        System.out.println((5 + 2) * 3 % 2);

        a = 5; b = 10;
        a += b *= a -= b;
        System.out.println(a + " " + b);

        a = 10; b = 5; c = 2;
        System.out.println(a + b > c * c || b - c < a / b ? b * a : c + b);


    }
}
