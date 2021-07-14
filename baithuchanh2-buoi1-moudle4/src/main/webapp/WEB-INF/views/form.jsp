<%--
  Created by IntelliJ IDEA.
  User: Windboy
  Date: 14/07/2021
  Time: 3:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/translate" method="post">
    <table style="border: 1px">
        <tr>
            <td>English</td>
            <td>  </td>
            <td>Vietnamese</td>
        </tr>
        <tr>
            <td>
                <input type="text" name ="word" value="${search}" placeholder="enter your word" >
            </td>
            <td><button type="submit">Translate</button></td>
            <td> ${result}</td>


        </tr>


    </table>
</form>
</body>
</html>
