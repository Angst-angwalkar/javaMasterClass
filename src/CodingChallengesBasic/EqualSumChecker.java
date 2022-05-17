package CodingChallengesBasic;

public class EqualSumChecker {

    public static boolean hasEqualSum(int one, int two, int three){
        if ((one + two) == three){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        EqualSumChecker equalSumChecker = new EqualSumChecker();
        System.out.println(equalSumChecker.hasEqualSum(1, -2, -1));
    }
}
