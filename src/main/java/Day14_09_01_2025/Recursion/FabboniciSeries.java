package Day14_09_01_2025.Recursion;

public class FabboniciSeries {

    public static void main(String[] args) {

        for (int i = 0;i<15;i++){
            System.out.print(" " + new FabboniciSeries().fabonacciSeries(i));
        }
    }
    public int fabonacciSeries(int number){
        if(number <= 1){

            return number;
        }

        return fabonacciSeries(number-1) + fabonacciSeries(number - 2);
    }
}
