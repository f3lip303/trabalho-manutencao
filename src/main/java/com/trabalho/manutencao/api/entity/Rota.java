package com.trabalho.manutencao.api.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "rota")
public class Rota implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3055046711718042703L;
	// Mapeando Banco De Dados
	@Id
	@Column(nullable = false)
	private String codrota;

	@Column(nullable = false)
	private String tempoDaRota;

	@Column(nullable = false)
	private Long capacidadeDaRota;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "codrota")
	@OrderBy("ordemnarotaupdated ASC")
	private List<Visita> visitas;

	public Rota() {

	}

	public String getCodrota() {
		return codrota;
	}

	public void setCodrota(String codrota) {
		this.codrota = codrota;
	}

	public String getTempoDaRota() {
		return tempoDaRota;
	}

	public void setTempoDaRota(String tempoDaRota) {
		this.tempoDaRota = tempoDaRota;
	}

	public Long getCapacidadeDaRota() {
		return capacidadeDaRota;
	}

	public void setCapacidadeDaRota(Long capacidadeDaRota) {
		this.capacidadeDaRota = capacidadeDaRota;
	}

	public List<Visita> getVisitas() {
		return visitas;
	}

	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}

}
