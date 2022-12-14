package com.example.demo.service;

import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropietarioService {
	//crud
	public void insertar(Propietario p);
	
	public Propietario buscar(String nombre);
	
	public void actualizar(Propietario p);
	
	public void eliminar(String nombre);
}
