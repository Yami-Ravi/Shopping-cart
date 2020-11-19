package com;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	List<User> list=new ArrayList<User>();
	public void adduser(User u)
	{
		list.add(u);
	}
}
