package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@MappedSuperclass
public interface Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	 
	public void setNome(String nome) {\
		this.nome = nome;
	}
	 
	public String getNome() {
		return this.nome;
	}
	 
	public void setEndereco(String endereco) {
		this.endereco = this.endereco;
	}
	 
	public String getEndereco() {
		return this.endereco;
	}
	 
	public void setEmail(String email) {
		this.email = email;
	}
	 
	public String getEmail() {
		return this.email;
	}
	 
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	 
	public String getTelefone() {
		return this.telefone;
	}
	 
}
 
