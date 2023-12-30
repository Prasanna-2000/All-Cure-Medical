package com.gl.MedicalShopUsers.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.MedicalShopUsers.bean.Users;

@Repository

public interface UsersDao {
	public void SaveUsers(Users user);
	public String generateId(String userType);
	public List<Users> findAll();
	public Users findById(String username);

}
