package com.example.SensorMicroservicio.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.SensorMicroservicio.model.Sensor;

public interface SensorRepository extends JpaRepository <Sensor, String> {

	@Query("select count(*) from Sensor s where s.camara_id = :id")
	int getNSensoresenCamara (@Param("id") Long id);
	
	@Query("From Sensor s where s.camara_id = :id")
	List<Sensor> getSensoresCamara (@Param("id") Long id);
}
