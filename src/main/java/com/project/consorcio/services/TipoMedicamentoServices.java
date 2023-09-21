package com.project.consorcio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.consorcio.entity.TipoMedicamento;
import com.project.consorcio.repository.TipoMedicamentoRepository;

@Service
public class TipoMedicamentoServices {
	@Autowired
	private TipoMedicamentoRepository repo;
	
	public List<TipoMedicamento> listarTodos(){
		return repo.findAll();
	}
	
}
