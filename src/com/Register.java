package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Register")
public class Register extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email = req.getParameter("name");
	String id = req.getParameter("custid");
	String pass=req.getParameter("pass");
	String address=req.getParameter("address");
	String phn=req.getParameter("contact");
	User u=new User(email,id,pass,address,phn);
	UserDAO ud=new UserDAO();
	ud.adduser(u);
	System.out.print(email);
}

}