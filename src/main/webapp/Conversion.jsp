<%@page import="Service.ConversionProxy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% double mt1=0; double mt2=0; double reslt1=0; double reslt2=0;
    if ((request.getParameter("montant1")!=null) && (request.getParameter("montant2")!=null)) {
    mt1= Double.parseDouble(request.getParameter("montant1"));
    mt2= Double.parseDouble(request.getParameter("montant2"));
    ConversionProxy stub= new ConversionProxy();
    reslt1=stub.conversionDollarToDinar(mt1);
    reslt2=stub.conversionEuroToDinar(mt2);
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conversion</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
<div class="div1">
<form action="Conversion.jsp" method="post">
 <table>
 <tr> 
 <td>Montant Dollar To Dinar:</td>
 <td><input type="text" name="montant1" value="<%=mt1%>"/></td>
 </tr>
 <tr>
 <td>Montant Euro To Dinar:</td>
 <td><input type="text" name="montant2" value="<%=mt2%>"/></td>

 </tr>

 </table>
 <button type="submit" class="btn" >Calculer</button>
</form>
</div>

<div class="div2">
<p><%=mt1 %> en Dollar = <%=reslt1 %> en Dinar</p>

<p><%=mt2 %> en Euro = <%=reslt2 %> en Dinar</p>
</div>
</div>
</body>
</html>
