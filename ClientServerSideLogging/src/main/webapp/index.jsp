<%-- 
    Document   : index.jsp
    Created on : 7-Jun-2021, 1:51:40 AM
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
        <h1>Employee List</h1>
        <body>   
            <jsp:include page="MyDisplayAllServlet" /> 
            <table>
                <tr><td><h2> <a href='search.jsp'>search</a> <h2></td>
                                <td><h2>Or</h2></td>           
                    <td><h2> <a href='delete.jsp'>delete</a><h2> </td>
                </tr>    
            </table>  
        
                
           

    </body>
</html>
