<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<body>
  <h>商品修改页面</h>
  <form action="update_items.action" method="post">
   商品ID:<input type="text" name="id" value="${items.id }" readonly="true"><br>
    商品名称:<input type="text" name="name" value="${items.name }"><br>
     商品价格:<input type="text" name="price" value="${items.price }"><br>
      商品图片:<input type="text" name="pic" value="${items.pic }"><br>
       商品详情:<input type="text" name="detail" value="${items.detail }"><br>
        商品时间:<input type="text" name="createtime" 
   value="
   <fmt:formatDate  value="${items.createtime }" pattern="yyyy/MM/dd"/>   
   "><br>
  <input type="reset" value="重置">
  <input type="submit" value="修改">
  
  </form>
</body>
</html>