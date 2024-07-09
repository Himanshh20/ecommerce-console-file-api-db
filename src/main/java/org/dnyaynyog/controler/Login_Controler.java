package org.dnyaynyog.controler;

import org.dnyanyog.dto.Login;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 

public class Login_Controler { 
	 @PostMapping ("/login") 
	 public String login (@RequestBody Login loginBody)  { 
		  System.out.println(loginBody) ; 
		  return "sucessfull" ; 
		  
	 }

}
