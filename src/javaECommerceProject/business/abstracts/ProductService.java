package javaECommerceProject.business.abstracts;

import java.util.List;

import javaECommerceProject.entities.concretes.Product;

public interface ProductService {
	
	List<Product> getAll();
	Product get(int id);
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
}
