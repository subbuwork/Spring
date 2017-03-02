package com.spring.service;

import java.util.List;
import com.spring.domain.User;

public interface UserService {
	public void insertUser(User user);

	public User getUser(Integer userid);

    public List<User> usersList();

    public void deleteUser(Integer userid);

    public void updateUser(Integer userid,User user);
}
