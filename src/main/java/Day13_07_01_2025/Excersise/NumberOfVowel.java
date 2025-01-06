package Day13_07_01_2025.Excersise;

import Day2.Char;

import java.util.HashSet;
import java.util.Set;

public class NumberOfVowel {
    public static void main(String[] args) {
        String input = "Hey There";
        int count = 0;
        String vowel = "aeiouAEIOU";
        for(char ch : input.toCharArray()){
            if (vowel.contains(Character.toString(ch))) count++;
        }
        System.out.println(count);
    }
}
