package PrimitiveTypes.ByteShortLongInt;

public class Main {

    public static void main(String[] args) {

        int myValue = 10_000; // _ allowed for readability
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

//        int myTestMax = 2147483649; Literal value shows error because not allowed (Integer value is too large)

        System.out.println("My Int value = " + myValue);
        System.out.println("Min Int Value = " + minValue);
        System.out.println("Max Int Value = " + maxValue);
        System.out.println("Busted Min Int Value = " + (minValue - 1)); // Underflow: Value lower than min allowed so circled back
        System.out.println("Busted Max Int Value = " + (maxValue + 1)); // Overflow: Value higher than max allowed so circled back

        System.out.println("--------------------------------------------------------------------------------------");

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte Value = " + minByteValue);
        System.out.println("Max Byte Value = " + maxByteValue);

        System.out.println("--------------------------------------------------------------------------------------");

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short Value = " + minShortValue);
        System.out.println("Max Short Value = " + maxShortValue);

        System.out.println("--------------------------------------------------------------------------------------");

        long myLongValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
//        long bigLongValue = 21474836474141; // the one below works because value is higher than int but not declared as
//        a Literal Long, trailing "L" in the value is used to declare long.
        long bigLongValue = 21474836474141L;

        System.out.println("My Long Value = " + myLongValue);
        System.out.println("Min Long Value = " + minLongValue);
        System.out.println("Max Long Value = " + maxLongValue);
        System.out.println("My Big Long Value = " + bigLongValue);

        System.out.println("============================================================================");
        System.out.println("THE FOLLOWING IS THE TEST");

        byte testByte = 111;
        short testShort = 2000;
        int testInt = 2000000;
        long testLongSum = 50000L + (10L * (testByte + testShort + testInt));

        System.out.println("MY TESTBYTE: " + testByte);
        System.out.println("MY TESTSHORT: " + testShort);
        System.out.println("MY TESTINT: " + testInt);
        System.out.println("MY TESTLONG: " + testLongSum);

    }
}
