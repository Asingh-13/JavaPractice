public class BYte {
    public static void main(String[] args) {
        byte b =12;
        // b = b + 1;
        // in this case we will get compile time error as internal type casting won't happen
        // because it will compare type according to
        // MAX(int,type if b --> byte, type of 1 --> int) and assign int type to b
        // causing compile time

        System.out.println(b);
        byte byteVarA = 50;
        byte byteVarB = 50;
        byte byteVarC =(byte)( byteVarA + byteVarB); // here in this example also we will get possible of precision
        // if would not convert these whole into byte

        // TODO: 25-12-2024

        byte c = 20 + 30;// We can also add up char
        System.out.println(c);

        char ch = 'A';
        byte charByte =(byte) ch; // If ascii value of char is > 127 then we have to typecast it into byte
        System.out.println(charByte);

        byte varA = 127;
        varA++;
        System.out.println(varA);

        byte byteB =(byte) -129;
        System.out.println(byteB);

//
//        for (byte a = 0; a < 130; a++) {
//            System.out.println(a);
//        }
//        this code will run till the stack overflow error because the memory will be fully occupied by the loop as exit condition
//        of loop is > byte range that's why it will never reach the exit point.

        byte binaryVar = -0b1;
        System.out.println(binaryVar);

        byte hexaVar = 0x71;
        System.out.println(hexaVar);

        byte hexaVar2= 0x1f;
        System.out.println(hexaVar2);

    }
}
