package CodingChallengesBasic;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        int a = (int) one * 1000;
        int b = (int) two * 1000;
        if (a == b){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        DecimalComparator decimalComparator = new DecimalComparator();
        System.out.println(decimalComparator.areEqualByThreeDecimalPlaces(3.176, 3.175));
    }
}
