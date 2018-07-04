package Model;

import dao.HDAO;
import dao.IDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@id_produto
    	@GeneratedValue
	private String id_produto;
	private String nome;
	private float valorDeReferencia;
	private float valorDeVenda;
	private Integer qtdeEmEstoque;

	public Produto(String nome, Float valorDeReferencia, Float valorDeVenda, Integer qtdeEmEstoque){
		
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	 
	public String getCodigo() {
		return this.codigo;
	}
	 
	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	public String getNome() {
		return this.nome;
	}
	 
	public void setValorDeReferencia(float valorDeReferencia) {
		this.valorDeReferencia = valorDeReferencia;
	}
	 
	public float getValorDeReferencia() {
		return this.valorDeReferencia;
	}
	 
	public void setValorDeVenda(float valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}
	 
	public float getValorDeVenda() {
		return this.valorDeVenda;
	}
	
	public void setQtdeEmEstoque(int qtdeEmEstoque) {
	 	this.qtdeEmEstoque = qtdeEmEstoque;
	}
	 
	public int getQtdeEmEstoque() {
		return this.qtdeEmEstoque;
	}
	 
}
 
