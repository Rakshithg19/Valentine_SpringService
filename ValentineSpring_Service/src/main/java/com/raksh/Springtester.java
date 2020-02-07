package com.raksh;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raksh.valentine.dao.ValentineDAO;
import com.raksh.valentine.dao.ValentineDAOImpl;
import com.raksh.valentine.entity.ValentineEntity;
import com.raksh.valentine.service.ValentineService;

public class Springtester {
	public static void main(String[] args) {

		try { 
			ApplicationContext con = new ClassPathXmlApplicationContext("context.xml");
			ValentineService ref = con.getBean(ValentineService.class);
			ValentineEntity ent = new ValentineEntity(1,"commited","ring",2000,"Rakshith");
			ValentineDAO dao = new ValentineDAOImpl();
			dao.save(ent);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
