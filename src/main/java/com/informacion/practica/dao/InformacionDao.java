package com.informacion.practica.dao;

import org.springframework.stereotype.Repository;

import com.informacion.practica.dto.InformacionDto;

@Repository
public class InformacionDao {


	public InformacionDto getCliente(Integer numDoc,String tipoDoc) {
		InformacionDto informacionDto = new InformacionDto();
		String tipDocLocal=tipoDoc.toUpperCase();
		if(numDoc==23445322 && tipDocLocal.equals("C")) {
			informacionDto.setNumDocumento(23445322);
			informacionDto.setTipoDoc("C");
			informacionDto.setPrimerNombre("Luis");
			informacionDto.setSegundoNombre("Alberto");
			informacionDto.setPrimerApellido("Muñoz");
			informacionDto.setSegundoApellido("Garzon");
			informacionDto.setTelefono("888-2599999");
			informacionDto.setDireccion("Calle 123 #456Norte");
			informacionDto.setCiudadResidencia("POPAYAN");
		}else {
			return informacionDto ;
		}
		return informacionDto ;
	
	}
}
