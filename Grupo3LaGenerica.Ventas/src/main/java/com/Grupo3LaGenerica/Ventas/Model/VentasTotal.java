package com.Grupo3LaGenerica.Ventas.Model;

public class VentasTotal {
	private long cedula;
	private double totalVentas;
	
	
	
	public VentasTotal(long cedula, double totalVentas) {
		this.cedula = cedula;
		this.totalVentas = totalVentas;
	}
	public long getCedula() {
		return cedula;
	}
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	public double getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	
}
