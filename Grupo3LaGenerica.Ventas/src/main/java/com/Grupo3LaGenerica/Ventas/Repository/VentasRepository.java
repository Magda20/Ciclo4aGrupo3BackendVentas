package com.Grupo3LaGenerica.Ventas.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Grupo3LaGenerica.Ventas.Model.Ventas;

@Repository
public interface VentasRepository extends MongoRepository <Ventas, Integer> {

} 
