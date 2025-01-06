package Day11__06_01_2025.ArrayQuestions;

public class FindTheLargestNumberInAnArray {
    public static void main(String[] args) {
        FindTheLargestNumberInAnArray f = new FindTheLargestNumberInAnArray();
        System.out.println("MAX - " + f.findTheLargestNumber(new int[]{4,5,6,7,1}));
    }
    private int findTheLargestNumber(int [] arr){
        int max = 0;
        for(int element : arr) if(element>max) max = element;
        return max;
    }
}
