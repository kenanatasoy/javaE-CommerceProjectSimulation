package javaECommerceProject.dataAccess.abstracts;

import java.util.List;

import javaECommerceProject.entities.concretes.User;

public interface UserDao {
	List<User> getAll();
	User get(int id);
	void add(User user);
	void update(User user);
	void delete(User user);
}
