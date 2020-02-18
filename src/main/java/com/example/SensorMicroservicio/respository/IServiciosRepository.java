package com.example.SensorMicroservicio.respository;

import java.util.List;
import com.example.SensorMicroservicio.dto.SensorDTO;

public interface IServiciosRepository {

	List<SensorDTO> findAllSensores();

	SensorDTO addSensor(SensorDTO sensor);

	int deleteSensor(String id);

	int updateSensor(SensorDTO sensor);

	SensorDTO findSensor(String id);
	
	boolean existeEntidad(String id);

}
