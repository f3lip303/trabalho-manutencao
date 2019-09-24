package com.trabalho.manutencao.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "visita")
public class Visita implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 560701365606288572L;

	@Id
	private Long id;

	@Column(nullable = false)
	private String codrota;

	@Column(nullable = false)
	private Double ptx;
	@Column(nullable = false)
	private Double pty;

	private Double distaproxvisitaplan;
	private Integer ordemnarotaplan;
	private Double tpinicioatendimentoplan;
	private Double tpfimatendimentoplan;
	private Double distaproxvisitaupdated;
	private Integer ordemnarotaupdated;
	private Double tpinicioatendimentoupdated;
	private Double tpfimatendimentoupdated;
	private Double distaproxvisitaexec;
	private Integer ordemnarotaexec;
	private Double tpinicioatendimentoexec;
	private Double tpfimatendimentoexec;
	private String segmentos;
	private Double janeladeatendimentoini;
	private Double janeladeatendimentofim;

	public Visita() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodrota() {
		return codrota;
	}

	public void setCodrota(String codrota) {
		this.codrota = codrota;
	}

	public Double getPtx() {
		return ptx;
	}

	public void setPtx(Double ptx) {
		this.ptx = ptx;
	}

	public Double getPty() {
		return pty;
	}

	public void setPty(Double pty) {
		this.pty = pty;
	}

	public Double getDistaproxvisitaplan() {
		return distaproxvisitaplan;
	}

	public void setDistaproxvisitaplan(Double distaproxvisitaplan) {
		this.distaproxvisitaplan = distaproxvisitaplan;
	}

	public Integer getOrdemnarotaplan() {
		return ordemnarotaplan;
	}

	public void setOrdemnarotaplan(Integer ordemnarotaplan) {
		this.ordemnarotaplan = ordemnarotaplan;
	}

	public Double getTpinicioatendimentoplan() {
		return tpinicioatendimentoplan;
	}

	public void setTpinicioatendimentoplan(Double tpinicioatendimentoplan) {
		this.tpinicioatendimentoplan = tpinicioatendimentoplan;
	}

	public Double getTpfimatendimentoplan() {
		return tpfimatendimentoplan;
	}

	public void setTpfimatendimentoplan(Double tpfimatendimentoplan) {
		this.tpfimatendimentoplan = tpfimatendimentoplan;
	}

	public Double getDistaproxvisitaupdated() {
		return distaproxvisitaupdated;
	}

	public void setDistaproxvisitaupdated(Double distaproxvisitaupdated) {
		this.distaproxvisitaupdated = distaproxvisitaupdated;
	}

	public Integer getOrdemnarotaupdated() {
		return ordemnarotaupdated;
	}

	public void setOrdemnarotaupdated(Integer ordemnarotaupdated) {
		this.ordemnarotaupdated = ordemnarotaupdated;
	}

	public Double getTpinicioatendimentoupdated() {
		return tpinicioatendimentoupdated;
	}

	public void setTpinicioatendimentoupdated(Double tpinicioatendimentoupdated) {
		this.tpinicioatendimentoupdated = tpinicioatendimentoupdated;
	}

	public Double getTpfimatendimentoupdated() {
		return tpfimatendimentoupdated;
	}

	public void setTpfimatendimentoupdated(Double tpfimatendimentoupdated) {
		this.tpfimatendimentoupdated = tpfimatendimentoupdated;
	}

	public Double getDistaproxvisitaexec() {
		return distaproxvisitaexec;
	}

	public void setDistaproxvisitaexec(Double distaproxvisitaexec) {
		this.distaproxvisitaexec = distaproxvisitaexec;
	}

	public Integer getOrdemnarotaexec() {
		return ordemnarotaexec;
	}

	public void setOrdemnarotaexec(Integer ordemnarotaexec) {
		this.ordemnarotaexec = ordemnarotaexec;
	}

	public Double getTpinicioatendimentoexec() {
		return tpinicioatendimentoexec;
	}

	public void setTpinicioatendimentoexec(Double tpinicioatendimentoexec) {
		this.tpinicioatendimentoexec = tpinicioatendimentoexec;
	}

	public Double getTpfimatendimentoexec() {
		return tpfimatendimentoexec;
	}

	public void setTpfimatendimentoexec(Double tpfimatendimentoexec) {
		this.tpfimatendimentoexec = tpfimatendimentoexec;
	}

	public String getSegmentos() {
		return segmentos;
	}

	public void setSegmentos(String segmentos) {
		this.segmentos = segmentos;
	}

	public Double getJaneladeatendimentoini() {
		return janeladeatendimentoini;
	}

	public void setJaneladeatendimentoini(Double janeladeatendimentoini) {
		this.janeladeatendimentoini = janeladeatendimentoini;
	}

	public Double getJaneladeatendimentofim() {
		return janeladeatendimentofim;
	}

	public void setJaneladeatendimentofim(Double janeladeatendimentofim) {
		this.janeladeatendimentofim = janeladeatendimentofim;
	}

}
