package Day5;

public class Patterns {
    public static void main(String[] args) {
//         pascalsTriangle(5);
        numberedTriangle(10);
    }

    public static void rightAngledTriangle(int number){
        for(int i = 0;i<number;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedRightAngledTriangle(int number){
        for(int i = number;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void square(int number){
        for(int i = 0;i<number;i++){
            for(int j=0;j<number;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }

    public static void hollowSquare(int number){
        for(int i = 0;i<number;i++){
            for(int j=0;j<number;j++){
                if(i==0|| j==0|| i== 4|| j==4){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int number){
        for(int i = 0;i<number;i++){
            for(int j=0;j<number*2 -1;j++){
                if(j >=  number-i -1 && j <= number+i-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void hollowPyramid(int number){
        for(int i = 0;i<number;i++){
            for(int j=0;j<number*2;j++){
                if(j == number -i -1 || j == number+i -1 || i == number-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void diamondHollow(int number){

        for(int i = 0;i<number;i++){
            for(int j=0;j<number*2;j++){
                System.out.println(j == number - i || j == number + i?"*": " ");
            }
            System.out.println();
        }

        for (int i = number - 2; i >= 0; i--) {
            for (int j = 0; j < number * 2; j++) {
                System.out.print(j == number - i || j == number + i?"*":" ");
            }
            System.out.println();
        }

    }

//    public static void pascalsTriangle(int n){
//        for (int i = 0; i < n; i++) {
//            // Print leading spaces for alignment
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            int number = 1; // Initialize the first number of the row
//            for (int j = 0; j <= i; j++) {
//                System.out.print(number + " ");
//                // Calculate the next number in the row
//                number = number * (i - j) / (j + 1);
//            }
//
//            System.out.println(); // Move to the next line after each row
//        }
//    }

    public static void numberedTriangle(int n){
        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1; // Start the number at 1
            boolean flag = true;
            for (int j = 0; j <= i; j++) {
                if(i %2 == 0){
                    System.out.print(number + " ");
                    if (j<i/2) number++;
                    else number--;
                }
                else{
                    System.out.print(number + " ");
                    if(j<i-j -1) number++;
                    else if(j>i-j && flag == false) number--;
                    else flag = false;
                }

            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
