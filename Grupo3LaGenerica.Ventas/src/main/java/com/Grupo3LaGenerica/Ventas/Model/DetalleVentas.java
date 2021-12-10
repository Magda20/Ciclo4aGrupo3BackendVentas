package com.Grupo3LaGenerica.Ventas.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (value="Detalle_Ventas")
public class DetalleVentas {
	
	@Id
	private int codigo;
	
	private int cantidad;
			
	private float valorTotal;
	
	

	public DetalleVentas( int cantidad1, float valorTotal) {
		super();

		this.cantidad = cantidad1;
		this.valorTotal = valorTotal;
		
		
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public float getvalorTotal() {
		return valorTotal;
	}

	public void setCantidad(int cantidad1) {
		this.cantidad = cantidad1;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setvalorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public DetalleVentas() {
		super();
		// TODO Auto-generated constructor stub
	}

}
