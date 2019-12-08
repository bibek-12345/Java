//program10a.html
<!DOCTYPE html> 
<html> 
 <head> 
  <title>Program 10a</title> 
 </head> 
 <body bgcolor=lightblue> 

  <form method="post"   action="http://localhost:8004/servlet9b/program10a.jsp">   
   <p>
    <center> 
       <br>  
         <br>   
          <h1>Verfication of a particular User Login</h1>   
          <br> 
        <br> Username:<input type=text name="uname" size=10><br>  
             Password:<input type=password name="pwd" size=10><br>  
         <br> <input type=submit value=submit> 
      </center>  
    </p>
       </form>
  </body>
 
//program10a.jsp	
</html> 
<%!String username=null,password=null;%>
 <%  
 username=request.getParameter("uname");   
 password=request.getParameter("pwd"); 
 %>
  <%  
  if(username.equals("john")&& password.equals("testpass"))   
	  response.sendRedirect("welcome.jsp"); 
  else    
	  out.println("<center><h4>Invalid username or password</h2></center>");  
%> 
	
//welcome.jsp
 <html>
 <head>
  <title>Welcome Page</title>
   </head>
    <body bgcolor=yellow> 
     <% 
     out.println("<center><h4>Welcome user<br>");  
     out.println("You are now logged in!</h4></center>");  
     %> 
     </body>
      </html> 
