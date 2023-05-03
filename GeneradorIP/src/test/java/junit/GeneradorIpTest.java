package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {

GeneradorIp generadorIp;
	
	@BeforeEach
	void setUp() {
		generadorIp = new GeneradorIp();
	}
	
	@RepeatedTest(1000)
	void testGenerarNumero() {
			int numAleatorio = generadorIp.generarNumero(0, 254);
			assertTrue(numAleatorio >= 0 && numAleatorio <= 254);	
	}
	
	@Test 
	void testGenerarIp() {
		String ip = generadorIp.generarIp();
		assertTrue(!ip.startsWith("0.") && !ip.endsWith(".0"));
	}

}
