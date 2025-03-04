package Date_03_03_2025.Overriding;

public abstract class AbstactClass {
    abstract void m1();
}

class ChildC extends AbstactClass{

    @Override
    void m1() {
        System.out.println("Cumpolsory to Override");
    }
}