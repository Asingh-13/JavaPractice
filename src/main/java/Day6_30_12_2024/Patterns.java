package Day6_30_12_2024;

public class Patterns {
    public static void main(String[] args) {
        clock(8);
    }

    public static void decreasingDiamond(int n){
        for(int i =0 ;i<n;i++){
            System.out.print(" ".repeat(i));
//            System.out.println("*".repeat(2*(n-i) -1));
            for(int j = 2*(n-i)-1 ;j>0;j--){
                if (i<n/2 && j >n-2*i && j<n){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void clock(int n){
        for(int i = 1;i<n*2;i++){
            if(i<n){
                System.out.print(" ".repeat(i));
                System.out.print("*".repeat(2*(n-i)-1));
                System.out.println();
            }
            else {
                if(2*(i-n) -1>1) {
                    System.out.print(" ".repeat(2*n -i ));
                    System.out.print("*".repeat(2*(i-n)-1));
                    System.out.println();}
            }

        }
    }

    public static void clock2(int n){

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n) {
                    if (j < i) {
                        System.out.print(" "); // Print leading spaces
                    } else {
                        System.out.print("* "); // Print stars
                    }
                }
                else {
                    if (j < 2 * n - i - 2) {
                        System.out.print(" "); // Print leading spaces
                    } else {
                        System.out.print("* "); // Print stars
                    }
                }
            }
            System.out.println(); // Move to the next line

//        for (int i = 0; i<n*2; i++){
//            if (i < n-2) {
//                System.out.print(" ".repeat(i));
//                System.out.print("* ".repeat(n-i -1));
//                System.out.println();
//            }
//            else {
//                if(i - n > 0) {
//                    System.out.print(" ".repeat(2 * n - i-1));
//                    System.out.print("* ".repeat(i - n));
//                    System.out.println();
//                }
//            }
        }
    }

    public static void dualClocks(int n){

        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < 2 * n; j++) {
                if (i == 0 || i == n - 1 || j == i || j == (n - i) - 1 || j == n + i || j == (2 * n - i) - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
