package CodingChallengesBasic;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 | hourOfDay > 23){
            return false;
        }
        if (hourOfDay < 8 | hourOfDay > 22){
            if (barking == true){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        BarkingDog barkingDog = new BarkingDog();
        boolean wakeUp = barkingDog.shouldWakeUp(false, 1);
        System.out.println(wakeUp);
    }
}
