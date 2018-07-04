package Model;

import DAO .UsuarioDAOImp;
import View.UsuarioView;
import DAO .UsuarioDAO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Usuario extends PessoaFisica {

	private String login;
	private String senha;
	private int nivel;
	 
	public String getLogin() {
		return this.login;
	}
	 
	public void setUsuario(PessoaFisica usuario) {
	 	this.usuario = usuario;
	}
	 
	public PessoaFisica getUsuario() {
		return this.usuario;
	}
	 
	public void setLogin(String login) {
	 	this.login = login;
	}
	 
	public String getLogin() {
		return this.login;
	}
	 
	public void setSenha(String senha) {
	 	this.senha = senha;
	}
	 
	public String getSenha() {
		return this.senha;
	}
	 
	public void setNivel(int nivel) {
	 	this.nivel = nivel;
	}
	 
	public int getNivel() {
		return this.nivel;
	}
	 
}
 
