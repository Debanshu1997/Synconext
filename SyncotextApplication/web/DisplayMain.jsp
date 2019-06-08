

<%@page import="com.connection.JDBC_Connection"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.connection.JDBC_Connection.*"%>

<html>
    
    
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
        <script src="//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
   <script type="text/javascript">
      $(document).ready( function () {
         $('#ISP').DataTable();
      } );
   </script>
 
        
    </head>
    <body>
        <div id="header" class="container" >
		  <div class="page-header">
		  <h1 class="font-weight-bold" ><img src="images/synconext.png" style="height:50px; width:100px; margin-left:270px"/> Syncotext Assignment</h1> 
		  </div>
        </div>
        
        
        <%!
            String[] name, price, rating,speed,desc,contact,email,image,url;

        
        %>
        
        <% 
        
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
        
        
        %>
        
        
        
         <div class=container>
         <table class="table table-striped" id="ISP">
            <thead>
               <tr>
                   <th>IMAGE</th>
                  <th>ISP</th>
                  <th>LOWEST_PRICE</th>
                  <th>RATING</th>
                  <th>MAX_SPEED</th>
                  <th>DESCRIPTION</th>
                  <th>CONTACT_NO</th>
                  <th>EMAIL</th>
                  
                  <th>URL</th>
               </tr>
            </thead>
            
            <tbody>
                
                <% for(int i=0;i<name.length;i++){%>
                <tr>
                    <td><img src="<%= image[i]%>" alt="" border=3 height=20 width=20></td>
                    <td><%= name[i]%></td>
                    <td><%= price[i]%></td>
                    <td><%= rating[i]%></td>
                    <td><%= speed[i]%></td>
                    <td><%= desc[i]%></td>
                    <td><%= contact[i]%></td>
                    <td><%= email[i]%></td>
                    
                    <td><%= url[i]%></td>
                    
                </tr>
                
                <% }%>
                
                
                
            </tbody>
        
         </table>
         </div>
        
        
        
    </body>
</html>
