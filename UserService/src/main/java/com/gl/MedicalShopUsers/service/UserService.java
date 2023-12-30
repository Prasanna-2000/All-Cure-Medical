package com.gl.MedicalShopUsers.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.MedicalShopUsers.bean.UsersDTO;


@Repository
public interface UserService {

	public void customerSave(UsersDTO usersDTO) ;
	public String generateId(String userType);
	public List<UsersDTO> findAll();
	public UsersDTO findById(String username);

}
	
