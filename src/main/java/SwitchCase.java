import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int outer = 20, inner = 31;
        switch (outer) {
            case 1:
                switch (inner) {
                    case 2:
                        System.out.println("Outer 1, Inner 2");
                        break;
                    case 3:
                        System.out.println("Outer 1, Inner 3");
                        break;
                }
                break;
            case 2:
                System.out.println("Outer 2");
                break;
        }


        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("Case 0");
                    break;
                case 1:
                    System.out.println("Case 1");
                    continue;
                case 2:
                    System.out.println("Case 2");
            }
            System.out.println("End of loop iteration");
        }
        char ch = '1';
        switch (ch) {
            case 1:
                System.out.println("Case 1");
                break;
            case '1':
                System.out.println("Case '1'");
                break;
            default:
                System.out.println("Default case");
        }
        maximumOfTwoNumber(2,2);
    }

    //Write a program to read a weekday number and print weekday name using switch statement

    private static void weekdayFinder(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("please add day of week between 0 to 6");
        }
    }

//    2.  Write a program to Check whether a character is a vowel or consonant using switch statement

    private static void vowel(){
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.printf("Enter a Character : ");
        ch = input.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            switch (ch)
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("This is a Vowel");
                    break;

                default:
                    System.out.println("This is a Consonant");
                    break;
            }
        }
        else
        {
            System.out.println("This is Not an alphabet");
        }
    }

    private static void maximumOfTwoNumber(int number1, int number2){
        int comparator = number1>number2?0:(number1 == number2)?3:1;
        switch (comparator){
            case 0:
                System.out.println("Number " + number1 + " is greater than " + number2);
                break;
            case 1:
                System.out.println("Number " + number2 + " is greater than " + number1);
                break;
            default:
                System.out.println("Both number are equal");
        }
    }


}
