package CodingChallengesBasic;

public class TeenNumberChecker {


    public static boolean hasTeen(int a, int b, int c){
        if ((a >= 13 && a <= 19) ||  (a >= 13 && a <= 19) || (a >= 13 && a <= 19)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isTeen(int d){
        if (d >= 13 && d <= 19){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        TeenNumberChecker teenNumberChecker = new TeenNumberChecker();
    }
}
