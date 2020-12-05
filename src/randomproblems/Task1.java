package randomproblems;

/*
 *Refer the PDF for task details
*/

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Should not use 
 * javax.xml.* or 
 * org.w3c.* or
 * org.jsoup.* or
 * any other such libraries
 * You should find the logic from scratch
*/

public class Task1 {
	
	public static void main(String[] args) throws IOException {

		String inputHTMLTags = new String(Files.readAllBytes(Paths.get("E:\\Programming\\Data Structures java\\Data Structures\\Data-Structures\\src\\randomproblems\\htmlFile.txt")));
//		System.out.println(inputHTMLTags);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to enter the line number or 2 to enter the tag name:");
		int userInput1 = sc.nextInt();
		
		switch(userInput1) {
			case 1:
				System.out.println("Enter the line number:");
				int lineNumber = sc.nextInt();
				findchildUsingLineNumber(inputHTMLTags, lineNumber);
				break;
			case 2:
				System.out.println("Enter the tag name:");
				sc.nextLine();
				String tagName = sc.nextLine();
				findchildUsingTagName(inputHTMLTags, tagName);
				break;
			default:
					System.out.println("Invalid Option at Switch");
		}
	}

	public static void findchildUsingLineNumber(String inputHTMLTags, int lineNumber) {
		
		int tagsCount = 0;
		
		// To make sure lineNumber is valid
		for(int i=0;i<inputHTMLTags.length();i++) {
			if(inputHTMLTags.charAt(i) == '<') {
				tagsCount++;
			}
		}		
		if(lineNumber > tagsCount) {
			System.out.println("Line number is not valid");
			return;
		}

		ArrayList<String> child = new ArrayList<String>();

		/*
		 * To find the line number and find child tag
		*/
		
		tagsCount = 0;
		for(int i=0;i<inputHTMLTags.length();i++) {
			if(inputHTMLTags.charAt(i) == '<') {
				tagsCount++;
			}
			if(tagsCount == lineNumber) {
				
				// To check if the line number specified contains closing tag
				if(inputHTMLTags.charAt(i+1) ==  '/') {
					System.out.println("Line number specified contains closing tag!! NO CHILD TO BE FOUND");
					return;
				}
				
				// To check if the line number specified contains self closing tag
				int parentClosingIndex = inputHTMLTags.indexOf('>', i) - 1;
				if(inputHTMLTags.charAt(parentClosingIndex) == '/') {
					System.out.println("Tag is a self closing tag. NO CHILD TO BE FOUND");
				}
				
				String parentTag = inputHTMLTags.substring(i+1, inputHTMLTags.indexOf('>', i));
				
				// Parent tag with no child tag
				int nextOpeningTag = inputHTMLTags.indexOf('<', i+1);				
				if(inputHTMLTags.substring(nextOpeningTag + 2, inputHTMLTags.indexOf('>', nextOpeningTag)).equals(parentTag)) {
					System.out.println("Parent tag doesn't contain any child");
				}
				
		        // Finding substring 		
				int tempOpeningTagIndex = nextOpeningTag;
				int tempClosingIndex = inputHTMLTags.indexOf('>', nextOpeningTag);
				String tempTag = "";
				
				while(!tempTag.equals(parentTag)) {
					
					// if the line number specified contains self closing tag
					if(inputHTMLTags.charAt(tempClosingIndex-1) == '/') {
						tempTag = inputHTMLTags.substring(tempOpeningTagIndex + 1, tempClosingIndex - 1);
						child.add(tempTag);
						tempOpeningTagIndex = inputHTMLTags.indexOf('<', tempClosingIndex);
						tempClosingIndex = inputHTMLTags.indexOf('>', tempOpeningTagIndex);
						tempTag = inputHTMLTags.substring(tempOpeningTagIndex, tempClosingIndex+1);
						continue;
					}
					tempTag = inputHTMLTags.substring(tempOpeningTagIndex + 1, tempClosingIndex);
					child.add(tempTag);
					tempOpeningTagIndex = inputHTMLTags.indexOf(tempTag, tempClosingIndex);
					tempClosingIndex = inputHTMLTags.indexOf('>', tempOpeningTagIndex);
					tempTag = inputHTMLTags.substring(tempOpeningTagIndex + 2, tempClosingIndex);
					
					tempOpeningTagIndex = inputHTMLTags.indexOf('<', tempClosingIndex);
					tempClosingIndex = inputHTMLTags.indexOf('>', tempOpeningTagIndex);
					tempTag = inputHTMLTags.substring(tempOpeningTagIndex + 2, tempClosingIndex);
				}
				break;
			}
		}

		System.out.println("Output: "+child);
	}

	public static void findchildUsingTagName(String inputHTMLTags, String tagName) {

		ArrayList<String> child = new ArrayList<String>();

		/*
		 * Write your logic here
		*/

		System.out.println("Output: "+child);
	}

}