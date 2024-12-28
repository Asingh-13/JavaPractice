package Day6_30_12_2024;

public class Series {
    public static void main(String[] args) {
    }

    public static void sixthSeries(int n){
//        int start =1;
//        int previous = 1;
//        while (previous<=120){
//            System.out.print(previous + " ");
//            start++;
//            previous =previous *  start;
//        }
//
        int previous = 1;
        for(int i = 1;i<=n;i++){
            previous = previous * i;
            System.out.print(previous + " ");
        }
    }

    public static void seventhSeries(int n){
        int previous = 5;
        int squareOfTwo = 1;
        for (int i = 0; i < n ; i++){
            if(i % 2 == 0){
                System.out.print(previous + " ");
            }
            else {
                System.out.print(previous*2 + " ");
                squareOfTwo *=2;
                previous += squareOfTwo;
            }
        }
    }

    private static void eighthSeries(int n){
        for (int i = 1; i <= n ; i++){
            if(i % 2 != 0){
                System.out.print(i*i*i + " ");
            }
            else System.out.print(i*i + " ");
        }
    }

    private static void ninthSeries(int n){
        for(int i =0;i<n;i++){
            System.out.print((int)(i + Math.pow(i+1,2)) + " ");
        }
    }

}

