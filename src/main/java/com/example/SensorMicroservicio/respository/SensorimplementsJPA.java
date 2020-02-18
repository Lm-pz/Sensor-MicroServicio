package com.example.SensorMicroservicio.respository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SensorMicroservicio.dto.SensorDTO;
import com.example.SensorMicroservicio.mapper.Mapper;
import com.example.SensorMicroservicio.model.Sensor;

@Component
public class SensorimplementsJPA implements IServiciosRepository{
	@Autowired
	private Mapper m;
	@Autowired
	private SensorRepository cs;
	
	@Override
	public List<SensorDTO> findAllSensores() {
		List<SensorDTO> sensoresDto = new ArrayList<> ();
		List<Sensor> sens =  cs.findAll();
		for(Sensor s:sens) {
		sensoresDto.add(
			m.SensorEntitytoDTO(s));
		}
		return sensoresDto;
	}

	@Override
	public SensorDTO addSensor(SensorDTO sensor) {
		Sensor s= m.SensorDTOtoentity(sensor);
		Sensor aux=cs.save(s);
		return m.SensorEntitytoDTO(aux);
	}

	
	public boolean existeEntidad(String id) {
		return cs.existsById(id);
	}

	@Override
	public int deleteSensor(String id){
		cs.deleteById(id);
		return 1;
	}

	@Override
	public int updateSensor(SensorDTO sensor) {
		Sensor s= m.SensorDTOtoentity(sensor);
		cs.save(s);		
		return 1;
	}

	@Override
	public SensorDTO findSensor(String id) {
		Sensor s= cs.findById(id).get();
		return m.SensorEntitytoDTO(s);
	}
}
