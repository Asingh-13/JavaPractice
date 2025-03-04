package Date_03_03_2025.Overriding;

public class P {
    public void property(){
        System.out.println(" Cash +  Load +  Gold ");
    }

    public void marry(){
        System.out.println("Not your pasandida Aurat");
    }
}

class C extends P{

    public void marry(){
        System.out.println("Pasandida Aurat");
    }

}
