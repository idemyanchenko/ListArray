package main;

import java.util.ArrayList;
import java.util.List;

import utils.UIUtils;

public class ConsoleListReader {
	
	public static ArrayList<String> listReader(){
		String temp=null;	
		ArrayList<String> cities = new ArrayList<String>();	

		while (temp.equalsIgnoreCase("Q")){
			temp=UIUtils.readString("Enter a city (Q to finish): ");
			cities.add(temp);
		}

		return cities;
	}

}
