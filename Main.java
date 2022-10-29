import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
class Main{
    public static void main(String[] args) {
  Scanner Scnr = new Scanner(System.in);
    int continueProgram = 1;
    int [] matchDetails = new int [10];
    int [] killerArray = new int [29];
    int [] killerPrestigeArray = new int [100];
    int [] survivorArray = new int [33];
    int [] survivorPrestigeArray = new int [100];
    String [] stringSaver = new String [matchDetails.length];
    String filePath1 = "D:\\Java\\DeadByDaylight\\matchDetails.txt";
    String filePath2 = "D:\\Java\\DeadByDaylight\\killerArray.txt";
    String filePath3 = "D:\\Java\\DeadByDaylight\\killerPrestigeArray.txt";
    String filePath4 = "D:\\Java\\DeadByDaylight\\survivorArray.txt";
    String filePath5 = "D:\\Java\\DeadByDaylight\\survivorPrestigeArray.txt";
     
      stringSaver = FileSaver.readFrom(filePath1);
      matchDetails = Conversions.stringArrayToInt(stringSaver);
      stringSaver = FileSaver.readFrom(filePath2);
      killerArray = Conversions.stringArrayToInt(stringSaver);
      stringSaver = FileSaver.readFrom(filePath3);
      killerPrestigeArray = Conversions.stringArrayToInt(stringSaver);
      stringSaver = FileSaver.readFrom(filePath4);
      survivorArray = Conversions.stringArrayToInt(stringSaver);
      stringSaver = FileSaver.readFrom(filePath5);
      survivorPrestigeArray = Conversions.stringArrayToInt(stringSaver);
    while (continueProgram == 1){
    continueProgram = Menu.mainMenu(matchDetails, killerArray, killerPrestigeArray, survivorArray, survivorPrestigeArray);
      
    }
    if (continueProgram == 0){
      
      stringSaver = Conversions.intArrayToString(matchDetails);
      FileSaver.saveTo(stringSaver, filePath1);
      stringSaver = Conversions.intArrayToString(killerArray);
      FileSaver.saveTo(stringSaver, filePath2);
      stringSaver = Conversions.intArrayToString(killerPrestigeArray);
      FileSaver.saveTo(stringSaver, filePath3);
      stringSaver = Conversions.intArrayToString(survivorArray);
      FileSaver.saveTo(stringSaver, filePath4);
      stringSaver = Conversions.intArrayToString(survivorPrestigeArray);
      FileSaver.saveTo(stringSaver, filePath5);
      System.out.print("\nThank you, have a great day!");
    }
  }
  }