package com.example.demo.service;

import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {
    //crud
	public void insertar(Vehiculo v);
	
	public Vehiculo buscar(String nombre);
	
	public void actualizar(Vehiculo v);
	
	public void eliminar(String nombre);
	
}
