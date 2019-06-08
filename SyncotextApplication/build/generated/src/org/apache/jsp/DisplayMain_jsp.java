package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.JDBC_Connection;
import com.connection.JDBC_Connection.*;

public final class DisplayMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String[] name, price, rating,speed,desc,contact,email,image,url;

        
        
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css\">\n");
      out.write("        <script src=\"//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\"></script>\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("      $(document).ready( function () {\n");
      out.write("         $('#ISP').DataTable();\n");
      out.write("      } );\n");
      out.write("   </script>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\" class=\"container\" >\n");
      out.write("\t\t  <div class=\"page-header\">\n");
      out.write("\t\t  <h1 class=\"font-weight-bold\" ><img src=\"images/synconext.png\" style=\"height:50px; width:100px; margin-left:270px\"/> Syncotext Assignment</h1> \n");
      out.write("\t\t  </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
        
        JDBC_Connection JDBC = new JDBC_Connection();
        JDBC.getConnection();
        name=JDBC.getValues(1);
        price=JDBC.getValues(2);
        rating=JDBC.getValues(3);
        speed=JDBC.getValues(4);
        desc=JDBC.getValues(5);
        contact=JDBC.getValues(6);
        email=JDBC.getValues(7);
        image=JDBC.getValues(8);
        url=JDBC.getValues(9);
        
        JDBC.closeConnection();
        
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <div class=container>\n");
      out.write("         <table class=\"table table-striped\" id=\"ISP\">\n");
      out.write("            <thead>\n");
      out.write("               <tr>\n");
      out.write("                   <th>IMAGE</th>\n");
      out.write("                  <th>ISP</th>\n");
      out.write("                  <th>LOWEST_PRICE</th>\n");
      out.write("                  <th>RATING</th>\n");
      out.write("                  <th>MAX_SPEED</th>\n");
      out.write("                  <th>DESCRIPTION</th>\n");
      out.write("                  <th>CONTACT_NO</th>\n");
      out.write("                  <th>EMAIL</th>\n");
      out.write("                  \n");
      out.write("                  <th>URL</th>\n");
      out.write("               </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("                ");
 for(int i=0;i<name.length;i++){
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><img src=\"");
      out.print( image[i]);
      out.write("\" alt=\"\" border=3 height=20 width=20></td>\n");
      out.write("                    <td>");
      out.print( name[i]);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( price[i]);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rating[i]);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( speed[i]);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( desc[i]);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( contact[i]);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( email[i]);
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                    <td>");
      out.print( url[i]);
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        \n");
      out.write("         </table>\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
