package com.krakedev.artesanal.testJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.krakedev.antesanal.Maquina;

public class TestLlenarJUnit {
	
	@Test
	public void testllenarMaquina() {
		Maquina rubia = new Maquina("Pilsener ", "Cerveza ", 0.02, 8000);
		rubia.llenarMaquina();
		
		assertEquals(7800,rubia.getCantidadActual(), 0.0001);
	}
}
	
