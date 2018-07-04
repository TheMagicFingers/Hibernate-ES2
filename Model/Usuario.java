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
		return null;
	}
	 
	public void setUsuario(PessoaFisica usuario) {
	 
	}
	 
	public PessoaFisica getUsuario() {
		return null;
	}
	 
	public void setLogin(String login) {
	 
	}
	 
	public String getLogin() {
		return null;
	}
	 
	public void setSenha(String senha) {
	 
	}
	 
	public String getSenha() {
		return null;
	}
	 
	public void setNivel(int nivel) {
	 
	}
	 
	public int getNivel() {
		return 0;
	}
	 
}
 
