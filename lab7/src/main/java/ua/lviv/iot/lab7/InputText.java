package ua.lviv.iot.lab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputText {
	public String inputText;
	public int loundes = 0;

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public InputText(String inputText) {
		this.inputText = inputText;
	}
	
	public int countLoudLetters () {
		loundes = 0;
		
//		for (char c : inputText.toCharArray()) {
//			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//				loundes++;
//			}
//			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//				loundes++;
//			}
//		}
		
	    Pattern p = Pattern.compile("(a)|(e)|(i)|(o)|(u)|(A)|(E)|(I)|(O)|(U)");
	    Matcher m = p.matcher(inputText);
	    while (m.find()) {
		    loundes++;
	}
		return loundes; 
	}
	
	public void showResults() {
		System.out.println("Number of loundes: "+loundes);
	}
	
}
