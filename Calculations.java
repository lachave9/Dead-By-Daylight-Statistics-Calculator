import java.util.Arrays;
import java.util.Scanner;
class Calculations{
  public static int [] calculateKillerPickStats(int [] matchArray, int [] killerArray){
    
    int killerNum = matchArray [0];
    killerArray [killerNum - 1] = killerArray [killerNum - 1] + 1;
    return killerArray;
    
  }
  public static int [] calculateKillerPrestigeStats(int [] matchArray, int [] killerPrestigeArray){
   
    int killerPrestige = matchArray [1];
    killerPrestigeArray [killerPrestige - 1] = killerPrestigeArray [killerPrestige - 1] + 1;
    return killerPrestigeArray;
  }
  public static int [] calculateSurvivorPickStats(int [] matchArray, int [] survivorArray){
  
    int survivorOne = matchArray [2];
    int survivorTwo = matchArray [4];
    int survivorThree = matchArray [6];
    int survivorFour = matchArray [8];
    survivorArray [survivorOne - 1] = survivorArray [survivorOne - 1] + 1;
    survivorArray [survivorTwo - 1] = survivorArray [survivorTwo - 1] + 1;
    survivorArray [survivorThree - 1] = survivorArray [survivorThree - 1] + 1;
    survivorArray [survivorFour - 1] = survivorArray [survivorFour - 1] + 1;
    return survivorArray;
  }
  public static int [] calculateSurvivorPrestigeStats(int [] matchArray, int [] survivorPrestigeArray){
 
    int survivorPOne = matchArray [3];
    int survivorPTwo = matchArray [5];
    int survivorPThree = matchArray [7];
    int survivorPFour = matchArray [9];
    survivorPrestigeArray [survivorPOne - 1] = survivorPrestigeArray [survivorPOne - 1] + 1;
    survivorPrestigeArray [survivorPTwo - 1] = survivorPrestigeArray [survivorPTwo - 1] + 1;
    survivorPrestigeArray [survivorPThree - 1] = survivorPrestigeArray [survivorPThree - 1] + 1;
    survivorPrestigeArray [survivorPFour - 1] = survivorPrestigeArray [survivorPFour - 1] + 1;
    return survivorPrestigeArray;
  }
}