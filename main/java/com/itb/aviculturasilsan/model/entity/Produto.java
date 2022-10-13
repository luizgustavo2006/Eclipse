package com.itb.aviculturasilsan.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;  
	private String miniDescricao;
	private String descricao;
	private double preco;  
	private byte[] foto;
	private String tamanho; 
	private String statusProduto;
	private String infoNutricional;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMiniDescricao() {
		return miniDescricao;
	}
	public void setMiniDescricao(String miniDescricao) {
		this.miniDescricao = miniDescricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getStatusProduto() {
		return statusProduto;
	}
	public void setStatusProduto(String statusProduto) {
		this.statusProduto = statusProduto;
	}
	public String getInfoNutricional() {
		return infoNutricional;
	}
	public void setInfoNutricional(String infoNutricional) {
		this.infoNutricional = infoNutricional;
	}
	
	
	
	

}
