package javaECommerceProject.core;

import javaECommerceProject.business.abstracts.AuthService;
import javaECommerceProject.entities.concretes.User;
import javaECommerceProject.googleAuthService.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	
	@Override
	public boolean register(User user) {
		if(googleAuthManager.registerWithGoogle(user)) {
			System.out.println("Sayın " + user.getFirstName() + user.getLastName() + 
					" google hesabınızla başarıyla sisteme kaydoldunuz");
			return true;
		}
		else {
			return false;
		}
	}
	


	@Override
	public boolean login(String email, String password) {
		
		if(googleAuthManager.loginWithGoogle(email, password)) {
			System.out.println("Google ile başarıyla giriş yaptınız");
			return true;
		}
		else {
			return false;
		}
	}

	
	

}
