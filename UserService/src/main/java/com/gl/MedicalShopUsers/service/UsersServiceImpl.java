package com.gl.MedicalShopUsers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.MedicalShopUsers.Dao.UsersDao;
import com.gl.MedicalShopUsers.bean.Users;
import com.gl.MedicalShopUsers.bean.UsersDTO;

@Repository
@Service
public class UsersServiceImpl implements UserService {
	

	@Autowired
	private UsersDao usersDao;
	
	
	@Override
	public void customerSave(UsersDTO usersDTO) {
		Users user = new Users(usersDTO);
		usersDao.SaveUsers(user);
	}

	@Override
	public List<UsersDTO> findAll() {
		List<UsersDTO> userDTOList = new ArrayList<>();
		for(Users user:usersDao.findAll()) {
			UsersDTO userDTO = new UsersDTO(user);
			userDTOList.add(userDTO);
		}
		return userDTOList;
	}
	
	@Override
	public UsersDTO findById(String username) {
		return new UsersDTO(usersDao.findById(username));
	}

	@Override
	public String generateId(String userType) {
		return usersDao.generateId(userType);
	}

	
	


}
