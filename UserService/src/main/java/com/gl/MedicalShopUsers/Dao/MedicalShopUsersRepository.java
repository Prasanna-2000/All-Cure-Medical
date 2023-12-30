package com.gl.MedicalShopUsers.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.MedicalShopUsers.bean.Users;

@Repository
public interface MedicalShopUsersRepository extends JpaRepository<Users, String> {
	@Query("SELECT u.username FROM Users u WHERE u.userType = ?1")
	public List<String> getAllUserNames(String userType);
}
