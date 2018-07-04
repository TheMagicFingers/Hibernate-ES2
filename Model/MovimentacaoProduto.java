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
		this.data = data;
	}
	 
	public Date getData() {
		return this.data;
	}
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	 
	public String getCodProduto() {
		return this.codProduto;
	}
	 
	public void seQtde(int qtde) {
		this.qtde = qtde
	}
	 
	public int getQtde() {
		return this.gtde;
	}
	 
	public void setCodFornecedor(String codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	 
	public string getCodFornecedor() {
		return this.codFornecedor;
	}
	 
	public void setDestino(string destino) {
		this.destino = destino;
	}
	 
	public string getDestino() {
		return this.destino;
	}
	 
	public void setStatus(int status) {
		this.status = status;
	}
	 
	public int getStatus() {
		return this.status;
	}
	 
}
 
