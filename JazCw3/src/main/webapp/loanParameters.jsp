<%@ page import="java.util.Random" %>

<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoanParameters</title>
</head>
<body>
<%!
    Random generator = new Random();
%>

<%
    String number = "" + generator.nextInt();
%>
<jsp:useBean id="loan" class="domain.LoanApplication" scope="session"/>
<jsp:setProperty property="number" name="loan" value="<%=number %>"/>
<jsp:setProperty property="date" name="loan" value="<%= new Date() %>"/>

wygenerowany numer wniosku: <%=loan.getNumber() %>
</br>
Data wygenerowania: <%=loan.getDate() %>
</br>

<form action="person.jsp">
    <label>Wnioskowana kwota <input type="number" id="amount" name="amount"/></label><br/>
    <label>Ilosc rat: <input type="number" id="installmentCount" name="installmentCount"/></label><br/>

    <input type="submit" value="nastepny krok"/>

</form>


</body>
</html>
