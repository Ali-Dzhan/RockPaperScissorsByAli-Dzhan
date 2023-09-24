import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

          final String Rock = "Rock";
          final String Paper = "Paper";
          final String Scissors = "Scissors";

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

         String playerMove = scanner.nextLine();

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        computerRandomNumber += 1;
        System.out.println(computerRandomNumber);
        String computerMove = "";

         if(playerMove.equals("r")  || playerMove.equals("rock")){
             playerMove = Rock;
             
         } else if (playerMove.equals("p")  || playerMove.equals("paper")) {
             playerMove = Paper;
             
         }else if (playerMove.equals("s")  || playerMove.equals("scissors")) {
             playerMove = Scissors;
         }else {
             System.out.println("Invalid input. Try again...");
             return;
         }
         switch (computerRandomNumber){
             case 1: computerRandomNumber = 1;
                 computerMove = Rock;
                 break;

             case 2: computerRandomNumber = 2;
                 computerMove = Paper;
                 break;

             case 3: computerRandomNumber = 3;
                 computerMove = Scissors;
                 break;
         }
        System.out.printf("The computer chose %s.%n", computerMove);
        if ((playerMove.equals(Rock) && computerMove.equals(Scissors))||
                (playerMove.equals(Paper) && computerMove.equals(Rock)) ||
                (playerMove.equals(Scissors) && computerMove.equals(Paper))){
            System.out.println("You win.");
        } else if ((playerMove.equals(Scissors) && computerMove.equals(Rock))||
                (playerMove.equals(Rock) && computerMove.equals(Paper)) ||
                (playerMove.equals(Paper) && computerMove.equals(Scissors))) {
            System.out.println("You lose.");
            
        }else {
            System.out.println("This game was a draw.");
        }


    }
}
