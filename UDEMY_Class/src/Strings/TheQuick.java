package Strings;

import java.util.Scanner;

public class TheQuick {

	    public static void main(String[] args) {

	        String input = "The quick brown fox jump over the fence";
	        
	        String[] words = input.split(" ");
	        
	        //StringBuilder reversed = new StringBuilder();
	        String reversed = "";
	        
	        
	        for (int i = words.length - 1; i >= 0; i--) {
	            //reversed.append(words[i]).append(" ");
	            reversed += words[i] + " ";
	        }
	        System.out.println("Reversed Output: " + reversed.toString().trim());

	    }
	
}
