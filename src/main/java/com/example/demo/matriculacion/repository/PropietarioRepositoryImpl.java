package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Propietario;


public class PropietarioRepositoryImpl implements IPropietarioRepository{
	
	private static List<Propietario> base = new ArrayList();

	@Override
	public Propietario buscarPropietario(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario=null;
		for (Propietario p : base) {
			if (p.getCedula().equals(cedula)) {
				propietario = p;
			}
		}

		return propietario;
	}

	@Override
	public Propietario buscar(String cedula) {
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
