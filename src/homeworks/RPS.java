package homeworks;

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Player's 1 choice");
        String player1 = scanner.nextLine().toLowerCase().trim();

        System.out.println("Please enter Player's 2 choice");
        //String player2 = scanner.nextLine().toLowerCase().trim();
        String[] words = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(words.length);
        String player2 = words[index];
        System.out.println("Computer : " + player2);

        System.out.println(rockPaperScissors(player1,player2));

    }
    public static String rockPaperScissors(String player1, String player2){
        String answer;
        if(!checkInputValid(player1,player2)){
            return "Input values are not valid";
        }
        if(player1.equals("paper") && player2.equals("rock")
           || player1.equals("scissors") && player2.equals("paper")
           || player1.equals("rock") && player2.equals("scissors")){
            answer = "Player 1 wins";
        } else if (player1.equals(player2)) {
            answer = "It's a tie!";
        } else {
            answer = "Player 2 wins";
        }
        return answer;
    }

    public static boolean checkInputValid(String player1, String player2){
        return player1.matches("rock|paper|scissors") && player2.matches("rock|paper|scissors");
    }

}
