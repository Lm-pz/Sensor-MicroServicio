package com.example.SensorMicroservicio.mapper;

import org.springframework.stereotype.Component;

import com.example.SensorMicroservicio.dto.SensorDTO;
import com.example.SensorMicroservicio.model.Sensor;

@Component
public class Mapper {

	public Sensor SensorDTOtoentity(SensorDTO sensor) {
		Sensor s= new Sensor();
		s.setNumero_serie(sensor.getNumero_serie());
		s.setArea_medida(sensor.getArea_medida());
		s.setCamara_id(sensor.getCamara_id());
		s.setTemperatura_actual(sensor.getTemperatura_actual());
		s.setTemperatura_maxima(sensor.getTemperatura_maxima());
		s.setTemperatura_minima(sensor.getTemperatura_minima());
		s.setFabricante(sensor.getFabricante());
		return s;
	}
	
	
	public  SensorDTO SensorEntitytoDTO(Sensor s) {
		SensorDTO sensor=new SensorDTO(s.getNumero_serie(),s.getFabricante(),s.getTemperatura_maxima(),
				s.getTemperatura_minima(),s.getTemperatura_actual(),s.getArea_medida(),
				s.getCamara_id());
		return sensor;
	}
}
