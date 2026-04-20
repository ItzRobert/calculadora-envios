package com.empresa.envios.controller;

import com.empresa.envios.model.EnvioForm;
import com.empresa.envios.service.TarifaEnvioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EnvioController {
		
	
	private final TarifaEnvioService service;
	
	public EnvioController(TarifaEnvioService service) {
		this.service= service;
	}
	   @GetMapping("/envio")
	   public String mostrarFormulario(Model model) {
		   model.addAttribute("envioForm", new EnvioForm());
		   return "envio";
	   }
	   @PostMapping("/envio/calcular")
	   public String calcular(EnvioForm form, Model model) {
		   try {
			   service.validarDatos(form.getPeso(), form.getPais());
			   
			   double costo = service.calcularCosto(form.getPeso(), form.getPais()
					   );
			   form.setCosto(costo);
			   form.setError(null);
				   
		   } catch(IllegalArgumentException e) {
			   form.setError(e.getMessage());
			   form.setCosto(null);
			 
		   }
		   model.addAttribute("EnvioForm", form);
		   return "envio";
	   }
	
}
