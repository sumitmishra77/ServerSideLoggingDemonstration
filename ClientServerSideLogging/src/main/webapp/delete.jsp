<%-- 
    Document   : delete
    Created on : 7-Jun-2021, 6:34:10 AM
    Author     : mishr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <form action="MyDeleteServlet">
                <br><br> Input Id :   <input type="text" name="id" >
                <input type="Submit" value="Delete">
            </form>
        <br><br>
         <a href='index.jsp'>go home</a> 
    </body>
</html>
