package com.fresco;
import java.util.*;
public class Hashset
{
    public static String getOut(int numberOfMatches, String squads, int squad1, int squad2)
    {
        //write your code here
        String outstring = "";
        
        //split inputstring to get separate string for each match
        String[] allPlayers = squads.split("#");
        HashSet<String> playersSet = new HashSet<String>();
        for(int i=0;i<numberOfMatches;i++){
          String[] currentMatchPlayers = allPlayers[i].split(" ");
          for(String s: currentMatchPlayers){
            playersSet.add(s);
          }
        }

        Iterator<String> playerItr = playersSet.iterator();
        HashSet<String> playedAllMatch = new HashSet<>();
        HashSet<String> resultPlayer = new HashSet<>();
        while(playerItr.hasNext()){
          String temp = playerItr.next();
          boolean inAll = true;
          for(int i=0;i<numberOfMatches;i++){
            if(!allPlayers[i].contains(temp)){
              inAll = false;
            }
          } 
          if(inAll){
              playedAllMatch.add(temp);
          }
          if((!allPlayers[squad1-1].contains(temp)) && allPlayers[squad2-1].contains(temp)){
            resultPlayer.add(temp);
          }
        }

        Iterator playedAllIter = playedAllMatch.iterator();
        while(playedAllIter.hasNext()){
          outstring += playedAllIter.next()+" ";
        }
        outstring = outstring.substring(0,outstring.length()-1)+", ";
        Iterator resultPlayerIter = resultPlayer.iterator();
        while(resultPlayerIter.hasNext()){
          outstring += resultPlayerIter.next()+" ";
        }
        outstring = outstring.substring(0,outstring.length()-1)+", ";
        return outstring;
    }
}
