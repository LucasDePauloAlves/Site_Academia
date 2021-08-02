package br.com.softblue.loucademia.domain.acesso;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.softblue.loucademia.domain.aluno.Aluno;

@Entity
@Table(name = "ENTRADAS_SAIDAS")
public class Acesso implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Diz que sera gerado automaticamente o ID sequencialmente
	@Column(name = "ID", nullable = false) // nome da coluna e não permite nulos na entrada
	private Integer id;
	
	@ManyToOne //muito acesso pra um aluno
	@JoinColumn(name = "ALUNO_ID", nullable = false) // coluna para fazer o relacionamento entre tabelas
	//e não pode ter acesso sem aluno
	private Aluno aluno;
	
	@Column(name = "ENTRADA", nullable = false)
	private LocalDateTime entrada;
	
	@Column(name = "SAIDA", nullable = true)// tem que permitir nulo, pois só vou preencher quando sair
	private LocalDateTime saida;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public LocalDateTime getEntrada() {
		return entrada;
	}
	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}
	public LocalDateTime getSaida() {
		return saida;
	}
	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}
	
	@Override
	public String toString() {
		return "Acesso [id=" + id + ", aluno=" + aluno + ", entrada=" + entrada + ", saida=" + saida + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acesso other = (Acesso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
