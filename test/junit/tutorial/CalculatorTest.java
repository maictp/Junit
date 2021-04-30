package junit.tutorial;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multi3x4() {
		Calculator cal = new Calculator();
		int expected = 15;
		int actual = cal.multi(3,4);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void multi5x7() {
		Calculator cal = new Calculator();
		int expected = 35;
		int actual = cal.multi(5,7);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void divide(){
		Calculator cal = new Calculator();
		float expected = 1.5f;
		float actual = cal.divide(3,2);
		
		assertThat(actual, is(expected));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void divideBy0(){
		Calculator cal = new Calculator();
		cal.divide(3,0);		
	}
	
	@Test
	public void testEqual() {
		List<String>  strs = new ArrayList<String>();
		strs.add("aaa");
		assertThat(strs, hasItems("aaa"));
	}


}
