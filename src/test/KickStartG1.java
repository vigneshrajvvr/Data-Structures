package test;

import java.util.*;
import java.io.*;
public class KickStartG1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    in.nextLine();
    for (int i = 1; i <= t; ++i) {
      int result = 0;
      String value = in.nextLine();
      
      List<Integer> kick = new ArrayList<>();
      List<Integer> start = new ArrayList<>();
     
      // To find position of the string "KICK"
      for(int j=0;j<value.length()-3;j++) {
          if(value.charAt(j) == 'K' && value.substring(j, j+4).equals("KICK")) {
                kick.add(j);                  
          }
      }
      
      // To find position of the string "START"
      for(int j=0;j<value.length()-4;j++) {
          if(value.charAt(j) == 'S' && value.substring(j, j+5).equals("START")) {
                start.add(j);                  
          }
      }
      
      for(int kickValue = 0; kickValue< kick.size();kickValue++) {
    	  for(int startValue = 0; startValue < start.size(); startValue++) {
    		  if(kick.get(kickValue) < start.get(startValue)) {
    			  result += start.size() - startValue;
    			  break;
    		  }
    	  }
      }
      
      System.out.println("Case #" + i + ": " + result);
    }
  }
}
