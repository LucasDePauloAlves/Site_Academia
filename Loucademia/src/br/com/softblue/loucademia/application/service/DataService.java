package br.com.softblue.loucademia.application.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.softblue.loucademia.domain.aluno.Estado;
import br.com.softblue.loucademia.domain.aluno.EstadoRepository;
import br.com.softblue.loucademia.domain.aluno.Aluno.Sexo;
import br.com.softblue.loucademia.domain.aluno.Aluno.Situacao;

@Stateless // nao podemos criar atributos 5.5
public class DataService {

	@EJB
	private EstadoRepository estadoRepository;
	
	public List<Estado> listEstados(){
		return estadoRepository.listEstados();
	}

	public Sexo[] getSexos() {
		return Sexo.values(); //values � um m�todo do Enum que retorna um array com todos os elementos do enum.
	}
	
	public Situacao[] getSituacoes() {
		return Situacao.values();
	}
}
