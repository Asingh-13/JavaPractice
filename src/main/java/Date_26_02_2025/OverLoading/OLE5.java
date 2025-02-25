package Date_26_02_2025.OverLoading;

public class OLE5 {
    public void m1(int i, float f){
        System.out.println("First  - version");
    }
    public void m1(float f, int i){
        System.out.println("Second Version - Version ");
    }


    public static void main(String[] args) {
        OLE5 o = new OLE5();
        o.m1(10,10.5f);

        o.m1(10.5f,10);

        //o.m1(10,10); Ambiguous method call

        //o.m1(10.5f,10.5); can't find symbol
    }
}
