package Day_31_03_2025.Generics;

public class Test {
    public static void main(String[] args) {
        Gen<String> obj1 = new Gen<>("Aman");
        System.out.println(obj1.getObj());

        Gen<Integer> obj2 = new Gen<>(100);
        System.out.println(obj2.getObj());

        obj1.show();
        obj2.show();
    }
}
