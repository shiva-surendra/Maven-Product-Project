package com.shibee.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.shibee.product.bo.ProductBO;
import com.shibee.product.dto.Product;

public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		ProductBO bo = (ProductBO) context.getBean("productbo");
		
		Product prod = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		 
		out.println("<br>Product details");
		out.println("<br>Product Id: "+prod.getId());
		out.println("<br>Product Name: "+prod.getName());
		out.println("<br>Product Description: "+prod.getDesc());
		out.println("<br>Product Price: "+prod.getPrice());
	}

}
