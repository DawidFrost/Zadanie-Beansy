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

@WebFilter("/success.jsp")
public class SuccessFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();


        if (request.getParameter("city").equals(null) || "".equals(request.getParameter("city"))) {
            response.sendRedirect("/");
            return;
        }
        if (request.getParameter("zipCode").equals(null) || "".equals(request.getParameter("zipCode"))) {
            response.sendRedirect("/");
            return;
        }
        if (request.getParameter("houseNumber").equals(null) || "".equals(request.getParameter("houseNumber"))) {
            response.sendRedirect("/");
            return;
        }
        if (request.getParameter("localNumber").equals(null) || "".equals(request.getParameter("localNumber"))) {
            response.sendRedirect("/");
            return;
        }
        if (request.getParameter("phoneNumber").equals(null) || "".equals(request.getParameter("phoneNumber"))) {
            response.sendRedirect("/");
            return;
        }

        if (request.getParameter("street").equals(null) || "".equals(request.getParameter("street"))) {
            response.sendRedirect("/");
            return;
        }
        chain.doFilter(req, resp);
    }

    public void destroy() {

    }
}
