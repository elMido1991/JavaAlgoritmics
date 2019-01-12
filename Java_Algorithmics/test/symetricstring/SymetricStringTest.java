package symetricstring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class SymetricStringTest {

	@Test
	void testGetCharsFromString() {
		SymetricString sm = new SymetricString();
		List<Character> listChars = sm.getCharsFromString("{()[()]}");
		assertTrue(listChars.size()==8, "OK");
	}
	
	@Test
	void testGetCharsFromStringWithAlpha() {
		SymetricString sm = new SymetricString();
		List<Character> listChars = sm.getCharsFromString("A2{A2(A2)A2[A2(A2)A2]A2}A2");
		assertTrue(listChars.size()==8, "OK");
	}
	
	
	@Test
	void testTestSymetry() {
		SymetricString sm = new SymetricString();
		//"{()[()]}[({()[()]})({()[()]})({()[()]})]"
		boolean result = sm.testSymetry("{()[()]}");
		assertTrue(result, "OK");
	}
	
	@Test
	void testTestSymetryBis() {
		SymetricString sm = new SymetricString();
		boolean result = sm.testSymetry("{())[()]}");
		assertFalse(result, "OK");
	}

}
