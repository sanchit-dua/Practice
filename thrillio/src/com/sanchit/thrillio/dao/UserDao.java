package com.sanchit.thrillio.dao;

import com.sanchit.thrillio.DataStore;
import com.sanchit.thrillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}

}
