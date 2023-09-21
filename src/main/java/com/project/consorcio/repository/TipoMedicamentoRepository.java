package com.project.consorcio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.consorcio.entity.TipoMedicamento;

public interface TipoMedicamentoRepository 
		extends JpaRepository<TipoMedicamento, Integer>{

}
