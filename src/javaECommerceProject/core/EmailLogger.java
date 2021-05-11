package javaECommerceProject.core;

import java.time.LocalDate;
import java.time.LocalTime;

import javaECommerceProject.entities.concretes.Product;
import javaECommerceProject.entities.concretes.User;



public class EmailLogger implements LoggerService{

	@Override
	public void logForSendAuthLink(User user) {
		System.out.println("Sayın " + user.getFirstName() + " " + user.getLastName() +
				" doğrulama bağlantınız gönderildi, bu bağlantıya tıklayıp kayıt işlemini tamamlayabilirsiniz");
		
	}
	
	
	@Override
	public void logForRegister(User user) {
		System.out.println("Sayın " + user.getFirstName() + " " + user.getLastName() + " " +
				LocalDate.now() + LocalTime.now() + " tarihinde sisteme kaydoldunuz");
	
	}

	@Override
	public void logForLogin(User user) {
		System.out.println("Sayın " + user.getFirstName() + " " + user.getLastName() + 
				LocalDate.now() + LocalTime.now() + " tarihinde sisteme giriş yaptınız");
		
	}

	@Override
	public void logForSale(User user, Product product) {
		System.out.println("Sayın " + user.getFirstName() + " " + user.getLastName() + 
				LocalDate.now() + LocalTime.now() + " tarihinde " + product.getName() + " ürününü satın aldınız ");
		
	}

	

	

	
	
}
