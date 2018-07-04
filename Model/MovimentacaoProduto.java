package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class MovimentacaoProduto {
	@id_movimentacao
	private Integer id_movimentacao;
	private Date data;
	
	@ManyToMany
	@JoinTable(name="produto_movimentado", joinColumns = 
	{@JoinColumn(name="id_movimentacao")}, InverseJoinColumns=
	{@JoinColumn(name ="id_produto")}, , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private String codProduto;
	private Integer qtde;
	
	@ManyToMany
	@JoinTable(name="fornecedor_movimento", joinColumns = 
	{@JoinColumn(name="id_movimentacao")}, InverseJoinColumns=
	{@JoinColumn(name ="cnpj")}, , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private String codFornecedor;

	private String destino;
	private Integer status;
	 
	public void setData(Date data) {
	}
	 
	public Date getData() {
		return null;
	}
	public void setCodProduto(String codProduto) {
	}
	 
	public String getCodProduto() {
		return null;
	}
	 
	public void seQtde(int qtde) {
	}
	 
	public int getQtde() {
		return 0;
	}
	 
	public void setCodFornecedor(String codFornecedor) {
	}
	 
	public string getCodFornecedor() {
		return null;
	}
	 
	public void setDestino(string destino) {
	}
	 
	public string getDestino() {
		return null;
	}
	 
	public void setStatus(int status) {
	}
	 
	public int getStatus() {
		return 0;
	}
	 
}
 
