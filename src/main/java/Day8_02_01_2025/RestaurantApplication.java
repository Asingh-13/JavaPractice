package Day8_02_01_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantApplication {
    private static Scanner sc = new Scanner(System.in);
    private List<String> orderItemList = new ArrayList<>();
    private int orderValue = 0;
    public static void main(String[] args) {
        System.out.println("* " .repeat(89));
        System.out.println("*" + "  ".repeat(38) + "Welcome to APNA Restaurants" + "  ".repeat(36) + "*");
        System.out.println("* " .repeat(89));
        RestaurantApplication restaurantApplication = new RestaurantApplication();
        restaurantApplication.getOrderType();
    }

    private void getOrderType(){
        System.out.println(" Please Select the below :  \n Do you want to");
        System.out.println(" A. Dine in  \n B. Take Away \n C. EXIT");

        System.out.print(" Enter the option A or B or C for EXIT: ");
        char orderType = sc.next().toLowerCase().charAt(0);
        switch (orderType){
            case 'a':
                System.out.println(" Welcome To Dine in at APNA Restaurant ");
                menu();
                break;
            case 'b':
                System.out.println(" Welcome To Take Away at APNA Restaurant ");
                menu();
                break;
            case 'c':
                System.out.println(" Thanks for Ordering with us !!!! \n BEST REGARDS AND HAVE A GREAT DAY AHEAD !!");
                return ;
            default:
                System.out.println("Please Enter Valid Value");
                getOrderType();
        }
    }
    public void menu(){
        System.out.println(" PLease select the order ");
        System.out.println(" 1. Veg  \n 2. Non Veg \n Enter the value 1 , 2 or 3. to Exit : ");
        int menuItemType = sc.nextInt();
        switch (menuItemType){
            case 1:
                System.out.println(" Here is your Menu you Selected. Please select the Items you want to Order ");
                vegMenu();
                break;
            case 2:
                System.out.println(" Here is your Menu you Selected please select the Item you want to Order ");
                break;
            case 3:
                System.out.print(" Do you to Exit : Type yes to exit or no to stay");
                String exitConformation = sc.next().toLowerCase().trim();
                System.out.println(exitConformation);
                if(exitConformation.equals("yes") ){
                    System.out.println(" Thank You "+"Your order is " +orderItemList.toString() +" Your total bill is "+ orderValue+ " \n BEST REGARDS AND HAVE A GREAT DAY AHEAD !!");
                    return;
                }
                else if(exitConformation.equals("no") ){
                    menu();
                }
                else{
                    System.out.print(" Please Enter a valid value!! ");
                    menu();
                }
        }
    }

    public void vegMenu(){
        System.out.println(" 1. Paneer Lababdar " + " ".repeat(30) + " 280"+
                "\n 2. Butter Panner " + " " .repeat(32)+" 250 " +
                "\n 3. Chilli Paneer " + " ".repeat(32) + " 270" +
                "\n 4. Butter Roti " + " ".repeat(34) + " 10" +
                "\n 5. Tandori Roti " + " ".repeat(33) + " 20"+
                "\n 6. To Go Back" );
        int [] rates = {280, 250, 270, 10,20};
        System.out.print(" Enter your your order number and press enter ");
        int orderItem = sc.nextInt();
        switch (orderItem){
            case 1:
                orderItemList.add("Panner Lababdar");
                System.out.print(" How much quantity you want to add please add and press ENTER ");
                int quantity = sc.nextInt();
                orderValue+= quantity * rates[0];
                System.out.println("You have ordered Panner Lababdar" + quantity);
                vegMenu();
                break;

            case 2:
                orderItemList.add("Butter Panner");
                System.out.print(" How much quantity you want to add please add and press ENTER ");
                quantity = sc.nextInt();
                orderValue+= quantity * rates[1];
                System.out.println("You have ordered Butter Panner " + quantity);
                vegMenu();
                break;
            case 3:
                orderItemList.add("Chilli Paneer");
                System.out.print(" How much quantity you want to add please add and press ENTER ");
                quantity = sc.nextInt();
                orderValue+= quantity * rates[2];
                System.out.println("You have ordered Chilli Paneer " + quantity);
                vegMenu();
                break;
            case 4:
                orderItemList.add("Butter Roti");
                System.out.print(" How much quantity you want to add please add and press ENTER ");
                quantity = sc.nextInt();
                orderValue+= quantity * rates[2];
                System.out.println("You have ordered Butter Roti " + quantity);
                vegMenu();
                break;
            case 5:
                orderItemList.add("Tandori Roti");
                System.out.print(" How much quantity you want to add please add and press ENTER ");
                quantity = sc.nextInt();
                orderValue+= quantity * rates[2];
                System.out.println("You have ordered Tandori Roti " + quantity);
                vegMenu();
                break;
            case 6:
                menu();
                break;
            default:
                System.out.println("You have selected an incorrect option. ");
                System.out.println( " DO you want to Exit or want to order more !! \n Yes to Exit ," +
                        "  NO to order more in current menu ," +
                        " and Back to Go to Main menu !! ");
                String confirm = sc.next().toLowerCase().trim();
                if(confirm.equals("yes")){
                    System.out.println(" Thanks for Ordering with us !!!! \n BEST REGARDS AND HAVE A GREAT DAY AHEAD !!");
                    return;
                }
                else if(confirm.equals("back")){
                    menu();
                }
                else{
                    vegMenu();
                }

        }
    }
}
