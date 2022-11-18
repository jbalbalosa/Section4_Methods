public class Main {
    public static void main(String[] args) { // Method
        System.out.println("-----------------------------------------");
        System.out.println("-- Udemy: Java Programming Masterclass --");
        System.out.println("-- Expressions and Statements          --");
        System.out.println("-- Code Blocks                         --");
        System.out.println("-----------------------------------------");

        calculateScore(true, 800,5,100);
        calculateScore(false,10000,8,200);
    }

    //public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = -1;
        if (gameOver){
            finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("Game Over");
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }
}
