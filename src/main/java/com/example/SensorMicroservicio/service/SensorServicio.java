package com.example.SensorMicroservicio.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SensorMicroservicio.dto.SensorDTO;
import com.example.SensorMicroservicio.respository.IServiciosRepository;

@Service
public class SensorServicio implements 	ISensorServicio {
	@Autowired
	IServiciosRepository repo;
	
	public ArrayList<SensorDTO> obtenerTodos() {
		return (ArrayList<SensorDTO>)repo.findAllSensores();
	}
	

	@Override
	public SensorDTO altaSensor(SensorDTO sensor) {
		SensorDTO s=null;
		if(!repo.existeEntidad(sensor.getNumero_serie()))
			s=repo.addSensor(sensor);
		return s;
	}


	@Override
	public int deleteSensor(String id) {
		int exito=0;
		if(repo.existeEntidad(id))
			exito=repo.deleteSensor(id);
		return exito;
	}


	@Override
	public int updateSensor(SensorDTO sensor) {
		int exito=0;
		if(repo.existeEntidad(sensor.getNumero_serie()))
			exito=repo.updateSensor(sensor);	
		return exito;
	}
	
	@Override
	public	SensorDTO findSensor(String id) {
		SensorDTO sen=null;
		if(repo.existeEntidad(id))
		sen=repo.findSensor(id);
		return sen;
	}
}
