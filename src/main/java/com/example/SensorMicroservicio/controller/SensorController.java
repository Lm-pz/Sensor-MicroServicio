package com.example.SensorMicroservicio.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SensorMicroservicio.dto.SensorDTO;
import com.example.SensorMicroservicio.service.ISensorServicio;

@RequestMapping("sensor")
@RestController
public class SensorController {
	@Autowired
	private ISensorServicio sensorServicio;
	
	@GetMapping("/listaSensores")
	public ArrayList<SensorDTO> listaTodos (){
		return sensorServicio.obtenerTodos();
	}
	
	@PostMapping ("/altaSensor")
	public SensorDTO altaSensor ( @RequestBody SensorDTO sen ) {
		
		return sensorServicio.altaSensor(sen);
	}
	
	@DeleteMapping("/eliminarSensor/{id}")
	public int eliminarSensor ( @PathVariable String id  ) {
		
		return sensorServicio.deleteSensor(id);
		
	}
	
	@PutMapping("/modificarSensor")
	public int modificarSensor ( @RequestBody SensorDTO sen ) {
		
		return sensorServicio.updateSensor(sen);
		
	}
	
	@GetMapping("/findSensor/{id}")
	public SensorDTO findSensor ( @PathVariable String id ){
		return sensorServicio.findSensor(id);
	}
}
