<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>
<a href="jsp/insert.jsp">插入</a>
<a href="jsp/query.jsp">查询</a>
   <table border="1" width="80%">
     <tr>
        <td>商品ID</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品图片</td>
        <td>商品详情</td>
        <td>生产日期</td>
        <td>修改商品</td> 
         <td>删除商品</td>         
     </tr>
   <c:forEach items="${items_list}" var="it">  
      <tr>
        <td>${it.id }</td>
        <td>${it.name }</td>
        <td>${it.price }</td>
        <td><img src="${it.pic }"></td>
        <td>${it.detail }</td>
        <td>
        <fmt:formatDate value="${it.createtime}" 
           pattern="yyyyMMdd HH:mm:ss"
        />       
        </td>    
        <td><a href="find_itemById.action?id=${it.id}">修改</a></td> 
        <td><a href="delete_items.action?id=${it.id}">删除</a></td>    
     </tr>
   </c:forEach>
   </table>
</body>
</html>