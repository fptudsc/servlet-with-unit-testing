package com.swut.servlets;

import com.swut.models.UserModel;
import com.swut.repositories.UserRepository;
import com.swut.services.UserService;
import com.swut.utils.Constants;
import com.swut.utils.DatabaseConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "logoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {

    /**
     * Handle logout logic.
     * @param request the request
     * @param response the response
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.setAttribute(Constants.CURRENT_USER_ATTRIBUTE_KEY, null);
        response.sendRedirect("/login");
    }

    /**
     * destroy.
     */
    public void destroy() {
    }
}
