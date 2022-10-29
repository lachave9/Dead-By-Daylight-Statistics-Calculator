import java.util.Arrays;
 
class Conversions{
    public static String [] intArrayToString(int [] matchDetails)
    {

       String [] stringSaver = new String [matchDetails.length];
 
        for (int i = 0; i < matchDetails.length; i++) {
            stringSaver[i] = String.valueOf(matchDetails[i]);
        }
 
        return stringSaver;
    }
  public static int [] stringArrayToInt(String [] stringSaver){

int[] matchDetails = new int[stringSaver.length];

for (int i = 0; i < stringSaver.length; i++) {
    try {
        matchDetails[i] = Integer.parseInt(stringSaver[i]);
    } catch (NumberFormatException nfe) {
    }
}
    return matchDetails;
  }
}