import java.util.Scanner;
import java.util.Arrays;
class Match{
   public static int [] getMatchDetails(){
        Scanner Scnr = new Scanner(System.in);
        int [] matchStats = new int [10];
        for (int i = 0; i < 10; ++i){
          if (i == 0){
            System.out.println("Please enter which killer was in the match. (1-29)");
            int killerNum = Scnr.nextInt();
            matchStats [0] = killerNum;
          }
          if (i == 1){
            System.out.println("Please enter the prestige of the killer. (0-100)");
            int killerPrestige = Scnr.nextInt();
            matchStats [1] = killerPrestige;
          }
          if (i == 2){
            System.out.println("Please enter the first survivor. (1-33)");
            int survivorOne = Scnr.nextInt();
            matchStats [2] = survivorOne;
          }
          if (i == 3){
            System.out.println("Please enter the prestige of the first survivor. (0-100)");
            int survivorOnePrestige = Scnr.nextInt();
            matchStats [3] = survivorOnePrestige;
          }
          if (i == 4){
            System.out.println("Please enter the second survivor. (1-33)");
            int survivorTwo = Scnr.nextInt();
            matchStats [4] = survivorTwo;
          }
          if (i == 5){
            System.out.println("Please enter the prestige of the second survivor. (0-100)");
            int survivorTwoPrestige = Scnr.nextInt();
            matchStats [5] = survivorTwoPrestige;
          }
          if (i == 6){
            System.out.println("Please enter the third survivor. (1-33)");
            int survivorThree = Scnr.nextInt();
            matchStats [6] = survivorThree;
          }
          if (i == 7){
            System.out.println("Please enter the prestige of the third Survivor. (0-100)");
            int survivorThreePrestige = Scnr.nextInt();
            matchStats [7] = survivorThreePrestige;
          }
          if (i == 8){
            System.out.println("Please enter the fourth survivor. (1-33)");
            int survivorFour = Scnr.nextInt();
            matchStats [8] = survivorFour;
          }
          if (i == 9){
            System.out.println("Please enter the prestige of the fourth survivor. (0-100)");
            int survivorFourPrestige = Scnr.nextInt();
            matchStats [9] = survivorFourPrestige;
          }
        }
        return matchStats;
      }
     public static boolean wantsToEnterAnotherMatch(){
      boolean enterAnotherMatch = false;
      Scanner Scnr = new Scanner(System.in);
      System.out.println("Would you like to enter details from another match? (yes or no)");
      String userInput = Scnr.nextLine();
      if (userInput.equals("yes")){
        enterAnotherMatch = true;
      }
      else if (userInput.equals("no")){
        enterAnotherMatch = false;
      }
      else {
        System.out.println("Input not recognized, defaulting to no.");
        enterAnotherMatch = false;
      }
      return enterAnotherMatch;
    }
}