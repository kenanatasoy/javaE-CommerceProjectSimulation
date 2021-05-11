package javaECommerceProject.dataAccess.concretes.inMemory;

import java.util.ArrayList;
import java.util.List;

import javaECommerceProject.dataAccess.abstracts.UserDao;
import javaECommerceProject.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	List<User> users;
    
	public InMemoryUserDao() {
		
		this.users = new ArrayList<User>();
	
		User user1 = new User(1, "Kenan", "Atasoy", "kenan@kenanatasoy.com", "4564");
		User user2 = new User(2, "Engin", "Demiroğ", "engin@engindemirog.com", "5564");
		User user3 = new User(3, "Murat", "Kurtboğan", "murat@muratkurtbogan.com", "3564");
		User user4 = new User(4, "İlker", "Tural", "ilker@ilkertural.com", "4524");
		User user5 = new User(5, "Kerem", "Varış", "kerem@keremvaris.com", "4264");
		User user6 = new User(6, "Yaşar", "Taymaz", "yasar@yasartaymaz.com", "4584");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		
	}
	
	
	
	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	
	
}
