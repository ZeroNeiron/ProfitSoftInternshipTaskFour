package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

@WebFilter(urlPatterns = {"/hello", "/users"})
public class UnknownUserFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) {
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain)
      throws IOException, ServletException {

    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;

    HttpSession session = request.getSession();

    User user = (User) session.getAttribute("currentUser");

    if (user != null) {
      filterChain.doFilter(servletRequest, servletResponse);
    } else {
      request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

  }

  @Override
  public void destroy() {
  }
}

