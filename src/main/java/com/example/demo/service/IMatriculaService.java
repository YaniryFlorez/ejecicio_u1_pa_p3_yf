package com.example.demo.service;

import com.example.demo.matriculacion.modelo.Matricula;

public interface IMatriculaService {
	
	//crud
public void matriculacion(String cedula, String placa); //claves principales de cada entidad
	
	public Matricula buscar(String propietario);
	
	public void actualizar(Matricula m);
	
	public void eliminar(String propietario);
	
}
