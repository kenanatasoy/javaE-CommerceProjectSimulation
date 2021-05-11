package javaECommerceProject.business.abstracts;

import javaECommerceProject.entities.concretes.User;

public interface AuthService {
	boolean register(User user);
	boolean login(String email, String password);
}
