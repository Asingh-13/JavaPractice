package Day5;

public class Series {
    public static void main(String[] args) {
    }

    //1, 3, 5, 7, 9, 11
    public static void oddSeries(int n){
        for (int i =0;i<=n;i++){
            if(i%2!=0) System.out.print(i + ", ");
        }
    }

    public static void evenSeries(int n){
        for (int i =0;i<=n;i++){
            if(i%2==0) System.out.print(i + ", ");
        }
    }

    public static void reverseEven(int n){
        for (int i =n;i>=0;i--){
            if(i%2 == 0) System.out.print(i + ", ");
        }
    }

    public static void fourthSeries(int n){
        int result = 1;
        for(int i = 2; i <= n ; i++){
            System.out.print(result + " ");
            result += i;
        }
    }
//NOt Done
    public static void fifthSeries(){
        int result = 1;
        int jump = 2;
        int decline = 2;
        boolean flag = true;
       while(result>0 ){
           if(result<15 && flag){
               System.out.print(result + " ");
               result +=jump++;

           }
           else{
               flag = false;
               System.out.print(result + " ");
               result -= decline++;
           }
       }
    }

}
