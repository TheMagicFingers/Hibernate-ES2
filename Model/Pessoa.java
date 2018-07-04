package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public interface Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	 
	public void setNome(String nome) {
	}
	 
	public String getNome() {
		return null;
	}
	 
	public void setEndereco(String endereco) {
	}
	 
	public String getEndereco() {
		return null;
	}
	 
	public void setEmail(String email) {
	}
	 
	public String getEmail() {
		return null;
	}
	 
	public void setTelefone(String nome) {
	}
	 
	public String getTelefone() {
		return null;
	}
	 
}
 
