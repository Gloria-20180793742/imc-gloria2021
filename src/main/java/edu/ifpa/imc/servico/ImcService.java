package edu.ifpa.imc.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ifpa.imc.modelo.IMC;

@Service
public class ImcService {
    @Autowired
	private IMC  imc;
	
	public void calculaIMC(float altura, float peso) {
		imc.calcularIMC(altura, peso);
	}
	
}
