package com.sts.rest.sevices;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sts.rest.entity.Product;
import com.sts.rest.repository.ProdRepository;
@Service
public class ProductServices
{
	@Autowired
	private ProdRepository serviceRepo;
	
	public List<Product> getproducts()
	{
		List<Product> list = new ArrayList<>();
		this.serviceRepo.findAll().forEach(list :: add);
		return list;
	}
	
	public void addproduct(Product product) {
		this.serviceRepo.save(product);
	}
	
	public void updateproduct(Integer id, Product product) {
		this.serviceRepo.save(product);
	}
	
	public void deleteproduct(Integer id) {
		this.serviceRepo.deleteById(id);
	}
	}
