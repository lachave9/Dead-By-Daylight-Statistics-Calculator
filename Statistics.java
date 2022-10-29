import java.util.Scanner;
import java.util.Arrays;
class Statistics{
  public static boolean wantsToShowAnotherKiller(){
    Scanner Scnr = new Scanner(System.in);
    boolean showAnotherKiller = false;
    System.out.println("Would you like to show another killer's statistics?(Enter yes or no)");
    String userInput = Scnr.nextLine();
    if (userInput.equals("yes")){
      showAnotherKiller = true;
    }
    else if (userInput.equals("no")){
      showAnotherKiller = false;
    }
    else {
      System.out.println("Command not recognized, defaulting to no.");
        showAnotherKiller = false;
    }
    return showAnotherKiller;
  }
    
  public static void showKillerStatistics(int [] killerArray, int [] killerPrestigeArray){
    Scanner Scnr = new Scanner(System.in);
    System.out.println("Please enter the killer number for detailed statistics. Or enter \"0\" to show all pick rates.");
    int killerNum = Scnr.nextInt();
    if (killerNum == 0){
      int i = 0;
      int totalKillers = 0;
      double [] killerPercent = new double [killerArray.length];
      int totalKPrestigeNumbers = 0;
      int totalKPrestige = 0;
      for(i = 0; i < killerPrestigeArray.length; ++i){
        totalKPrestigeNumbers = killerPrestigeArray[i] + totalKPrestigeNumbers;
      }
      for(i = 0; i < killerPrestigeArray.length; ++i){
        
          totalKPrestige = ((i + 1) * killerPrestigeArray [i]) + totalKPrestige;
      }
      int averageKPrestige = (int)Math.ceil(totalKPrestige / totalKPrestigeNumbers);
      for (i = 0; i < killerArray.length; ++i){
    
        totalKillers = killerArray [i] + totalKillers;
      }
      
      for (i = 0; i < killerArray.length; ++i){
        killerPercent[i] = ((double)killerArray[i] / totalKillers) * 100;
        }
    
        for (i = 0;i < 31; ++i){
        if (i == 0){
        System.out.println("\nDead by Daylight Killer Pick Rates\n");
        }
        else if (i == 1){
          System.out.printf("  1.)  \"Evan MacMillan\"   The Trapper \n     Pick Rate: %.1f%%\n", killerPercent [0]);
        }
        else if (i == 2){
        System.out.printf("\n  2.)  \"Phillip Ojomo\"     The Wraith \n     Pick Rate: %.1f%%\n", killerPercent [1]);
        }
        else if (i == 3){
          System.out.printf("\n  3.)  \"Max Thompson Jr.\" The Hillbilly \n     Pick Rate: %.1f%%\n", killerPercent [2]);
        }
        else if (i == 4){
          System.out.printf("\n  4.)  \"Sally Smithson\"   The Nurse \n     Pick Rate: %.1f%%\n", killerPercent [3]);
        }
        else if (i == 5){
          System.out.printf("\n  5.)  \"Michael Myers\"    The Shape \n     Pick Rate: %.1f%%\n", killerPercent [4]);
        }
        else if (i == 6){
          System.out.printf("\n  6.)  \"Lisa Sherwood\"    The Hag \n     Pick Rate: %.1f%%\n", killerPercent [5]);
        }
        else if (i == 7){
          System.out.printf("\n  7.)  \"Herman Carter\"    The Doctor \n     Pick Rate: %.1f%%\n", killerPercent [6]);
        }
        else if (i == 8){
          System.out.printf("\n  8.)  \"Anna\"             The Huntress \n     Pick Rate: %.1f%%\n", killerPercent [7]);
        }
        else if (i == 9){
          System.out.printf("\n  9.)  \"Bubba Sawyer\"     The Cannibal \n     Pick Rate: %.1f%%\n", killerPercent [8]);
        }
        else if (i == 10){
          System.out.printf("\n  10.) \"Freddy Krueger\"   The Nightmare \n     Pick Rate: %.1f%%\n", killerPercent [9]);
        }
        else if (i == 11){
          System.out.printf("\n  11.) \"Amanda Young\"     The Pig \n     Pick Rate: %.1f%%\n", killerPercent [10]);
        }
        else if (i == 12){
          System.out.printf("\n  12.) \"Jeffrey Hawk\"     The Clown \n     Pick Rate: %.1f%%\n", killerPercent [11]);
        }
        else if (i == 13){
          System.out.printf("\n  13.) \"Rin Yamaoka\"      The Spirit \n     Pick Rate: %.1f%%\n", killerPercent [12]);
        }
        else if (i == 14){
          System.out.printf("\n  14.) \"Frank, Susie, Julie, and Joey\" The Legion \n     Pick Rate: %.1f%%\n", killerPercent [13]);
        }
        else if (i == 15){
          System.out.printf("\n  15.) \"Adiris\"           The Plague \n     Pick Rate: %.1f%%\n", killerPercent [14]);
        }
        else if (i == 16){
          System.out.printf("\n  16.) \"Danny Johnson\"    Ghost Face \n     Pick Rate: %.1f%%\n", killerPercent [15]);
        }
        else if (i == 17){
          System.out.printf("\n  17.) \"Cute Puppy\"       The Demogorgon \n     Pick Rate: %.1f%%\n", killerPercent [16]);
        }
        else if (i == 18){
          System.out.printf("\n  18.) \"Kazan Yamaoka\"    The Oni \n     Pick Rate: %.1f%%\n", killerPercent [17]);
        }
        else if (i == 19){
          System.out.printf("\n  19.) \"Caleb Quinn\"      The Deathslinger \n     Pick Rate: %.1f%%\n", killerPercent [18]);
        }
        else if (i == 20){
          System.out.printf("\n  20.) \"Pyramid Head\"     The Executioner \n     Pick Rate: %.1f%%\n", killerPercent [19]);
        }
          else if (i == 21){
          System.out.printf("\n  21.) \"Talbot Grimes\"    The Blight \n     Pick Rate: %.1f%%\n", killerPercent [20]);
        }
        else if (i == 22){
          System.out.printf("\n  22.) \"Charlotte and Victor Deshayes\" The Twins \n     Pick Rate: %.1f%%\n", killerPercent [21]);
        }
        else if (i == 23){
          System.out.printf("\n  23.) \"Ji-Woon Hak\"      The Trickster \n     Pick Rate: %.1f%%\n", killerPercent [22]);
        }
        else if (i == 24){
          System.out.printf("\n  24.) \"Nemesis T-Type\"   The Nemesis \n     Pick Rate: %.1f%%\n", killerPercent [23]);
        }
        else if (i == 25){
          System.out.printf("\n  25.) \"Elliot Spencer\"   The Cenobite \n     Pick Rate: %.1f%%\n", killerPercent [24]);
        }
        else if (i == 26){
          System.out.printf("\n  26.) \"Carmina Mora\"     The Artist \n     Pick Rate: %.1f%%\n", killerPercent [25]);
        }
        else if (i == 27){
          System.out.printf("\n  27.) \"Sadako Yamamura\"  The Onryo \n     Pick Rate: %.1f%%\n", killerPercent [26]);
        }
        else if (i == 28){
          System.out.printf("\n  28.) \"Turkey\"           The Dredge \n     Pick Rate: %.1f%%\n", killerPercent [27]);
        }
        else if (i == 29){
          System.out.printf("\n  29.) \"Albert Wesker\"    The Mastermind \n     Pick Rate: %.1f%%\n", killerPercent [28]);
        }
           else if (i == 30){
          System.out.printf("\n     Average killer prestige:   %d\n\n", averageKPrestige);
        }
    
    
  }
    }
    else if(killerNum == 1){
      System.out.println("  1.) \"Evan MacMillan\" The Trapper");
      System.out.println("Weapon          :  Cleaver");
      System.out.println("Power           :  Bear Trap");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Unnerving Presence\", \"Agitation\", and \"Brutal Strength\"\n");
    }
    else if(killerNum == 2){
      System.out.println("  2.) \"Phillip Ojomo\" The Wraith");
      System.out.println("Weapon          :  Azarov's Skull");
      System.out.println("Power           :  Wailing Bell");
      System.out.println("Base Speed      :  4.6 m/s (cloaked 6.0 m/s)");
      System.out.println("Teachable Perks : \"Predator\", \"Bloodhound\", and \"Shadowborn\"\n");
    }
    else if(killerNum == 3){
      System.out.println("  3.) \"Max Thompson Jr.\" The Hillbilly");
      System.out.println("Weapon          :  The Hammer");
      System.out.println("Power           :  Chainsaw");
      System.out.println("Base Speed      :  4.6 m/s (Chainsaw 9.2 m/s)");
      System.out.println("Teachable Perks : \"Lightborn\", \"Tinkerer\", and \"Enduring\"\n");
    }
    else if(killerNum == 4){
      System.out.println("  4.) \"Sally Smithson\" The Nurse");
      System.out.println("Weapon          :  The Bonesaw");
      System.out.println("Power           :  Spencer's Last Breath");
      System.out.println("Base Speed      :  3.85 m/s");
      System.out.println("Teachable Perks : \"Thanatophobia\", \"Stridor\", and \"A Nurse's Calling\"\n");
    }
    else if(killerNum == 5){
      System.out.println("  5.) \"Michael Myers\" The Shape");
      System.out.println("Weapon          :  Kitchen Knife");
      System.out.println("Power           :  Evil Within");
      System.out.println("Base Speed      :  4.2 m/s (Evil Within II and III 4.6 m/s)");
      System.out.println("Teachable Perks : \"Save The Best For Last\", \"Play With Your Food\", and \"Dying Light\"\n");
    }
    else if(killerNum == 6){
      System.out.println("  6.) \"Lisa Sherwood\" The Hag");
      System.out.println("Weapon          :  The Claw");
      System.out.println("Power           :  Blackened Catalyst");
      System.out.println("Base Speed      :  4.4 m/s");
      System.out.println("Teachable Perks : \"Hex: Ruin\", \"Hex: The Third Seal\", and \"Hex: Devour Hope\"\n");
    }
    else if(killerNum == 7){
      System.out.println("  7.) \"Herman Carter\" The Doctor");
      System.out.println("Weapon          :  The Stick");
      System.out.println("Power           :  Carter's Spark");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Overwhelming Presence\", \"Monitor and Abuse\", and \"Overcharge\"\n");
    }
    else if(killerNum == 8){
      System.out.println("  8.) \"Anna\" The Huntress");
      System.out.println("Weapon          :  Hunting Hatchets");
      System.out.println("Power           :  Broad Axe");
      System.out.println("Base Speed      :  4.4 m/s");
      System.out.println("Teachable Perks : \"Beast of Prey\", \"Territorial Imperitave\", and \"Hex: Huntress Lulaby\"\n");
    }
    else if(killerNum == 9){
      System.out.println("  9.) \"Bubba Sawyer\" The Cannibal");
      System.out.println("Weapon          :  The Sledge");
      System.out.println("Power           :  Bubba's Chainsaw");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Barbeque and Chili\", \"Franklin's Demise\", and \"Knockout\"\n");
    }
    else if(killerNum == 10){
      System.out.println("  10.) \"Freddy Krueger\" The Nightmare");
      System.out.println("Weapon          :  Clawed Glove");
      System.out.println("Power           :  Dream Demon");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Fire Up\", \"Blood Warden\", and \"Remember Me\"\n");
    }
    else if(killerNum == 11){
      System.out.println("  11.) \"Amanda Young\" The Pig");
      System.out.println("Weapon          :  Hidden Blade");
      System.out.println("Power           :  Jigsaw's Baptism");
      System.out.println("Base Speed      :  4.6 m/s (crouched 3.6 m/s");
      System.out.println("Teachable Perks : \"Hangman's Trick\", \"Surveilance\", and \"Make Your Choice\"\n");
    }
    else if(killerNum == 12){
      System.out.println("  12.) \"Jeffrey Hawk\" The Clown");
      System.out.println("Weapon          :  Madame Butterfly");
      System.out.println("Power           :  The Afterpiece Tonic");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Caulrophobia\", \"Bamboozle\", and \"Pop Goes The Weezle\"\n");
    }
    else if(killerNum == 13){
      System.out.println("  13.) \"Rin Yamaoka\" The Spirit");
      System.out.println("Weapon          :  Shattered Katana");
      System.out.println("Power           :  Yamaoka's Haunting");
      System.out.println("Base Speed      :  4.4 m/s");
      System.out.println("Teachable Perks : \"Hex: Haunted Ground\", \"Spirit Fury\", and \"Rancor\"\n");
    }
    else if(killerNum == 14){
      System.out.println("  14.) \"Frank, Susie, Julie, and Joey\" The Legion");
      System.out.println("Weapon          :  Hunting Knife");
      System.out.println("Power           :  Feral Frenzy");
      System.out.println("Base Speed      :  4.6 m/s (Feral Frenzy 5.6 m/s)");
      System.out.println("Teachable Perks : \"Discordance\", \"Mad Grit\", and \"Iron Maiden\"\n");
    }
    else if(killerNum == 15){
      System.out.println("  15.) \"Adiris\" The Plague");
      System.out.println("Weapon          :  Profane Censer");
      System.out.println("Power           :  Vile Purge");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Corrupt Intervention\", \"Dark Devotion\", and \"Infectious Fright\"\n");
    }
    else if(killerNum == 16){
      System.out.println("  16.) \"Danny Johnson\" Ghost Face");
      System.out.println("Weapon          :  Tactical Knife");
      System.out.println("Power           :  Night Shroud");
      System.out.println("Base Speed      :  4.6 m/s (Crouched 3.6 m/s");
      System.out.println("Teachable Perks : \"I'm All Ears\", \"Thrilling Tremors\", and \"Furtive Chase\"\n");
    }
    else if(killerNum == 17){
      System.out.println("  17.) \"Cute Puppy\" The Demogorgon");
      System.out.println("Weapon          :  Barbed Claw");
      System.out.println("Power           :  Of The Abyss");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Jolt\", \"Fearmonger\", and \"Claustrophobia\"\n");
    }
    else if(killerNum == 18){
      System.out.println("  18.) \"Kazan Yamaoka\" The Oni");
      System.out.println("Weapon          :  Yamaoka's Blade");
      System.out.println("Power           :  Yamaoka's Wrath");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Zanshin Tactics\", \"Blood Echo\", and \"Nemesis\"\n");
    }
    else if(killerNum == 19){
      System.out.println("  19.) \"Caleb Quinn\" The Deathslinger");
      System.out.println("Weapon          :  Death to Bayshore");
      System.out.println("Power           :  The Redeemer");
      System.out.println("Base Speed      :  4.4 m/s");
      System.out.println("Teachable Perks : \"Gearhead\", \"Dead Man's Switch\", and \"Hex: Retribution\"\n");
    }
    else if(killerNum == 20){
      System.out.println("  20.) \"Pyramid Head\" The Executioner");
      System.out.println("Weapon          :  Great Knife");
      System.out.println("Power           :  Rights of Judgement");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Forced Penance\", \"Trail of Torment\", and \"Deathbound\"\n");
    }
    else if(killerNum == 21){
      System.out.println("  21.) \"Talbot Grimes\" The Blight");
      System.out.println("Weapon          :  Bonebuster");
      System.out.println("Power           :  Blighted Corruption");
      System.out.println("Base Speed      :  4.6 m/s (Rush 9.2 m/s)");
      System.out.println("Teachable Perks : \"Hex: Undying\", \"Dragon's Grip\", and \"Hex: Blood Favor\"\n");
    }
    else if(killerNum == 22){
      System.out.println("  22.) \"Charlotte and Victor Deshayes\" The Twins");
      System.out.println("Weapon          :  Blade of Marseille");
      System.out.println("Power           :  Blood Bond");
      System.out.println("Base Speed      :  4.6 m/s (Victor 6.0 m/s)");
      System.out.println("Teachable Perks : \"\", \"\", and \"\"\n");
    }
    else if(killerNum == 23){
      System.out.println("  23.) \"Ji-Woon Hak\" The Trickster");
      System.out.println("Weapon          :  Polished Head-Smasher");
      System.out.println("Power           :  Showstopper");
      System.out.println("Base Speed      :  4.4 m/s");
      System.out.println("Teachable Perks : \"Starstruck\", \"Hex: Crowd Control\", and \"No Way Out\"\n");
    }
    else if(killerNum == 24){
      System.out.println("  24.) \"Nemesis T-Type\" The Nemesis");
      System.out.println("Weapon          :  Raw Fists");
      System.out.println("Power           :  T-Virus");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Hysteria\", \"Lethal Pursuer\", and \"Eruption\"\n");
    }
    else if(killerNum == 25){
      System.out.println("  25.) \"Elliot Spencer\" The Cenobite");
      System.out.println("Weapon          :  Hook and Chain");
      System.out.println("Power           :  Summons of Pain");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Deadlock\", \"Hex: Plaything\", and \"Scourge Hook: Gift of Pain\"\n");
    }
    else if(killerNum == 26){
      System.out.println("  26.) \"Carmina Mora\" The Artist");
      System.out.println("Weapon          :  Sharp Palette Blade");
      System.out.println("Power           :  Birds of Torment");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Grim Embrace\", \"Scourge Hook: Pain Resonance\", and \"Hex: Pentimento\"\n");
    }
    else if(killerNum == 27){
      System.out.println("  27.) \"Sadako Yamamura\" The Onryo");
      System.out.println("Weapon          :  Ring of Fury");
      System.out.println("Power           :  Deluge of Fear");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Sourge Hook: Floods of Rage\", \"Call of Brine\", and \"Merciless Storm\"\n");
    }
    else if(killerNum == 28){
      System.out.println("  28.) \"Turkey\" The Dredge");
      System.out.println("Weapon          :  Knotted Appendage");
      System.out.println("Power           :  Reign of Darkness");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Dissolution\", \"Darkness Revealed\", and \"Septic Touch\"\n");
    }
    else if(killerNum == 29){
      System.out.println("   29.) \"Albert Wesker\" The Mastermind");
      System.out.println("Weapon          :  Combat Knife");
      System.out.println("Power           :  Virulent Bound");
      System.out.println("Base Speed      :  4.6 m/s");
      System.out.println("Teachable Perks : \"Superior Anatomy\", \"Virulent Bound\", and \"Awakened Awareness\"\n");
    }
    
    
  }
  public static void showSurvivorStatistics (int [] survivorArray, int [] survivorPrestigeArray){
      int totalPrestige = 0;
      int totalPrestigeNumbers = 0;
      int i = 0;
      int totalSurvivors = 0;
      double [] survivorPercent = new double [survivorArray.length];
      for(i = 0; i < survivorPrestigeArray.length; ++i){
        totalPrestigeNumbers = survivorPrestigeArray[i] + totalPrestigeNumbers;
      }
      for(i = 0; i < survivorPrestigeArray.length; ++i){
        
          totalPrestige = ((i + 1) * survivorPrestigeArray [i]) + totalPrestige;
      }
      int averagePrestige = (int)Math.ceil(totalPrestige / totalPrestigeNumbers);
      for (i = 0; i < survivorArray.length; ++i){
    
        totalSurvivors = survivorArray [i] + totalSurvivors;
      }
      
      for (i = 0; i < survivorArray.length; ++i){
        survivorPercent[i] = ((double)survivorArray[i] / totalSurvivors) * 100;
        }
    
        for (i = 0;i < 35; ++i){
        if (i == 0){
        System.out.println("\nDead by Daylight Survivor Pick Rates\n");
        }
        else if (i == 1){
          System.out.printf("  1.)   Dwight Fairfield              Pick Rate: %.1f%%\n", survivorPercent [0]);
        }
        else if (i == 2){
          System.out.printf("  2.)   Meg Thomas                    Pick Rate: %.1f%%\n", survivorPercent [1]);
        }
        else if (i == 3){
          System.out.printf("  3.)   Claudette Morel               Pick Rate: %.1f%%\n", survivorPercent [2]);
        }
        else if (i == 4){
          System.out.printf("  4.)   Jake Park                     Pick Rate: %.1f%%\n", survivorPercent [3]);
        }
        else if (i == 5){
          System.out.printf("  5.)   Nea Karlsson                  Pick Rate: %.1f%%\n", survivorPercent [4]);
        }
        else if (i == 6){
          System.out.printf("  6.)   Laurie Strode                 Pick Rate: %.1f%%\n", survivorPercent [5]);
        }
        else if (i == 7){
          System.out.printf("  7.)   Ace Visconti                  Pick Rate: %.1f%%\n", survivorPercent [6]);
        }
        else if (i == 8){
          System.out.printf("  8.)   William \"Bill\" Overbeck       Pick Rate: %.1f%%\n", survivorPercent [7]);
        }
        else if (i == 9){
          System.out.printf("  9.)   Feng Min                      Pick Rate: %.1f%%\n", survivorPercent [8]);
        }
        else if (i == 10){
          System.out.printf("  10.)  David King                    Pick Rate: %.1f%%\n", survivorPercent [9]);
        }
        else if (i == 11){
          System.out.printf("  11.)  Quentin Smith                 Pick Rate: %.1f%%\n", survivorPercent [10]);
        }
        else if (i == 12){
          System.out.printf("  12.)  Detective David Tapp          Pick Rate: %.1f%%\n", survivorPercent [11]);
        }
        else if (i == 13){
          System.out.printf("  13.)  Kate Denson                   Pick Rate: %.1f%%\n", survivorPercent [12]);
        }
        else if (i == 14){
          System.out.printf("  14.)  Adam Francis                  Pick Rate: %.1f%%\n", survivorPercent [13]);
        }
        else if (i == 15){
          System.out.printf("  15.)  Jeffrey \"Jeff\" Johansen       Pick Rate: %.1f%%\n", survivorPercent [14]);
        }
        else if (i == 16){
          System.out.printf("  16.)  Jane Romero                   Pick Rate: %.1f%%\n", survivorPercent [15]);
        }
        else if (i == 17){
          System.out.printf("  17.)  Ashley J. Williams            Pick Rate: %.1f%%\n", survivorPercent [16]);
        }
        else if (i == 18){
          System.out.printf("  18.)  Nancy Wheeler                 Pick Rate: %.1f%%\n", survivorPercent [17]);
        }
        else if (i == 19){
          System.out.printf("  19.)  Steve Harrington              Pick Rate: %.1f%%\n", survivorPercent [18]);
        }
        else if (i == 20){
          System.out.printf("  20.)  Yui Kimura                    Pick Rate: %.1f%%\n", survivorPercent [19]);
        }
          else if (i == 21){
          System.out.printf("  21.)  Zarina Kassir                 Pick Rate: %.1f%%\n", survivorPercent [20]);
        }
        else if (i == 22){
          System.out.printf("  22.)  Cheryl Mason                  Pick Rate: %.1f%%\n", survivorPercent [21]);
        }
        else if (i == 23){
          System.out.printf("  23.)  Felix Richter                 Pick Rate: %.1f%%\n", survivorPercent [22]);
        }
        else if (i == 24){
          System.out.printf("  24.)  Elodie Rakoto                 Pick Rate: %.1f%%\n", survivorPercent [23]);
        }
        else if (i == 25){
          System.out.printf("  25.)  Yun-Jin Lee                   Pick Rate: %.1f%%\n", survivorPercent [24]);
        }
        else if (i == 26){
          System.out.printf("  26.)  Jill Valentine                Pick Rate: %.1f%%\n", survivorPercent [25]);
        }
        else if (i == 27){
          System.out.printf("  27.)  Leon Scott Kennedy            Pick Rate: %.1f%%\n", survivorPercent [26]);
        }
        else if (i == 28){
          System.out.printf("  28.)  Mikaela Reid                  Pick Rate: %.1f%%\n", survivorPercent [27]);
        }
        else if (i == 29){
          System.out.printf("  29.)  Jonah Vasquez                 Pick Rate: %.1f%%\n", survivorPercent [28]);
        }
        else if (i == 30){
          System.out.printf("  30.)  Yoichi Asakawa                Pick Rate: %.1f%%\n", survivorPercent [29]);
        }
        else if (i == 31){
          System.out.printf("  31.)  Haddie Kaur                   Pick Rate: %.1f%%\n", survivorPercent [30]);
        }
        else if (i == 32){
          System.out.printf("  32.)  Ada Wong                      Pick Rate: %.1f%%\n", survivorPercent [31]);
        }
        else if (i == 33){
          System.out.printf("  33.)  Rebecca Chambers              Pick Rate: %.1f%%\n", survivorPercent [32]);
        }
        else if (i == 34){
          System.out.printf("\n     Average survivor prestige:   %d\n\n", averagePrestige);
        }
    }
  }
}