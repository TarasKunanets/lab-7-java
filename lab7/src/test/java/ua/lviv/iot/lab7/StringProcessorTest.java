package ua.lviv.iot.lab7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab7.InputText;

class StringProcessorTest {

	@Test
	void testCountLoudLetters() {
		InputText text = new InputText("The String class represents character strings.");
		Assertions.assertEquals(10,text.countLoudLetters());
		
		text.setInputText("New text");
		Assertions.assertEquals(2,text.countLoudLetters());
		
		text.setInputText(" ");
		Assertions.assertEquals(0,text.countLoudLetters());
		
		Assertions.assertEquals(" ",text.getInputText());
	}
}
