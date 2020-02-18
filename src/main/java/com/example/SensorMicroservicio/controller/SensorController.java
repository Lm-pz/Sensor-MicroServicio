package com.example.SensorMicroservicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SensorMicroservicio.service.ISensorServicio;

@RequestMapping("sensor")
@RestController
public class SensorController {
	@Autowired
	private ISensorServicio sensorServicio;
}
