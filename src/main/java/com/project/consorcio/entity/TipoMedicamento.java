package com.project.consorcio.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_tipo_medicamento")
public class TipoMedicamento {
	@Id
	@Column(name="cod_tipo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	@Column(name="nom_tipo")
	private String nombre;
	
	//anotaciòn para anular JSON
	@JsonIgnore
	//relaciòn uno a muchos
	@OneToMany(mappedBy = "tipo")//ASOC
	private List<Medicamento> listaTipoMedicamento;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Medicamento> getListaTipoMedicamento() {
		return listaTipoMedicamento;
	}

	public void setListaTipoMedicamento(List<Medicamento> listaTipoMedicamento) {
		this.listaTipoMedicamento = listaTipoMedicamento;
	}
}



