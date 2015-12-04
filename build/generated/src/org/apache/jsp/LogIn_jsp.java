package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogIn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Email log in</title>\n");
      out.write("        <img src=\"http://project-nerd.com/wp-content/uploads/2013/08/Banner-Tech.jpg\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        <h1>Log In</h1>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"stylesheet.css\"/><!-- CSS -->\n");
      out.write("        ");
      out.write(' ');
      out.write(' ');
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <p><i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</i></p>\n");
      out.write("        \n");
      out.write("        <form action=\"SqlGatewayServlet3\" method=\"post\"> ");
      out.write("\n");
      out.write("            <table cellspacing=\"5\" border =\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td alling=\"right\">Email:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"firstName\"\n");
      out.write("                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.emailAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td alling=\"right\">Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"lastName\"\n");
      out.write("                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input id=\"tweet2\" type=\"submit\" value=\"Log in\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table><br><br><br><br><br><br><br><br><br>\n");
      out.write("        </form>\n");
      out.write("                <p> New users register here</p>\n");
      out.write("                <form action=\"join_email_list.jsp\" method=\"post\">\n");
      out.write("                <input id=\"tweet2\" type=\"submit\" value =\"Register\">\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
