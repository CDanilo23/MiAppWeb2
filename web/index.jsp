<%-- 
    Document   : index
    Created on : 13/11/2015, 07:44:31 PM
    Author     : Administrador
--%>

<%@page import="co.com.uniminuto.MiNegocioWS"%>
<%@page import="co.com.uniminuto.library.MiNegocioWS_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
        MiNegocioWS_Service servicio = new MiNegocioWS_Service();
        MiNegocioWS miNegocioWS; 
        miNegocioWS = servicio.getMiNegocioWSPort();
        System.out.println( miNegocioWS.calculaDescuento(35000, 500));
       %>
    </body>
</html>
