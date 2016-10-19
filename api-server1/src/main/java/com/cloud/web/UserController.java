package com.cloud.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

	static Map<Integer, User> users = Collections
			.synchronizedMap(new HashMap<Integer, User>());

	@RequestMapping("userList")
	public List<User> getUserList() {
		return new ArrayList<>(users.values());
	}

	@RequestMapping("addUser")
	public String addUser(User user) {
		users.put(user.getId(), user);
		return "success";

	}

	
	@RequestMapping("getUser")
	public User getUser(Integer id ){
		return users.get(id);
	}
	
	@RequestMapping("delete/{id}") 
    public String deleteUser(@PathVariable Integer id) { 
        users.remove(id); 
        return "success"; 
    } 

	
	
}
