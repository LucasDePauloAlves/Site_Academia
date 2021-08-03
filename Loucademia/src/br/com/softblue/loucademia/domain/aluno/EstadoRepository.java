package br.com.softblue.loucademia.domain.aluno;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class EstadoRepository {

	@PersistenceContext //proprio CDI ira injetar uma dependencia
	private EntityManager em; //porta de dados para JPA
	
	public List<Estado> listEstados(){
		//JPQL - Lida com Objetos e atributos, busca com base na classe. 
		TypedQuery<Estado> q = em.createQuery("SELECT e FROM Estado e ORDER BY e.nome", Estado.class);
		return q.getResultList();
	}
	
}
