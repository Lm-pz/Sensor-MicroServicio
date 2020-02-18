package com.example.SensorMicroservicio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Sensor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String numero_serie;

	@NotNull 
	private String fabricante;
	
	@NotNull 
	private Double temperatura_maxima;
	
	@NotNull 
	private Double temperatura_minima;
	
	@NotNull
	private Double area_medida;

	@NotNull 
	private Long camara_id;
	
	public Sensor() {
		
	}

	public String getNumero_serie() {
		return numero_serie;
	}

	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Double getTemperatura_maxima() {
		return temperatura_maxima;
	}

	public void setTemperatura_maxima(Double temperatura_maxima) {
		this.temperatura_maxima = temperatura_maxima;
	}

	public Double getTemperatura_minima() {
		return temperatura_minima;
	}

	public void setTemperatura_minima(Double temperatura_minima) {
		this.temperatura_minima = temperatura_minima;
	}

	public Double getArea_medida() {
		return area_medida;
	}

	public void setArea_medida(Double area_medida) {
		this.area_medida = area_medida;
	}

	public Long getCamara_id() {
		return camara_id;
	}

	public void setCamara_id(Long camara_id) {
		this.camara_id = camara_id;
	}

}
