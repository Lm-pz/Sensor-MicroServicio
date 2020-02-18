package com.example.SensorMicroservicio.respository;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.SensorMicroservicio.mapper.Mapper;

public class SensorimplementsJPA implements IServiciosRepository{
	@Autowired
	private Mapper m;
	@Autowired
	private ClassLoaderRepository cr;
}
