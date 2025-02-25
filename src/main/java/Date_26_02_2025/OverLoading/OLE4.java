package Date_26_02_2025.OverLoading;

public class OLE4 {
    public void m1(String s){
        System.out.println("String - version");
    }
    public void m1(StringBuffer sb){
        System.out.println("String Buffer - Version ");
    }


    public static void main(String[] args) {
        OLE4 o = new OLE4();

        o.m1("Aman");
        //o.m1(null); in this we will get compile time error
    }
}
