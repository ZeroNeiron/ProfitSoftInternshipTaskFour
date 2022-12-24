package controller;

import repository.UserRepository;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {


    String login = req.getParameter("login");
    String password = req.getParameter("password");

    User person = null;
    for (User user : UserRepository.getUsers()) {
      if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
        HttpSession session = req.getSession();
        session.setAttribute("currentUser", user);
        person = user;
        req.setAttribute("name", user.getName());
      }
    }
    if (person == null) {
      req.setAttribute("invalid", true);
      getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
    else resp.sendRedirect(req.getContextPath() + "/hello");
  }
}
