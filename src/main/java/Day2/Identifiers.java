package Day2;

import java.awt.dnd.InvalidDnDOperationException;

/*
 *This class in for practicing Day2.Identifiers.
 * Day2.Identifiers: A name in java program that can be used for identification purpose of a method, class , variable or label.
 * Example:
 *  Class name  : Day2.Identifiers
 *  method name : String
 *  Class name : String
 *  Array name: args
 */
public class Identifiers {
    public static void main(String[] args) {
        validIdentifiers();
    }
    /*
    * Below method will be used to define valid identifiers
    * Rules:
    * 1. Identifier allowed characters:
    *       a to z
    *       A to Z
    *       0 to 9
    *       $
    *       _
    * 2. Identifier can't start with Digits/ Numbmers
    * 3. Java Day2.Identifiers are case-sensitive.
    * 4. We can't use Reserve words.
    * 5. We can use predefined Class - but bad coding practice.
    */
    public static void validIdentifiers(){
        int _myvar = 1;
        // int 1myVar = 2; this is not a valid identifier  starting with number
        int $myVar = 2;
        //int @myvar = 2;  this variable is invalid because of @
        //int float = 3; float is reserved keyword so invalid
        int MAX_LENGTH = 10; // this is valid
        //int String = 10 ; // We can use predefined class name as identifier but not recommended.
        int myVar = 10;
        int MyVar = 20;
        /*
        * @param myVar
        * @param MyVar
        * both are different
        */
        System.out.println("myVar " + myVar + " and MyVar " + MyVar + " both are different ");
    }
}
