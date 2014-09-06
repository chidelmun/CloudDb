package com.db.pr;

public class DbConnection {
	
	public DbConnection(){
		
	}
	
	public boolean authenticate(String username,String password){
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
			return true;
		}
		else
		return false;
		
		
	}
	
}
