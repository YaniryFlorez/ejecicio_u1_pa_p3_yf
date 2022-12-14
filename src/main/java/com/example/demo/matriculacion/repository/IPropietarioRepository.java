package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {
	 public Propietario buscarPropietario(String cedula);

		// CRUD
		public Propietario buscar(String cedula);

		//
		public void actualizar(String cedula);

		public void insertar(String cedula);

		public void borrar(String cedula); //Recibe el id del objeto borrar
}
