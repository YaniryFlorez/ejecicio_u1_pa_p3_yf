package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.matriculacion.modelo.Matricula;

public class MatriculaRepositoryImpl implements IMatriculaRepository{
	
	private static List<Matricula> base = new ArrayList();
	
	@Override
	public Matricula buscarPorNumero(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula=null;
		for (Matricula m : base) {
			if (m.getCedula().equals(cedula)) {
				matricula = m;
			}
		}

		return matricula;
	}

	@Override
	public Matricula buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(String cedula) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void insertar(String cedula) {
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		
	}
	

}
