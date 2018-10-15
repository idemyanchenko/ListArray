package utils;

import java.util.Scanner;

public class UIUtils {

	public static String readString(String message) {
		
	    System.out.print(message);
	    return (new Scanner(System.in)).nextLine();
	}

	public static int readNumber(String message) {
	
	    int result = 0;
	    boolean isValid = false;
	
	    do {
	        try {
	            result = Integer.valueOf(readString(message));
	
	            isValid = true;
	        } catch (NumberFormatException e) {
	            System.out.println("Please enter valid number");
	        }
	    } while(!isValid);
	
	    return result;
	}

}
