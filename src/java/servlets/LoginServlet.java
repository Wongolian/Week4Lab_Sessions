/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;

/**
 *
 * @author Steven
 */
public class LoginServlet extends HttpServlet {

    AccountService as = new AccountService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String username = (String) session.getAttribute("username");

        getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("") || password.equals("")) {
            request.setAttribute("required", "All fields are required, please try again!");

            getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
            return;
        }

        if (as.login(username, password) == null) {
            request.setAttribute("invalid", "Invalid Login, please try again.");
            getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
            return;
        }
        session.setAttribute("username", username);

        getServletContext().getRequestDispatcher("/WEB-INF/Home.jsp").forward(request, response);
    }

}
