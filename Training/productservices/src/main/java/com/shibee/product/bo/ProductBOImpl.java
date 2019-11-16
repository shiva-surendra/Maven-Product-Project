package com.shibee.product.bo;

import com.shibee.product.dao.ProductDAO;
import com.shibee.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAO productdao;
	
	public void create(Product product) {
		productdao.create(product);
	}

	public Product findProduct(int i) {	
		return productdao.read(i);
	}

	public ProductDAO getProductdao() {
		return productdao;
	}

	public void setProductdao(ProductDAO productdao) {
		this.productdao = productdao;
	}
}
