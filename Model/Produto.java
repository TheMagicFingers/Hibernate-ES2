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

	public void setCodigo(String codigo) {
	}
	 
	public String getCodigo() {
		return null;
	}
	 
	public void setNome(String nome) {
	}
	 
	public String getNome() {
		return null;
	}
	 
	public void setValorDeReferencia(float valorDeReferencia) {
	}
	 
	public float getValorDeReferencia() {
		return 0;
	}
	 
	public void setValorDeVenda(float valorDeVenda) {
	}
	 
	public float getValorDeVenda() {
		return 0;
	}
	
	public void setQtdeEmEstoque(int qtdeEmEstoque) {
	 
	}
	 
	public int getQtdeEmEstoque() {
		return 0;
	}
	 
}
 
