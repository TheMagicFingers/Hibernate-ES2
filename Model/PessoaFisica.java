package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

public class PessoaFisica extends Pessoa implements Serializable {
	@cpf
	private String CPF;

	public string getCPF(String CPF) {
		return null;
	}
	 
}
 
