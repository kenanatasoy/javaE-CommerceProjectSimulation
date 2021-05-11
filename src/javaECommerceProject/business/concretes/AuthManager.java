package javaECommerceProject.business.concretes;

import javaECommerceProject.business.abstracts.AuthService;
import javaECommerceProject.core.Utils;
import javaECommerceProject.dataAccess.abstracts.UserDao;
import javaECommerceProject.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserDao userDao;

	public AuthManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean register(User user) {

		if (user.getFirstName() == null && user.getLastName() == null && user.getPassword() == null
				&& user.getEmail() == null) {
			System.out.println("User's name, surname, email and password are mandatory");
			return false;
		}

		if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakter olmalıdır");
			return false;
		}

		if (Utils.match(user.getEmail()) == false) {
			System.out.println("E-posta, e-posta formatında olmalıdır");
			return false;
		}

		if (user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
			System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır.");
			return false;
		}
		;

		return true;
	}

	@Override
	public boolean login(String email, String password) {

		this.userDao.getAll();

		boolean isEmailExists = this.userDao.getAll().stream().filter(user -> user.getEmail().equals(email))
				.findFirst().isPresent();
		boolean isPasswordExists = this.userDao.getAll().stream()
				.filter(user -> user.getPassword().equals(password)).findFirst().isPresent();
		if (isEmailExists == true && isPasswordExists == true) {
			return true;
		} else {
			return false;
		}
	}

}
