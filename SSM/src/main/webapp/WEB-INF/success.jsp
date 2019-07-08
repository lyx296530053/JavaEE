<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>12323232</h3>
<%
    String show8 = (String) request.getAttribute("show8");
    out.println(show8);
    List list=new ArrayList();
    Collections.addAll(list,12,32,11,34,88,90);
    request.setAttribute("list",list);
%>
<%--${show8}--%>
<%--${pageContext.request.getAttribute("show8")}--%>
<%--<c:if test="${not empty requestScope.show8}">--%>
    <%--<h3>hahaha</h3>--%>
    <%--${show8}--%>
<%--</c:if>--%>
<%--<c:forEach begin="1" end="10" var="i" step="1" varStatus="tt">--%>
    <%--${pageContext.out.print(i)}--%>
<%--</c:forEach>--%>
<c:forEach varStatus="s" items="${list}" var="i">
    ${s.count}${s.index} ${i}${pageContext.out.println()}
</c:forEach>

</body>
</html>
