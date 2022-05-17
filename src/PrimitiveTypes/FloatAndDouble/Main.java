package PrimitiveTypes.FloatAndDouble;

public class Main {

    public static void main(String[] args) {

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value " + minFloatValue);
        System.out.println("Max Float Value " + maxFloatValue);

        System.out.println("===========================================================");

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value " + minDoubleValue);
        System.out.println("Max Double Value " + maxDoubleValue);



        System.out.println("===========================================================");
        int myInt = 5;
        float myFloat = 1.2454348f;
        double myDouble = 5.25;

        System.out.println("My Int value " + myInt);
        System.out.println("My Float value " + myFloat);
        System.out.println("My Double value " + myDouble);

        System.out.println("POUNDS TO KILOGRAM");

        double pounds = 100d;
        double kilos = pounds * 0.45359237d;

        System.out.println("Pounds " + pounds);
        System.out.println("Kilograms " + kilos);



    }
}
