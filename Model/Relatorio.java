package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Relatorio {
	@id_relatorio
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_relatorio;

	private Date dataInicio;
	private Date dataFim;
	
	@ManyToMany
	@JoinTable(name="relatorio_movimento", joinColumns = 
	{@JoinColumn(name="id_movimentacao")}, InverseJoinColumns=
	{@JoinColumn(name ="id_relatorio")}, , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private String MovimentacaoProduto;
	 
	public void setDataInicio(Date dataInicio) {
	 	this.dataInicio = dataInicio;
	}
	 
	public Date getDataInicio() {
		return this.dataInicio;
	}
	 
	public void setDataFim(Date dataFim) {
	 	this.dataFim = dataFim;
	}
	 
	public Date getDataFim() {
		return this.dataFim;
	}
	 
	public String getCodProduto() {
		return null;
	}
	 
}
 
