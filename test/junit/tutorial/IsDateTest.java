package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class IsDateTest {

	@Test
	public void test() {
		IsDate isdate = new IsDate(2011,2,10);
		assertThat(new Date(), is(new IsDate(2011,2,10)));
	}

}
