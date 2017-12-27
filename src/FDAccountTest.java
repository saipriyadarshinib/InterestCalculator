import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FDAccountTest {
FDAccount f=new FDAccount(10000,91,65);
	@Test
	void testCalculateInterest() {
		assertEquals(800,f.calculateInterest());
	}

}
