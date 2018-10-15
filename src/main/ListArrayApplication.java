package main;

import java.util.ArrayList;
import java.util.Arrays;

public class ListArrayApplication {

	public static void main (String[] arg){
		
		ArrayList<String> cities = new ArrayList<String>(Arrays.asList("Minsk", "Lida", "Baranovichi", "Grodno", "Soligorsk"));
//		ArrayList<String> cities = new ConsoleListReader.listReader();
		
		System.out.println(cities);
		
//Sort of length
		for (int i=0; i<cities.size(); i++){
			String max=cities.get(i);			
			for (int j=i; j<cities.size(); j++){
				if (max.length()<cities.get(j).length()){
					cities.set(i,cities.get(j));
					cities.set(j, max);	
					max=cities.get(i);
				}
			}			
		}		
		System.out.println(cities);	
		
//Find the second of length string		
		System.out.println(cities.get(1));
		System.out.println(vowels(cities.get(0)));
		
//Sort of vowels number in the string
		for (int i=0; i<cities.size(); i++){
			String max=cities.get(i);			
			for (int j=i; j<cities.size(); j++){
				if (vowels(max)<vowels(cities.get(j))){
					cities.set(i,cities.get(j));
					cities.set(j, max);	
					max=cities.get(i);
				}
			}
			
		}		
		System.out.println(cities);	
		
//Sort of consonants number in the string
		for (int i=0; i<cities.size(); i++){
			String max=cities.get(i);			
			for (int j=i; j<cities.size(); j++){
				if (consonants(max)<consonants(cities.get(j))){
					cities.set(i,cities.get(j));
					cities.set(j, max);	
					max=cities.get(i);
				}
			}
			
		}		
		System.out.println(cities);	
		
//Change by places first and last letters in each second string of list or array 
		int i=0;
		while (i<cities.size()){
			String temp=cities.get(i).substring(0,1);
			cities.set(i, cities.get(i).replaceFirst(cities.get(i).substring(0, 1),cities.get(i).substring(cities.get(i).length()-1).toUpperCase()));
			cities.set(i, (cities.get(i).substring(0, cities.get(i).length()-1)+temp.toLowerCase()));
			i=i+2;
		}
		System.out.println(cities);		

//Revert strings of list or array
		i=0;		
		for (i=0; i<cities.size()-1; i++){
			String temp="";
			for (int j=cities.get(i).length()-1; j>=0; j--){				
				temp=temp+cities.get(i).charAt(j);				
			}
			cities.set(i, temp);
		}
		System.out.println(cities);	
	}
	
	public static int vowels (String city){
		int result=0;
		char vowels[] = { 'a', 'e', 'i', 'o', 'u'};
		
		for (int i=0; i<vowels.length; i++){
			for (int j=0; j < city.length(); j++){
				if (vowels[i]==city.charAt(j)){
					result=result+1;
				}
			}
		}			
		return result;
	}
	
	public static int consonants  (String city){
		int result=0;
		char consonants [] = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n','p',
				'g','r','s', 't','v','x','z'};
		
		for (int i=0; i<consonants .length; i++){
			for (int j=0; j < city.length(); j++){
				if (consonants [i]==city.charAt(j)){
					result=result+1;
				}
			}
		}			
		return result;
	}
}
