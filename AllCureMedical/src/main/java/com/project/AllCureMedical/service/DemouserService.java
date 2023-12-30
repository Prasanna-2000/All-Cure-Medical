package com.project.AllCureMedical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.AllCureMedical.api.UsersApi;
import com.project.AllCureMedical.bean.Demouser;
import com.project.AllCureMedical.bean.UsersDTO;

@Service
public class DemouserService  implements UserDetailsService{

	@Autowired
	private UsersApi usersApi;
	private String type;
	private String uName;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		UsersDTO users= usersApi.findUserById(userName);
		Demouser dUser=new Demouser();
		dUser.setUsername(users.getUsername());
		dUser.setPassword(users.getPassword());
		dUser.setType(users.getUserType());
		type=dUser.getType();
		uName = dUser.getUsername();
		System.out.println(uName);
		return dUser;
	}

	public void save(Demouser users,String email) {
		UsersDTO uDTO=new UsersDTO();
		uDTO.setUsername(users.getUsername());
		uDTO.setPassword(users.getPassword());
		uDTO.setUserType(users.getType());
		uDTO.setEmail(email);

		usersApi.saveUser(uDTO);
	 }
	
	public String getType()
	{
		return type;
	}

	public String getUsername()
	{
		return uName;
	}

}
