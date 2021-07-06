package edu.ifpa.imc.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ifpa.imc.modelo.IMC;
import edu.ifpa.imc.servico.ImcService;

@RestController
public class ImcController {
 
	@Autowired
	private ImcService imcService;


	@Autowired
	private IMC imc ;
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "<h1> Hello World! De novo e de novo </h1>"
      		+ "  <p> Alô, meu nome é Glória Feitosa</p>"
      		+ " <hr>  Esta é a atividade final "
      		+ "  ESTÁ TUDO FUNCIONANDO.....";
    }
	
	@RequestMapping(value = "/imc", method = RequestMethod.GET)
	@ResponseBody
	public String calculaIMC() {
		imcService.calculaIMC(1.75f, 105f);
	    return imc.getObs();
	}
	
	@RequestMapping(value = "/imc/altura/{altura}/peso/{peso}", method = RequestMethod.GET)
	@ResponseBody
	public IMC calculaIMCobj(@PathVariable(name="altura") String altura,
			@PathVariable(name="peso") String peso ) {
		float alturaF = Float.parseFloat(altura);
		float pesoF = Float.parseFloat(peso);
		
		imcService.calculaIMC(alturaF, pesoF);
	    return imc;
	}

}
