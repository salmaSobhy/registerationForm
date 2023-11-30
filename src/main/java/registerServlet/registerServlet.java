package registerServlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerServlet
 */
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	String driver= "com.mysql.cj.jdbc.Driver";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        int age = Integer.parseInt(request.getParameter("age"));
	        String phone= request.getParameter("phone");
	        storeInDatabase(name, email, age,phone);
	        response.getWriter().println("Registration successful!");
	    }

	    private void storeInDatabase(String name, String email, int age,String phone) {
	        // Replace these values with your database credentials
	        String url = "jdbc:mysql://localhost:3306/registeration";
	        String username = "root";
	        String password = "";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(url, username, password);

	            String query = "INSERT INTO registerationforms (name, phone, age,email) VALUES (?, ?, ?,?)";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                preparedStatement.setString(1, name);
	                preparedStatement.setString(2, phone);
	                preparedStatement.setInt(3, age);
	                preparedStatement.setString(4, email);
	                preparedStatement.executeUpdate();
	            }

	            connection.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


