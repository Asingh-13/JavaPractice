package Day13_07_01_2025;

import java.util.Arrays;
import java.util.Locale;

public class TitleCaseConversion {
    public static void main(String[] args) {
        String inputString = "java is an Object Oriented programming LANGUAGE";
        String [] words = inputString.split(" ");
        for(int i = 0; i<words.length;i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        System.out.println(String.join(" ", words));

    }

    public String titleCaseConversion(String st){
        return null;
    }
}
