package filters;

import domain.Person;

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


@WebFilter("/person.jsp")
public class PersonFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {


    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();


        if (httpRequest.getParameter("amount").equals(null) || (httpRequest.getParameter("amount").equals(""))) {
            httpResponse.sendRedirect("/");
            return;
        }

        if (httpRequest.getParameter("installmentCount").equals(null) || (httpRequest.getParameter("installmentCount").equals(""))) {
            httpResponse.sendRedirect("/");
            return;
        }

        chain.doFilter(request, response);
    }
    public void destroy() {

    }
}
