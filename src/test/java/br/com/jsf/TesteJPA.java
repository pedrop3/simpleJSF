package br.com.jsf;

import javax.persistence.Persistence;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TesteJPA {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("projeto_JSF");
	}

}
