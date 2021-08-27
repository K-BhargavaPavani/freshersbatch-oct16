import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNIT3Test {

	@Test
	void test() {
		JUNIT3 ob= new JUNIT3(15000);
		assertThrows(InsufficientFundsException.class, () -> ob.withdraw(20000));
	}

}