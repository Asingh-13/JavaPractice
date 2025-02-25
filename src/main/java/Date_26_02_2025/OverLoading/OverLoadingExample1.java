package Date_26_02_2025.OverLoading;

public class OverLoadingExample1 {

    public void m1(int i){
        System.out.println(" int - args ");
    }
    public void m1(float f){
        System.out.println(" float - args ");
    }

}

class Test{
    public static void main(String[] args) {
        OverLoadingExample1 o = new OverLoadingExample1();
        o.m1(10);
        o.m1(10.5f);
        o.m1('a');
      //  o.m1(10.5); // I'll get compile time error because it can't be further promoted
    }
}
