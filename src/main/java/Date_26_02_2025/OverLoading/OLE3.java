package Date_26_02_2025.OverLoading;

public class OLE3 {
    public void m1(String s){
        System.out.println("String - version");
    }

    public void m1(Object o){
        System.out.println("Object - Version ");
    }


    public static void main(String[] args) {
        OLE3 o = new OLE3();
        o.m1(new Object());
        o.m1("Aman");
        o.m1(null);
    }
}
