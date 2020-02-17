<%--
  Created by IntelliJ IDEA.
  User: xinchenh
  Date: 2/17/20
  Time: 12:35 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Display</title>
    </head>
    <body>
        Result is : <%=request.getAttribute("result")%><br><br>

        Result is (in EL): ${result}

    </body>
</html>
