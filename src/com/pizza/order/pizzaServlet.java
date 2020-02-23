package com.pizza.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class pizzaServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
				
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String pizza = req.getParameter("pizza");
		String size = req.getParameter("size");
		
		double price = 69;
		
		if(pizza.equals("Hawaian") && size.equals("Small")) {price = 7.00;}
		if(pizza.equals("Hawaian") && size.equals("Regular")) {price = 10.00;}
		if(pizza.equals("Hawaian") && size.equals("Family")) {price = 13.00;}
		if(pizza.equals("Meat lovers") && size.equals("Small")) {price = 8.00;}
		if(pizza.equals("Meat lovers") && size.equals("Regular")) {price = 10.00;}
		if(pizza.equals("Meat lovers") && size.equals("Family")) {price = 15.00;}
		if(pizza.equals("All Cheese") && size.equals("Small")) {price = 5.00;}
		if(pizza.equals("All Cheese") && size.equals("Regular")) { price = 8.00;}
		if(pizza.equals("All Cheese") && size.equals("Family")) {price = 10.00;}
		
		
		
		
		PrintWriter out = res.getWriter();
		out.println("This is your order confirmation\n");
		out.println("********************************");
		out.println("Your Pizza: " + pizza );
		out.println("Size: " + size);
		out.println("Price: " + price);
		out.println("Delivery Address and Contact");
		out.println(fname + " " + lname);
		out.println("Address" + address);
		out.println("Phone Number: " + phone);
		
		
		
	}
	
}