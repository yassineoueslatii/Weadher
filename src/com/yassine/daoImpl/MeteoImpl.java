package com.yassine.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yassine.dao.IMeteoDao;
import com.yassine.entities.Meteo;

public class MeteoImpl implements IMeteoDao {
	SessionFactory factory;
	Session session;

	@Override
	public void save(Meteo meteo) {
		 connexion();
		
		try {
			
		    session= factory.getCurrentSession();
			session.beginTransaction();
			session.saveOrUpdate(meteo);
			
			
			session.getTransaction().commit();
			factory.close();
			session.close();
			
			System.out.println("Done!!");
		} catch (Exception e) {
			System.out.println("Error!!");
			e.printStackTrace();
		}
								 
								 
		
	}

	@Override
	public List<Meteo> getListMeteo() {
		
		connexion();
		
		session=factory.getCurrentSession();
		session.beginTransaction();
		List<Meteo> meteos  = (List<Meteo>) session.createQuery("from Meteo").list();
		
		session.close();
		factory.close();
		
	
		return meteos ;
	}
	public void connexion() {
		factory= new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(Meteo.class)
				 .buildSessionFactory();

	}

	@Override
	public void remove(int id) {
		connexion();
	 session=factory.getCurrentSession();
	 session.beginTransaction();
	 Meteo meteo=session.get(Meteo.class, id);
	 session.delete(meteo);
	 session.getTransaction().commit();
	 session.close();
	 factory.close();
		
	}

}
