package com.informacion.practica.service;

import javax.el.PropertyNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informacion.practica.dao.InformacionDao;
import com.informacion.practica.dto.InformacionDto;


@Service
public class InformacionServiceImp implements InformacionService {

	@Autowired
	private InformacionDao  informacionDao;
	
	public InformacionDto getCliente(Integer numDoc,String tipoDoc) {
		
		InformacionDto cliente = new InformacionDto();
		String tipDocLocal=tipoDoc.toUpperCase();
		if(!tipDocLocal.equals("C") && !tipDocLocal.equals("P")) {
			throw new PropertyNotFoundException("El tipo de documento ingresado no es valido");
		}
		cliente=informacionDao.getCliente(numDoc, tipoDoc);
		
		/*if(cliente== null || cliente.getNumDocumento()!=23445322) {
			return cliente;
			//throw new PropertyNotFoundException("El tipo de documento ingresado no es valido");
		}*/
		return cliente;
	}
	
	
}
