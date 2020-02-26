package com.sri.mvc.DAO;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sri.mvc.Entity.SignuEntity;


@Component
public class SignupDAOImpl implements SignupDAO{
	@Autowired
	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	public void save(SignuEntity ent) {
		System.out.println("entered save");

		try {
			//Session session = Factory.openSession();
			/*	System.out.println("dao implement start");
				System.out.println(ent);
				Configuration cfg = new Configuration();
				cfg.configure();
				cfg.addAnnotatedClass(SignuEntity.class);
				SessionFactory fsc = cfg.buildSessionFactory();*/
				Session session = factory.openSession();
				session.beginTransaction();
				System.out.println("tx begin");
				System.out.println("data saving");
				if(Objects.nonNull(ent)) {
				session.save(ent);}
				else {
					System.out.println("cannot save");
				}
				
				session.getTransaction().commit();
				System.out.println("commited");
				
			System.out.println("all resource closed");
			}catch(Exception e ) {
				e.printStackTrace();
			}
		
		
		
	}

	

}
