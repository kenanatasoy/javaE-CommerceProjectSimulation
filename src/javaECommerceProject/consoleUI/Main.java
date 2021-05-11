package javaECommerceProject.consoleUI;

import javaECommerceProject.business.abstracts.UserService;
import javaECommerceProject.business.concretes.AuthManager;
import javaECommerceProject.business.concretes.UserManager;
import javaECommerceProject.core.EmailLogger;
import javaECommerceProject.dataAccess.concretes.inMemory.InMemoryUserDao;
import javaECommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new AuthManager(new InMemoryUserDao()), new InMemoryUserDao(), new EmailLogger());
		
		User user = new User(7, "Kemal", "Tanca", "kemal@kemaltanca.com", "1234257");
	
		userService.add(user);
		
		//u.getFirstName() + " " + u.getLastName() + " " + u.getEmail() + " " + u.getPassword()
		for (User u : userService.getAll()) {
			System.out.println(u);
		}
		
	}

}
