package CodingChallengesBasic;

public class LeapYear {

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        if (year % 4 == 0){
            if (year % 100 != 0 || year % 400 == 0){
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
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.isLeapYear(204));
    }
}
