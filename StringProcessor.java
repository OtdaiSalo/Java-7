package textsearcher;
import textsearcher.Main;
import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringProcessor {

	 
	String input;
	private ArrayList<String> exclamatoryList;
    public int consonant, vowels, digit, specialChar;


    public StringProcessor (String input) throws NullPointerException {
        if (input != null) {
            this.input = input;
            
        } else {
            throw new NullPointerException();
        }
    }
    
    public int findConsonantWords(String someText) {
 	   
		for(int i = 0; i < someText.length(); i++) {
			
        char ch = someText.charAt(i); 
 
        if ( (ch >= 'a' && ch <= 'z') ||  
            (ch >= 'A' && ch <= 'Z') ) { 
  
            // To handle upper case letters 
            ch = Character.toLowerCase(ch);; 
  
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') 
                vowels++; 
            else
            	consonant++;
        } 
        else if (ch >= '0' && ch <= '9') 
            digit++; 
        else
            specialChar++; 
		}
		
return consonant;  
}
    
    public void findExclSentences() {
  
    			//Pattern pattern = Pattern.compile("^\\s+[A-Za-z,;'\"\\s]+[!]$");
    			//Pattern pattern = Pattern.compile("(\\.|\\!|\\?)\\s([A-Z]).*!");
    	        String inText = input;
    	        String someText;
    	        Pattern pattern = Pattern.compile("(([a-zA-Z0-9]|[,]|[;])+\\s*)+(\\!)");
    			Matcher matcher = pattern.matcher(inText);    
    			while(matcher.find()) {
    				someText = inText.substring(matcher.start(), matcher.end());
    				System.out.println(inText.substring(matcher.start(), matcher.end()));
    				System.out.println("Number of consonant words: " + this.findConsonantWords(someText));
    				
    			}
    	} 
    
}

