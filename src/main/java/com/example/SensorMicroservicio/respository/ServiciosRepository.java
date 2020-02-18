package com.example.SensorMicroservicio.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SensorMicroservicio.model.Sensor;

public interface ServiciosRepository extends JpaRepository <Sensor, Long> {

}
