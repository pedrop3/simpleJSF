package br.com.jsf.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory = null;
	static {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("projeto_JSF");
		}
	}
	
	public static EntityManager geEntityManager(){
		return factory.createEntityManager();
		
	}
	public static Object getPrimaryKey(Object entity){
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
		
	}
}
