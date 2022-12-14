package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.repository.IMatriculaRepository;
import com.example.demo.matriculacion.repository.IPropietarioRepository;
import com.example.demo.matriculacion.repository.IVehiculoRepository;

public class MatriculaServiceImpl implements IMatriculaService{
	
	private IMatriculaRepository imatriculaReposytory;
	private IPropietarioRepository propietarioReposytory;
	private IVehiculoRepository vehiculoReposytory;
	
	
	private static List<Matricula> base = new ArrayList();

	@Override
	public void matriculacion(String cedula, String placa) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public Matricula buscar(String propietario) {
		// TODO Auto-generated method stub
		
		return null;
		
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void eliminar(String propietario) {
		// TODO Auto-generated method stub
		
	}

	
}
