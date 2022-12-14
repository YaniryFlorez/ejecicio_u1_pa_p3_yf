package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoRepository {

	 public Vehiculo buscarPorPlaca(String placa);

		// CRUD
		public Vehiculo buscar(String placa);

		//
		public void actualizar(String placa);

		public void insertar(String placa);

		public void borrar(String placa); //Recibe el id del objeto borrar
}
