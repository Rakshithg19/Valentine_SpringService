package com.raksh.valentine.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;


import com.raksh.valentine.entity.ValentineEntity;
@Component
public class ValentineDAOImpl implements ValentineDAO {
	public ValentineDAOImpl() {
		System.out.println("invoked valentine dao impl"+this.getClass().getSimpleName());
	}
	public Integer save(ValentineEntity entity) {
		try {
			Configuration cnf = new Configuration();
			cnf.configure("hibernate.cfg.xml");
			cnf.addAnnotatedClass(ValentineEntity.class);
			SessionFactory sfactory = cnf.buildSessionFactory();
			Session session = sfactory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			
			session.close();
			sfactory.close();
			
		} catch (HibernateException he) {
			he.printStackTrace();
		}
		
		return null;
	}

}
