package Core;

public class IntToBinary {

    public static void main(String[] args) {

        int unsignedInt = 6;
        int signedInt = -6;
        String binary_of_unsignedInt = Integer.toBinaryString(unsignedInt);
        String binary_of_signedInt = Integer.toBinaryString(signedInt);
        System.out.println(binary_of_unsignedInt);
        System.out.println(binary_of_signedInt);

        // Convert to 32-bit unsigned binary
        long unsignedInt2 = Integer.toUnsignedLong(signedInt);
        System.out.println(unsignedInt2);
        String UnsignedBinary = Long.toBinaryString(unsignedInt2).replace(' ', '0');
        System.out.println(UnsignedBinary);

        String UnsignedBinary2 = String.format("%32s", Integer.toBinaryString(unsignedInt)).replace(' ', '0');
        // String unsignedBinary2 = String.format("%32s",
        // Integer.toBinaryString(unsignedInt)).replace(' ', '0');
        System.out.println(UnsignedBinary2);

    }
}
