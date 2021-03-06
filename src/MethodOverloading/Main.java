package MethodOverloading;

public class Main {

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unknown Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Player name and score not found");
        return 0;
    }

    public static void main(String[] args) {
        calculateScore("Aniket", 81);
        calculateScore(82);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(100);
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || (inches < 0) || (inches > 12)){
            System.out.println("Invalid Value");
            return -1;
        }
        else{
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " Feet + " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            System.out.println("Invalid Value");
            return -1;
        }
        else{
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
