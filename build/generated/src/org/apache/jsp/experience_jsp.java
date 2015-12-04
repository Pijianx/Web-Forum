package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class experience_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"stylesheet.css\"/><!-- CSS -->\n");
      out.write("        <img src=\"http://project-nerd.com/wp-content/uploads/2013/08/Banner-Tech.jpg\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        <h1 id=\"center\">Survey</h1>\n");
      out.write("        ");
      out.write("<br><br><br>\n");
      out.write("        \n");
      out.write("        <p><i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</i></p>\n");
      out.write("        <div id=\"pad\">\n");
      out.write("        <form action=\"SatisfyServlet\" method=\"post\"> ");
      out.write("\n");
      out.write("            <table cellspacing=\"5\" border =\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td alling=\"right\">Rate your experience on a scale of 1-10</td>\n");
      out.write("                    <td><input type=\"text\" name=\"Exp\"\n");
      out.write("                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.Exp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td alling=\"right\">How do you like the content of the site on a scale of 1-10</td>\n");
      out.write("                    <td><input type=\"text\" name=\"Content\"\n");
      out.write("                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.Content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td alling=\"right\">What is your age?</td>\n");
      out.write("                    <td><input type=\"text\" name=\"Age\"\n");
      out.write("                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.Age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td alling=\"right\">What would you like to see on our site?</td>\n");
      out.write("                    <td><input type=\"text\" name=\"LikeToSee\"\n");
      out.write("                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.LikeToSee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td alling=\"right\">What is your email address?</td>\n");
      out.write("                    <td><input type=\"text\" name=\"EmailAddress\"\n");
      out.write("                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.EmailAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </td> <br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td id=\"center\"><br><br><br><input id=\"tweet\" type=\"submit\" value=\"Submit\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
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
