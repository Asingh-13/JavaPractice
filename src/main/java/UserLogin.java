public class UserLogin {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 35;
        int num3 = 30;
        int num4 = 40;

        if (num1 > num2 && num1 > num3 && num1 > num3 )
            System.out.println("Num1 is greatest");
        else if (num2 > num3 && num2 > num4)
            System.out.println("Num2 is greatest");
        else if (num3 > num4)
            System.out.println("Num2 is greatest");
        else
            System.out.println("Num 4 is gresatest ");
       //  "The Greatest number is num4  value = 40"

        boolean isPlusUser = false;
        boolean isPlusPremiumUser = false;

        if (isPlusUser){
            if (isPlusPremiumUser){
                System.out.println("Deliver 1 day + Early access to Sales ");
            }
            else
                System.out.println("Deliver product in 1 day");
        }
        else {
            System.out.println("Deliver in 2 day");
        }

        String output = (isPlusUser?
                (isPlusPremiumUser?"Deliver 1 day + Early access to Sales " :"Deliver product in 1 day") :
                "Deliver in 2 day") ;
    }
}