package Date_26_02_2025.OverLoading;

public class OLE6 {
    public void m1(int x){
        System.out.println("Normal Methods ");
    }

    public void m1(int ... x){
        System.out.println("Var Arg  Methods");
    }
    public static void main(String[] args) {
        OLE6 o = new OLE6();
        o.m1(); // var arg
        o.m1(1,2); // var arg
        o.m1(1); // normal
    }
}
