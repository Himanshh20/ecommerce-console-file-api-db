package org.dnyaynyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.dto.Login;

import Common.DButils;



public class Login_Service { 
	 public String login (Login loginBody) throws SQLException {   
		 
		  String query = "SELECT * FROM ecomerse.login  WHERE username ='"+loginBody.user+"' AND password = '"+loginBody.password+"'" ; 


		  ResultSet resultset =  DButils.executeSelectQuery(query);  


		if (resultset.next()) { 
					 return  "Login Successful"; 
				
					
				} else {
					return "Login Failed";
				}
	
			}
	
		  
	      }
