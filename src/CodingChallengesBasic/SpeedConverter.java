package CodingChallengesBasic;

public class SpeedConverter {

    public static long toMilesPerHour(double param){
        if (param < 0){
            return -1L;
        }
        else {
            long miles = Math.round(param / 1.609);
            System.out.println("miles " + miles);
            return miles;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + "km/hr = " + milesPerHour + " miles/hr");
        }
    }

    public static void main(String[] args) {
        SpeedConverter speedConverter = new SpeedConverter();
        speedConverter.toMilesPerHour(1524);
        speedConverter.printConversion(1524);
    }
}
