package edu.ifpa.imc.modelo;

import org.springframework.stereotype.Component;

@Component
public class IMC {
	private float altura;
	private float peso;	
	private float imcCalculado;
	private String obs="";


	public IMC() {
		
	}
	public IMC(float altura, float peso) {	 
		calcularIMC (altura, peso);		
	}
	
	public void calcularIMC( float altura, float peso) {
		this.altura = altura;
		this.peso = peso;
		this.imcCalculado = peso / (altura * altura);
		defineFaixa();
	}
	
	private void defineFaixa() { 
		float imc = this.imcCalculado;		
		if (imc < 18.5)
			obs = "MAGREZA. Abaixo do peso ideal.";
		else if (imc < 25.0)
			obs = "NORMAL. Voce esta saudável e no peso ideal.";
		else if (imc < 30.0)
			obs = "SOBREPESO. Voce está com excesso de peso.";
		else if (imc < 35.0)
			obs = "OBESIDADE. Classe I.";
		else if (imc < 40.0)
			obs = "OBESIDADE. Classe II.";
		else // if (imc >= 40)
			obs = "OBESIDADE GRAVE. Classe III.";
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getImcCalculado() {
		return imcCalculado;
	}

	public void setImcCalculado(float imcCalculado) {
		this.imcCalculado = imcCalculado;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
