package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
    public void testThreeNumbers(){
    	assertEquals(6, StringCalculator.add("1,2,3"));
    }


}
