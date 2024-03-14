package com.example.sp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.sp.entity.User;
import com.example.sp.service.UserService;

//Creating Serivce class by using annotation @Controller

@Controller
public class UserController {

	//instance of UserService and initialization 

	@Autowired
	UserService userv;


	// Using Post map storing the User Details into User Entity

	@PostMapping("UserDetails")
	public String from(@ModelAttribute User user) 
	{

		//validating if user exists or not with email
		boolean status=userv.checkUser(user.getEmail());
		if(status)
		{
			//using userSerivce to communicate with repo and store data
			userv.addUser(user);

			//returing to UserSuccess page
			return "UserSuccess";
		}
		else{

			//returing to fail page due to user exists
			return "UserExists";
		}
	}

	@GetMapping("retrieveUserDetails")
	public String retrieveUserDetails(Model model) {
		
		//getting all users detials using userService
		List<User> userDetails=userv.retrieveDetials();
		
		//using Model interface adding into attribute and sending in a form of data
		model.addAttribute("user", userDetails);
		
		//returning to display page
		return "display";
		
	}
	
	@GetMapping("index")
	public String navigatingToIndex() {
		return "index";
	}
	
}
