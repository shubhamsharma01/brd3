/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-08-03 10:26:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" media=\"screen\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("        window.history.forward();\r\n");
      out.write("        function noBack()\r\n");
      out.write("        {\r\n");
      out.write("            window.history.forward();\r\n");
      out.write("        }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("<center><h1>Welcome to the Login Page</h1></center>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div id=\"login\">\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("<table align=\"center\" border=\"3\" cellpadding=\"2\">\r\n");
      out.write("<form action=\"j_spring_security_check\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("  <p><span class=\"fontawesome-user\"></span>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Enter the UserName : </td><td><input type=\"text\" name=\"j_username\" ></td></tr>       \r\n");
      out.write("\r\n");
      out.write("<tr><td>Enter the Password : </td><td><input type=\"password\" name=\"j_password\" ></td></tr> \r\n");
      out.write("\r\n");
      out.write("<tr><td><input type=\"checkbox\" name=\"remember\"?></td><td>RememberMe</td></tr>\r\n");
      out.write(" \r\n");
      out.write("<tr><td></td><td><input type=\"submit\" value=\"login\"></td></tr>\r\n");
      out.write("\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
