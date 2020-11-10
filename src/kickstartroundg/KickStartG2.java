package kickstartroundg;

import java.util.*;
import java.io.*;
public class KickStartG2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int sum = 0;
      int n = in.nextInt();
      int arr[][] = new int[n][n];
      
      for(int j=0;j<n;j++) {
    	  for(int k=0;k<n;k++) {
    		  arr[j][k] = in.nextInt();
    	  }
      }
      
  	  for(int k = 0;k<n;k++) {
    		      		  
    		  int tempSum = 0;
    		  int tempj = 0;
    		  int tempk = k;
    		  while(tempj < n && tempk < n) {
    			  tempSum += arr[tempj][tempk];
    			  tempj++;
    			  tempk++;
    		  }
    		  
    		  if(tempSum > sum) {
    			  sum = tempSum;
    		  }
  	 }
  	  
  	for(int j = 0;j<n;j++) {
		  
		  int tempSum = 0;
		  int tempj = j;
		  int tempk = 0;
		  while(tempj < n && tempk < n) {
			  tempSum += arr[tempj][tempk];
			  tempj++;
			  tempk++;
		  }
		  
		  if(tempSum > sum) {
			  sum = tempSum;
		  }
  	}
  	  
  	
      
      System.out.println("Case #" + i + ": " + sum);
    }
  }
}