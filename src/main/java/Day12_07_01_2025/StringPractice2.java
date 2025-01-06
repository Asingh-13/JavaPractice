package Day12_07_01_2025;

public class StringPractice2 {
    public static void main(String[] args) {
        String s = new String("durga"); // in this case 2 object would be created in heap memory
        // and one object would be crated in scp area  and don't have reference variable

        String s_2 = "durga"; // in this case only one object is created in SCP area

        //object area creation is optional in SCP area if it's already there then it would not be created.
        
        // garbage collector is not allowed to access SCP Area although object doesn't contain reference it's not eligible for JC
        // all object would be deleted at the time of jvm shut down
        // if any object is created during runtime operation it will always be created in heap area



    }
}
