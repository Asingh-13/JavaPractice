import java.util.*;
import java.util.stream.Collectors;

public class FirstTestClass {
    public static void main(String[] args){
         byte b = 127;
         b = (byte) (b+1);
        System.out.println(b);





//        int number = 10;
//        Stack stack = new Stack();
//        while (number>0){
//            stack.add(number%2 == 0? 1:0);
//            number = number/2;
//        }
//        StringBuilder result = new StringBuilder();
//        while (!stack.isEmpty()){
//            result.append(stack.pop());
//        }
//        System.out.println(Integer.parseInt(result.toString(),2));


//        int x = 'ό';
//        System.out.println(x);





        List employees = new ArrayList();
        employees.add(new Employee(1,"Aman",new Date(),50000));
        employees.add(new Contingent(1,"Raman",new Date(),300,5));

        for (var employee:
             employees) {
            if(employee instanceof Employee) System.out.println(employee);
            else if (employee instanceof Contingent) System.out.println(employee);
        }
    }
}


//
//    WebDriver driver = new ChromeDriver();
//
//    // Set timeout
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        try {
//                // Open the target URL
//                driver.get("https://test-automation.blog/");
//
//                // Wait for the "Recent Posts" elements to load
//                var elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
//                By.xpath("//h2[normalize-space()='Recent Posts' and @class='widget-title']/following-sibling::*/li/a")
//                )).stream().map((e)->e.getAttribute("href")).collect(Collectors.toList());
//
//                System.out.println(elements);
//                // Iterate over the elements and open each in a new tab
//                for (var element : elements) {
//                String href = element;
//                if (href != null) {
//                WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
//                newTab.get(href);
//                System.out.println("Opened: " + newTab.getTitle());
//                }
//                }
//                } catch (Exception e) {
//                e.printStackTrace();
//                } finally {
//                // Close all tabs and end the WebDriver session
//                driver.quit();
//                }