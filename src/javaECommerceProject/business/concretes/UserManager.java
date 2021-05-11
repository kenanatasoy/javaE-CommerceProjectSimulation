package javaECommerceProject.business.concretes;

import java.util.List;

import javaECommerceProject.business.abstracts.AuthService;
import javaECommerceProject.business.abstracts.UserService;
import javaECommerceProject.core.LoggerService;
import javaECommerceProject.dataAccess.abstracts.UserDao;
import javaECommerceProject.entities.concretes.User;

public class UserManager implements UserService{

	private AuthService authService;
	private UserDao userDao;
	private LoggerService loggerService;
	
	public UserManager(AuthService authService, UserDao userDao, LoggerService loggerService) {
		super();
		this.authService = authService;
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(User user) {
		if(this.authService.register(user) == true) {
			
			boolean isExists = this.userDao.getAll().stream().filter(u -> u.getEmail().equals(user.getEmail())).findFirst().isPresent();
			
			if(isExists) {
				System.out.println(user.getEmail() + " email adresine sahip kullanıcı mevcut");
			}
			
			else {			
				
				this.loggerService.logForSendAuthLink(user);
				this.loggerService.logForRegister(user);
				this.userDao.add(user);
			}
		}
		
		else {
			
			System.out.println("Kullanıcı bilgileri doğru şekilde girilmedir");
		}
		
	}
	
	@Override
	public void login(String email, String password) {
		if(this.authService.login(email, password)) {
			System.out.println("Başarıyla giriş yaptınız");
		}
		
		else {
			System.out.println("E-posta veya şifre hatalı");
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
