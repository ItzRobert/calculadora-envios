package com.empresa.envios.model;

public class EnvioForm {
private Double peso;
private String pais;
private Double costo;
private String error;

public Double getPeso() {
	return peso;
}

public void setPeso(Double peso) {
	this.peso=peso;
}

public String getPais() {
	return pais;
}

public void setPais(String pais) {
	this.pais = pais;
}

public Double getCosto() {
	return costo;
}

public void setCosto(Double costo) {
	this.costo = costo;
}

public String getError() {
	return error;
}

public void setError(String error) {
	this.error = error;
}


}
