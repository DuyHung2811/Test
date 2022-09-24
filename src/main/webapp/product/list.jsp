<%--
  Created by IntelliJ IDEA.
  User: hung
  Date: 9/22/2022
  Time: 8:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="i" begin="0" end="${listcategory.size()-1}">
    <div>
        <a href="/Product?category=${listcategory.get(i).id}">${listcategory.get(i).name}</a>
    </div>
</c:forEach>
<c:forEach var="i" begin="0" end="${listproduct.size()-1}">
    <h2>${listproduct.get(i).id}, ${listproduct.get(i).name}, ${listproduct.get(i).price}, ${listcategory.get(i).name}</h2>
</c:forEach>
// duy hung sửa lần 2
</body>
</html>
