package com.sts.rest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.rest.entity.Product;
//import com.sts.rest.service.CustService;
import com.sts.rest.sevices.ProductServices;

@RestController
@RequestMapping("/rest/product")
public class MyController
{
	@Autowired
    private ProductServices service;
    
    @GetMapping("/product")
    public List<Product> getproducts()
    {
    	return this.service.getproducts();
    }
    @PostMapping("/addproduct")
	public void addproduct(@RequestBody Product product)
    {
    	this.service.addproduct(product);
    }
    @PutMapping("/updateproduct/{prodId}")
    public void updateproduct(@PathVariable String prodId, @RequestBody Product product)
    {
    	this.service.updateproduct(Integer.parseInt(prodId), product);
    }
    @DeleteMapping("/deleteproduct/{prodId}")
	public void deleteCustomer(@PathVariable String prodId)
    {
		this.service.deleteproduct(Integer.parseInt(prodId));
	}
 }

