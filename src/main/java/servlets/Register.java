package servlets;

import beans.User;
import model.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "register", urlPatterns = "/register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User(
                request.getParameter("email"),
                request.getParameter("pass"),
                request.getParameter("FName"),
                request.getParameter("LName"),
                request.getParameter("PhoneNumber"),
                request.getParameter("ShippingAddress")
        );

        if (UserDAO.register(user)) {
            System.out.println("REGISTER SUCCESS");
            log("REGISTER SUCCESS");
            //response.sendRedirect("welcome.jsp");
            request.setAttribute("successMessage", "Registration successful. You can sign in now.");
            /* forward request to login servlet to handle the login process. */
//            response.sendRedirect("home.jsp");
            request.getRequestDispatcher("/login").forward(request,response);
        } else {
            System.out.println("REGISTER FAILURE");
            log("REGISTER FAILURE");
            response.sendRedirect("register.jsp");
            request.setAttribute("errorMessage", "ERROR!, in register. ");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
