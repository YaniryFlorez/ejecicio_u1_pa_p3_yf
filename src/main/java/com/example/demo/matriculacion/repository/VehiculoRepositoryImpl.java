package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.matriculacion.modelo.Vehiculo;

public class VehiculoRepositoryImpl implements IVehiculoRepository{
	
	private static List<Vehiculo> base = new ArrayList();

	@Override
	public Vehiculo buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=null;
		for (Vehiculo v : base) {
			if (v.getPlaca().equals(placa)) {
				vehiculo = v;
			}
		}

		return vehiculo;
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		
	}

}
