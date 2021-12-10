package com.Grupo3LaGenerica.Ventas.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grupo3LaGenerica.Ventas.Model.Ventas;
import com.Grupo3LaGenerica.Ventas.Model.VentasTotal;
import com.Grupo3LaGenerica.Ventas.Repository.VentasRepository;

@RestController
@RequestMapping ("/ventas")
@CrossOrigin(origins = "http://localhost:3000")
public class VentasApi {
	@Autowired
	private VentasRepository ventasRepository;
	
	@PostMapping ("/agregar/venta")	
	public void agregarVenta (@RequestBody Ventas venta) {
		ventasRepository.save(venta);
	}
	
	@GetMapping ("/listar")
	public List<Ventas> findAll(){
		return ventasRepository.findAll();
		
	}
	
	@GetMapping ("/listarCedula")
	public ArrayList<VentasTotal> findAllId(){
		HashMap<Integer, VentasTotal> totales = new HashMap<Integer, VentasTotal>();
		List<Ventas> list = ventasRepository.findAll();
		for (Ventas venta:list) {
			if(totales.containsKey(venta.getCedula())) {
				VentasTotal ventaTotal =  totales.get(venta.getCedula());
				ventaTotal.setTotalVentas(ventaTotal.getTotalVentas() + (double) venta.getValor_venta());						
				totales.put(venta.getCedula(), ventaTotal);
			}
			else {
				totales.put(venta.getCedula(), new VentasTotal(venta.getCedula(), (double) venta.getValor_venta()));
			}
		}
		ArrayList<VentasTotal> lista = new ArrayList<VentasTotal>();
		lista.addAll(totales.values());
		return lista;
	}
	
	
	@GetMapping ("/total")
	public double  getTotal() {
		double suma = 0;
		List<Ventas> list = ventasRepository.findAll();
		for (Ventas venta:list) {
			suma += (double) venta.getValor_venta();
		}
		return suma;
	}
}
