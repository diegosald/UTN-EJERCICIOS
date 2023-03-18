package clase6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

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
	public void test1() {
		//El resultado de multiplicar 80 por 3 da 240.
		Calculadora c1 = new Calculadora();	
		double resultado;
		double esperado = 240;
		
		resultado = c1.multiplicar(80,3);
	    
		
		assertEquals(resultado, esperado,0);
	
	}
	
	
	@Test
	public void test2() {
		//El resultado de sumar 150 y 180, dividido por 3, da 110.
		Calculadora c1 = new Calculadora();
		double resultado;
		double esperado = 110;
	   
		resultado = c1.dividir(c1.sumar(180, 150),3);
	
		assertEquals(resultado,esperado,0);
	
	
	}

	@Test
	public void test3() {
		//El resultado de restar 90 y 50, multiplicado por 15, no da 605
		Calculadora c1 = new Calculadora();
		double resultado;
		double noesperado = 605;
	    
		resultado = c1.dividir(c1.restar(90, 50),15);
	
	    assertNotEquals(noesperado,resultado);
	
	}

	
	@Test
	public void test4() {
	//El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
		Calculadora c1 = new Calculadora();
		double resultado;
		double noesperado = 2700;	
		
		resultado = c1.multiplicar(c1.sumar(70,40), 25);
		
		assertNotEquals(noesperado,resultado);
		
	}

}
