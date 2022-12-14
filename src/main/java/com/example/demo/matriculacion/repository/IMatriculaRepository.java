package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Matricula;

public interface IMatriculaRepository {

    public Matricula buscarPorNumero(String cedula, String placa);

	// CRUD
	public Matricula buscar(String cedula);

	//
	public void actualizar(String cedula);

	public void insertar(String cedula);

	public void borrar(String cedula); //Recibe el id del objeto borrar


}
