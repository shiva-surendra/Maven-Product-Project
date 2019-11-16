package com.shibee.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.shibee.product.bo.ProductBO;
import com.shibee.product.dto.Product;

public class CreateProductServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		int price = Integer.parseInt(request.getParameter("price"));
		String name = request.getParameter("name");
		String desc = request.getParameter("description");
		
		Product prod = new Product();
		prod.setDesc(desc);
		prod.setId(id);
		prod.setName(name); 
		prod.setPrice(price);
		
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		ProductBO bo = (ProductBO) context.getBean("productbo");
		bo.create(prod);
		
		request.setAttribute("Status", "Product added successfully");
		RequestDispatcher rd = request.getRequestDispatcher("Home_Product.jsp");
		rd.forward(request, response);
	}
}
