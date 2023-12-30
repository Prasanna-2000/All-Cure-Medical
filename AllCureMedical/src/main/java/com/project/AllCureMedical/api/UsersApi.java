package com.project.AllCureMedical.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.AllCureMedical.bean.UsersDTO;


@FeignClient(name="USER-SERVICE")
public interface UsersApi {
	@GetMapping("/users/showAUser/{userName}")
	public UsersDTO findUserById(@PathVariable String userName);
	
	@GetMapping( "/users/showAllUser")
	public List<UsersDTO> findAllUsers();
	
	@PostMapping("/users/saveAUser")
	public String saveUser(@RequestBody UsersDTO userDTO);
	
	@PutMapping("/users/editUser")
	public String editUser(@RequestBody UsersDTO usersDTO);
	
	@GetMapping("/users/getNewSuperId")
	public String getnewSuperId(); 
}
