package com.raksh.valentine.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.raksh.valentine.dao.ValentineDAO;
import com.raksh.valentine.entity.ValentineEntity;
@Component
public class ValentineServiceImpl implements ValentineService {
	
	@Autowired
	private ValentineDAO dao;
	public ValentineServiceImpl() {
		System.out.println("created impl"+this.getClass().getName());
	}
	public boolean ValidateAndSave(ValentineEntity entity) {
		System.out.println("invoked validate and save"+entity);
		System.out.println("yet to validate");
		Integer id = dao.save(entity);
		if(Objects.nonNull(id)) {
			System.out.println("entity saved");
			return true;
		}
		System.out.println("entity not saved");
	 return false;
	}

}
