package Date_26_02_2025.OverLoading;

public class OLE7 {
    public void m1(Animal a){
        System.out.println("Animal Version");
    }

    public void m1(Monkey m){
        System.out.println("Monkey Version");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        OLE7 o = new OLE7();
        o.m1(a);

        Monkey m = new Monkey();
        o.m1(m);

        Animal a1 = new Monkey();

        o.m1(a1);// In Overloading Complier is responsible for method resolution based
        // on reference type at complie time so that's why we are going to get Animal Version
    }
}


class Animal{

}

class  Monkey extends Animal{

}