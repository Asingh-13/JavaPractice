public class ConditionalStatements {
    public static void main(String[] args) {
        if(true)
            if(2<1)
                System.out.println("second");
        // here in this example this else is associated with the nearest if
        else
            System.out.println("hey");

        double x = 0.1 + 0.2;
        if (x == 0.3)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

    }
}
