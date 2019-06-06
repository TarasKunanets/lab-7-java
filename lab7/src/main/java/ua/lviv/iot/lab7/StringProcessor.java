package ua.lviv.iot.lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringProcessor {

	public static void main(String[] args) {
		InputText text;
		try {
			text = new InputText(readInputText());
			text.countLoudLetters();
			text.showResults();
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
	
	public static String readInputText() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("Enter String: ");  	
		return br.readLine();
		
	}

}
