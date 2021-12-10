package com.Grupo3LaGenerica.Ventas.Model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (value= "db_ventas")
public class Ventas implements Comparable<Ventas> {

	
	@Id
	private int codigo_venta;
	private int cedula;
	private ArrayList<DetalleVentas> detalleVentas;
	private Number iva_venta;
	private Number total_venta;
	private Number valor_venta;
	 
	public int getCedula() {
		return cedula;
	}
	public int getCodigo_venta() {
		return codigo_venta;
	}
	public ArrayList<DetalleVentas> getDetalleVentas() {
		return detalleVentas;
	}
	public Number getIva_venta() {
		return iva_venta;
	}
	public Number getTotal_venta() {
		return total_venta;
	}
	public Number getValor_venta() {
		return valor_venta;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public void setDetalleVentas(ArrayList<DetalleVentas> detalleVentas) {
		this.detalleVentas = detalleVentas;
	}
	public void setIva_venta(double iva_venta) {
		this.iva_venta = (Number) iva_venta;
	}
	public void setTotal_venta(double total_venta) {
		this.total_venta = (Number) total_venta;
	}
	public void setValor_venta(double valor_venta) {
		this.valor_venta = (Number) valor_venta;
	}
	
	@Override
	public int compareTo(Ventas v) {
		if( this.cedula > v.cedula) {
			return 1;
		}else if (this.cedula < v.cedula) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
