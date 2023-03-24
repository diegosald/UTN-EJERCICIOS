package clase5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DescuentoPorcTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
         
		Descuento desc = new DescuentoPorc();
		double resultado;
		double esperado;
		esperado = 90;
		desc.setValorDesc(10);
		resultado = desc.valorFinal(100);
		
		assertEquals(resultado,esperado,0);
	}

}
