package com.shibee.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shibee.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void CreateShouldCreateaProduct() {
		
		ProductDAO dao = new ProductDAOImpl();
			Product product = new Product();
			product.setId(1);
			product.setName("S9");
			product.setDesc("Cute and curvy");
			product.setPrice(800);
			dao.create(product);
			Product result = dao.read(1);
			
			assertNotNull(result);
			assertEquals("S9",result.getName());
		
		
	}

}
