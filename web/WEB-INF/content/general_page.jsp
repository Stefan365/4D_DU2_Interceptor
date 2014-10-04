<%-- 
    Document   : general_page
    Created on : 27-Sep-2014, 18:18:56
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="windows-1250"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Přihlaš se Karle!</h1>
        <s:form action="myLogin" method="post">
            <s:textfield label="login: " name="login" value="Karel"/>
            <s:textfield label="heslo: " name="passwd" type = "password" value="test"/>
            <s:submit name="submit" value="Odeslat"/>
        </s:form>

    </body>
</html>
