import java.util.*;

class Game {
    public int randomNum, userInput, noOfGuesses = 0;
    public boolean isCorrect = false;
    public Game() {
        Random random = new Random();
        this.randomNum = random.nextInt(101);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the Number: ");
        this.userInput = sc.nextInt();
    }

    public void isCorrectNumber() {
        if(randomNum == userInput) {
            this.isCorrect = true;
            System.out.println("You Won the Match!");
        }
        else {
            this.isCorrect = false;
            this.noOfGuesses++;
            if(randomNum > userInput) {
                System.out.println("Your Number is Smaller!");
            }
            else {
                System.out.println("Your Number is Greater!");
            }
        }
    }


}

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game satyam = new Game();
        while(satyam.isCorrect == false) {
            satyam.takeUserInput();
            satyam.isCorrectNumber();
        }
        if(satyam.noOfGuesses < 5) {
            System.out.println("You are a Legendary Player!");
        }
        else {
            System.out.println("You Need more Practice!");
        }
    }
    
}
