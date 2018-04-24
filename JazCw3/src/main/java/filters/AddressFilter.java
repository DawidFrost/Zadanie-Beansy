package filters;

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
import java.io.IOException;

@WebFilter("/address.jsp")
public class AddressFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();

        if (request.getParameter("firstName").equals(null) || "".equals(request.getParameter("firstName"))) {
            response.sendRedirect("/");
            return;
        }
        if (request.getParameter("pesel").equals(null) || "".equals(request.getParameter("pesel"))) {
            response.sendRedirect("/");
            return;
        }

        if (request.getParameter("surname").equals(null) || "".equals(request.getParameter("surname"))) {
            response.sendRedirect("/");
            return;
        }

        chain.doFilter(req, resp);
    }

    public void destroy() {

    }
}
