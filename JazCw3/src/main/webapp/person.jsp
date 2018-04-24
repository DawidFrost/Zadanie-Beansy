<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Person</title>
</head>
<body>
<jsp:useBean id="parameters" class="domain.LoanParameters" scope="session"/>
<jsp:useBean id="loan" class="domain.LoanApplication" scope="session"></jsp:useBean>

<jsp:setProperty property="*" name="parameters"/>


Numer wniosku: ${loan.number}</br>
Wnioskowana kwota:${parameters.amount}

<form action="address.jsp">
    <label>Imię: <input type="text" id="firstName" name="firstName"/></label>
    <label>Nazwisko: <input type="text" id="surname" name="surname"/></label
    <label>Nr pesel: <input type="text" id="pesel" name="pesel"/></label>
    <input type="submit" value="następny krok">
</form>
</body>
</html>