package com.example.SensorMicroservicio.service;

import java.util.ArrayList;
import com.example.SensorMicroservicio.dto.SensorDTO;

public interface ISensorServicio {
	
	 ArrayList<SensorDTO> obtenerTodos();

	SensorDTO altaSensor(SensorDTO sensor);

	int deleteSensor(String id);

	int updateSensor(SensorDTO sensor);

	SensorDTO findSensor(String id);
	
	int NSensoresenCamara(long id);
	
	ArrayList<SensorDTO> obtenerSensoresCamara(long id);
	 
}
