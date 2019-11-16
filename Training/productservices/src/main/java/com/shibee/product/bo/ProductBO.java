package com.shibee.product.bo;

import com.shibee.product.dto.Product;

public interface ProductBO {
	
	public void create (Product product);
	
	public Product findProduct(int i);

}
