package randomproblems;

import java.util.Scanner;
import java.util.logging.Logger;

public class GenerateSubstrings {
	
	private static Logger LOG_VARIABLE = Logger.getLogger("GenerateSubstrings");
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		LOG_VARIABLE.info("Enter the input");
				
		String input = in.nextLine();
		
		if(input.trim().length() == 0) {
			LOG_VARIABLE.info("Empty input!!!");
		}
		
		LOG_VARIABLE.info("Sub strings of string : " + input);
					
			for(int j=1;j<=input.length();j++) {
				
				String tempString = "";
				
				for(int k=0;k<=input.length() - j;k++) {
					
//					tempString += input.substring(k,k + j);
					
					System.out.print(input.substring(k,k + j) + " ");
//					LOG_VARIABLE.info(input.substring(k,k + j));
					
				}
				
				System.out.println(tempString);
				
			}		
	}

}
