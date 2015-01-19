package cnblog.test3;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by guoyibin on 15/1/19.
 */
public class TestFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }
    public void destroy() { }

    public void init(FilterConfig filterConfig) throws ServletException { }
}
