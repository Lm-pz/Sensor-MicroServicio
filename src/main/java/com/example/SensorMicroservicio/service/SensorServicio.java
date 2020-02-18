package com.example.SensorMicroservicio.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.SensorMicroservicio.respository.IServiciosRepository;

public class SensorServicio implements 	ISensorServicio {
	@Autowired
	IServiciosRepository repo;
}
