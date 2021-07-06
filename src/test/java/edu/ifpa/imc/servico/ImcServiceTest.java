package edu.ifpa.imc.servico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ifpa.imc.modelo.IMC;

@SpringBootTest
class ImcServiceTest {

	@Autowired
	private ImcService imcService;
	
	@Autowired
	private IMC  imc;
	
	@Test
	void testCalculaIMC() {
		imcService.calculaIMC(1.70f,101f);
		 
		assertEquals(34.948097F,  imc.getImcCalculado() );
	}

}
