public class OperatorPrecidence {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;
        System.out.println(a + b * c);
        a = 5;
        b = 2;
        c = 8;
        System.out.println(a + b << c - b); // first precidence would be given to + and - and then <<

        int x = 10, y = 20, z = 30;
        System.out.println(x + y > z ? x : y); // y

        a = 10;
        b = 20;
        c = 30;
        int result = a + b * c / a - b % c; //50
        System.out.println(result);





    }
}
