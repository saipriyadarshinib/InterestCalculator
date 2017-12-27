import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBAccountTest {
SBAccount s=new SBAccount(10000,"Normal");
	@Test
	void testCalculateInterest() {
		assertEquals(400.0,s.calculateInterest());
	}

}
