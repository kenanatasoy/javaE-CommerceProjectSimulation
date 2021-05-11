package javaECommerceProject.core;

import javaECommerceProject.entities.concretes.Product;
import javaECommerceProject.entities.concretes.User;

public interface LoggerService {
	
	void logForSendAuthLink(User user);
	
	void logForRegister(User user);

	void logForLogin(User user);
	
	void logForSale(User user, Product product);

}
