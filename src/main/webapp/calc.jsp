<%--
  Created by IntelliJ IDEA.
  User: vovaz
  Date: 09.12.2024
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1><b>Калькулятор</b></h1>
<form action="${pageContext.request.contextPath}/calc" method="post">
    <p> <input type="text" name="num1"></p>
    <p> <input type="text" name="num2"></p>
    <p> <input type="radio" name="operation" value="SUM">Сложить<Br>
        <input type="radio" name="operation" value="SUB">Вычесть<Br>
        <input type="radio" name="operation" value="MUL">Умножить<Br>
        <input type="radio" name="operation" value="DIV">Разделить</p>
    <p><input type="submit"></p>
</form>
<p><b>${message}</b></p>
</body>
</html>
