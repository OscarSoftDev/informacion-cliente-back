package com.informacion.practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.informacion.practica.dto.InformacionDto;
import com.informacion.practica.service.InformacionService;



@RestController
public class InformacionController {

	@Autowired
	private InformacionService informacionService;
	
	@GetMapping("/informacion/{numDoc}/{tipoDoc}")
	@CrossOrigin(origins = "*")
	public ResponseEntity<?> getInformacion(@PathVariable Integer numDoc,@PathVariable String tipoDoc){
		ResponseEntity<?> response;
		InformacionDto result = new InformacionDto();
		try {
			 result= informacionService.getCliente(numDoc,tipoDoc);
			 if(result.getNumDocumento()==null) {
				 response= new ResponseEntity<>(HttpStatus.NOT_FOUND);
			 }else {
				 response= new ResponseEntity<>(result,HttpStatus.OK);
			 }
		} catch (Exception e) {
			response= new ResponseEntity<>(e.getLocalizedMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
	
	
}
