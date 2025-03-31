package Day_31_03_2025.Generics;

public class Gen <T>{
    T obj;
    Gen(T obj){
        this.obj = obj;
    }

    public void show(){
        System.out.println("The Type of ob is : " + obj.getClass().getName());
    }

    public T getObj(){
        return obj;
    }
}
