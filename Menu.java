import java.util.Scanner;
import java.util.Arrays;
class Menu{
  public static void showMenu(){
  int i = 0;
    for (i = 0; i < 10; ++i){
      if (i == 0){
        System.out.println("\nMenu: \n");
      }
      else if (i == 1){
        System.out.println("Command: \"menu\"        Description: Shows available commands.");
      }
      else if (i == 2){
        System.out.println("Command: \"killers\"     Description: Shows list of killers.");
      }
      else if (i == 3){
        System.out.println("Command: \"statistics\"  Description: Shows list of detailed info.");
      }
      else if (i == 4){
        System.out.println("Command: \"match\"       Description: Enter details from a match.");
      }
      else if (i == 5){
        System.out.println("Command: \"survivors\"   Description: shows list of survivors.");
      }
      else if (i == 6){
        System.out.println("Command: \"exit\"        Description: Exits the program and saves recorded data.");
      }
      
    }
  }
  public static int mainMenu (int [] matchDetails, int [] killerArray, int [] killerPrestigeArray, int [] survivorArray, int [] survivorPrestigeArray){
    Scanner Scnr = new Scanner(System.in);
      
      int continueProgram = 1;
  System.out.println("Please enter a command. (type \"menu\" to show available commands.)");
  String userInput = Scnr.nextLine();
    if (userInput.equals("menu")){
      showMenu();
      continueProgram = 1;
    }
    else if(userInput.equals("killers")){
      
      Lists.killerList();
      continueProgram = 1;
    }
    else if (userInput.equals("statistics")){
     
      System.out.println("Please enter \"survivor\" or \"killer\" to see respective stats");
      String userInputOne = Scnr.nextLine();
      if (userInputOne.equals("survivor")){
        Statistics.showSurvivorStatistics(survivorArray, survivorPrestigeArray);
      }
      else if (userInputOne.equals("killer")){
      Statistics.showKillerStatistics(killerArray, killerPrestigeArray);
      boolean showAnotherKiller = Statistics.wantsToShowAnotherKiller();
      if (showAnotherKiller == true){
        while (showAnotherKiller == true){
          Statistics.showKillerStatistics(killerArray, killerPrestigeArray);
          showAnotherKiller = Statistics.wantsToShowAnotherKiller();
        }
      }
      }
      continueProgram = 1;
    }
    else if (userInput.equals("match")){
      
      matchDetails = Match.getMatchDetails();
      killerArray = Calculations.calculateKillerPickStats(matchDetails, killerArray);
      killerPrestigeArray = Calculations.calculateKillerPrestigeStats(matchDetails, killerPrestigeArray);
      survivorArray = Calculations.calculateSurvivorPickStats(matchDetails, survivorArray);
      survivorPrestigeArray = Calculations.calculateSurvivorPrestigeStats(matchDetails, survivorPrestigeArray);
      boolean enterAnotherMatch = Match.wantsToEnterAnotherMatch();
      if (enterAnotherMatch == true){
      while (enterAnotherMatch == true){
        
        matchDetails = Match.getMatchDetails();
        killerArray = Calculations.calculateKillerPickStats(matchDetails, killerArray);
        killerPrestigeArray = Calculations.calculateKillerPrestigeStats(matchDetails, killerPrestigeArray);
        survivorArray = Calculations.calculateSurvivorPickStats(matchDetails, survivorArray);
        survivorPrestigeArray = Calculations.calculateSurvivorPrestigeStats(matchDetails, survivorPrestigeArray);
      
        enterAnotherMatch = Match.wantsToEnterAnotherMatch();
        
      
        }
      }
        for (int i = 0; i < matchDetails.length; ++i){
          matchDetails[i] = 0;
        }
      continueProgram = 1;
    }
      else if(userInput.equals("survivors")){
      Lists.survivorList();
      continueProgram = 1;
    }
      
    else if(userInput.equals("exit")){
      continueProgram = 0;
    }
    
    return continueProgram;
  }
}