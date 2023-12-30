package com.gl.MedicalShopUsers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.MedicalShopUsers.bean.UsersDTO;
import com.gl.MedicalShopUsers.service.UserService;


@RequestMapping("/users")
@RestController
public class MedicalShopUsersRestController {
@Autowired
 private UserService userService;


	@GetMapping(value = "/showAllUser",produces =MediaType.APPLICATION_JSON_VALUE )
	public List<UsersDTO> findAllUsers()
	{
		return userService.findAll();
	}
	
	@GetMapping(value = "/showAUser/{username}",produces =MediaType.APPLICATION_JSON_VALUE )
	public UsersDTO findUserById(@PathVariable String username){
		return userService.findById(username);
	}
	
	@PostMapping(value="/saveAUser",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveUser(@RequestBody UsersDTO userDTO) {
//		String userType=userDTO.getUserType();
//		String username = userService.generateId(userType);
//		userDTO.setUsername(username);
		userService.customerSave(userDTO);
		return "user Saved";
	}
	
	@PutMapping(value="/editUser",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String editUser(@RequestBody UsersDTO usersDTO) {
		String userName = usersDTO.getUsername();
		String password = usersDTO.getPassword();
		String email = usersDTO.getEmail();
		String userType = usersDTO.getUserType();
		UsersDTO userDTO = userService.findById(userName);
		userDTO.setUsername(userName);
		userDTO.setPassword(password);
		userDTO.setEmail(email);
		userDTO.setUserType(userType);
		userService.customerSave(userDTO);
		return "user Updated";
	}
	
	@GetMapping(value="/getNewSuperId",produces=MediaType.APPLICATION_JSON_VALUE)
	public String getnewSuperId()
	{
		return userService.generateId("Super");
	}
}