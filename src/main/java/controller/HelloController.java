package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

@WebServlet(urlPatterns = "/hello")
public class HelloController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req,
      HttpServletResponse resp) throws IOException, ServletException {
    HttpSession session = req.getSession();
    User user = (User) session.getAttribute("currentUser");
    req.setAttribute("name", user.getName());
    getServletContext().getRequestDispatcher("/hello.jsp").forward(req, resp);
  }
}
