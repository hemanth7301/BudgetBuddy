package com.hemanth.BudgetBuddy.service;


import com.hemanth.BudgetBuddy.entity.User;
import com.hemanth.BudgetBuddy.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser();
	
	User updateUser(UserModel user);
	
	void deleteUser();
	
	User getLoggedInUser();
}
