package br.com.jsf.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.jsf.jpautil.JPAUtil;

public class DaoGeneric<E> {
	
	public void salvar(E entidade){
		EntityManager entityManager = JPAUtil.geEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(entidade);
		
		entityTransaction.commit();
		entityManager.close();
	}
	public E merge(E entidade){
		EntityManager entityManager = JPAUtil.geEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		E retorno = entityManager.merge(entidade);
		
		entityTransaction.commit();
		entityManager.close();
		
		return retorno;
	}
	
	public void delete(E entidade){
		EntityManager entityManager = JPAUtil.geEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.remove(entidade);
		
		entityTransaction.commit();
		entityManager.close();
	}
	public void deletePorID(E entidade){
		EntityManager entityManager = JPAUtil.geEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Object id = JPAUtil.getPrimaryKey(entidade);
		
		entityManager.createQuery("delete from "+entidade.getClass().getCanonicalName()  +" where id = "+id).executeUpdate();
		
		entityTransaction.commit();
		entityManager.close();
	}
}
