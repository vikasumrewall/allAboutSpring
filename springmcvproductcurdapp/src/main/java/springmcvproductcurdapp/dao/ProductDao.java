package springmcvproductcurdapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import springmcvproductcurdapp.entity.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.save(product);
	}
	//get All products
	public List<Product> fetchAllProduct()
	{
		return this.hibernateTemplate.loadAll(Product.class);
	}
	
	//delete  products
	@Transactional
	public void deleteProduct(int productId)
	{
		Product prod=hibernateTemplate.load(Product.class,productId);
		
			this.hibernateTemplate.delete(prod);
	}
	
	public Product fetchProduct(int prodId)
	{
		return this.hibernateTemplate.get(Product.class,prodId);
	}
	
	
	
	@Transactional
	public void UpdateProduct(Product product)
	{
	
		
			this.hibernateTemplate.update(product);
	}
	

}
