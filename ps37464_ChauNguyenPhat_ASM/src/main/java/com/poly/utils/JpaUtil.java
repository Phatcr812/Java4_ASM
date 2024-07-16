package com.poly.utils;

import javax.persistence.*;

public class JpaUtil {
	private static EntityManagerFactory factory;
	
	public static EntityManager getEntityManager() {
		if(factory == null || factory.isOpen()) 
		{
			factory = Persistence.createEntityManagerFactory("TRAICAY_DUAN1_V1");
		}
		return factory.createEntityManager();
	}
	
	public static void shutDown() {
		if(factory != null && factory.isOpen()) 
		{
			factory.close();
		}
		factory = null;
	}
}
