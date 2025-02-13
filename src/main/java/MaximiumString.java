import java.util.Arrays;

public class MaximiumString {

    public static void main(String[] args) {

        System.out.println(validPair("22"));

        System.out.println(  (int) '1');

        merge(new int[]{1,2,3,0,0,0}, new int[]{2,5,6}, 3,3);

    }

    public static  String maximumString(String s, int n){
       String maxResult = "";

       for (int i = 0; i< s.length();i++){
           if (s.charAt(i) == n){
               String number = s.substring(0,i) + s.substring(i+1);

               if (number.compareTo(maxResult) > 0)
                   maxResult = number;

           }
       }
       return maxResult;
    }


    public static String validPair(String s){
        char [] charArr = s.toCharArray();

        int [] pairCount = new int[charArr.length * 2];


        for (int i = 0; i<charArr.length;i++){
            int index = Integer.valueOf(Character.toString(charArr[i]));
            pairCount[index ] = pairCount[index] + 1;
            //System.out.println(Integer.valueOf(Character.toString(charArr[i])));
        }
        String result = "";
        for (int i = 1;i<pairCount.length;i++){
            if(pairCount[i] == i){
                result = result.concat(Integer.toString(i));
            }
        }
        if (result.length()>1)
            return result;
        return "";
    }

    public static void merge(int [] arr1, int arr2[], int m , int n){
        int []result = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n){
            if(arr1[i] < arr2[j]){
                result[k++] = arr1[i++];
            }
            else result[k++] = arr2[j++];
        }

        while (i < n){
            result[k++] = arr1[i++];
        }
        while (j < m){
            result[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(result));
    }
}

