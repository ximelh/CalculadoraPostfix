/******************************************************************
 Ultima modificacion: 30/01/2022

 Clase para probar la calculadora
 @file CalculadoraGrupo10Test.java

 ******************************************************************/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraGrupo10Test {
	
	/**
	 * Evalua el metodo de calculate
	 */
	@Test
	void testCalculate() {
		CalculadoraGrupo10 calculadora = new CalculadoraGrupo10();
		assertEquals(15,calculadora.calculate("1 2 + 4 * 3 +"),0.001,"Error en Calculate");
		assertEquals(30,calculadora.calculate("6 2 3 + *"),0.001,"Error en Calculate");
		assertEquals(11,calculadora.calculate("10 3 5 + - 2 + 3 * 4 5 - +"),0.001,"Error en Calculate");
	}

}
