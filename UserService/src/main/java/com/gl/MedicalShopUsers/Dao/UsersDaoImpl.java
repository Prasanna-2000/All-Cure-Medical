package com.gl.MedicalShopUsers.Dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.MedicalShopUsers.bean.Users;



@Repository
@Service
public class UsersDaoImpl implements UsersDao {
@Autowired
private  MedicalShopUsersRepository repo;
	@Override
	public void SaveUsers(Users user) {
		repo.save(user);

	}

	@Override
	public String generateId(String userType) {
		String prefix = "";
		Long userId;
		if (!("Ordinary".equals(userType))) {
			List<String> allUserNamesList = repo.getAllUserNames(userType);
			List<Long> allUserIdList = new ArrayList<>();
			for (String userName : allUserNamesList) {
				Long id = Long.parseLong(userName.substring(1));
				allUserIdList.add(id);
			}
			
			if(!allUserIdList.isEmpty()) {
				userId = Collections.max(allUserIdList);
				prefix=userType.equals("Super")?"A":"S";
				userId += 1;
			} 
     		else
			{
				prefix=userType.equals("Super")?"A":"S";
     			userId = 1001L;
			}
			return prefix+userId;
		}
		else {
			System.out.println("ordi");
			List<String> allUserNamesList = repo.getAllUserNames(userType);
			List<Long> allUserIdList = new ArrayList<>();
			for (String userName : allUserNamesList) {
				Long id = Long.parseLong(userName);
				allUserIdList.add(id);
			}
			if(!allUserIdList.isEmpty()) {
				userId = Collections.max(allUserIdList);
				userId += 1;
			} 
     		else
			{
     			userId = 123456781L;
			}
			return prefix+userId;
		}
	}

	@Override
	public List<Users> findAll() {
		List<Users> list=repo.findAll();
		return list;
	}

	@Override
	public Users findById(String username) {
		Users user=repo.getById(username);
		return user;
	}

}
