package com.informacion.practica.service;

import com.informacion.practica.dto.InformacionDto;

public interface InformacionService {

	InformacionDto getCliente(Integer numDoc, String tipoDoc);

}
