<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adress</title>
</head>
<body>
<jsp:useBean id="parameters" class="domain.LoanParameters" scope="session"/>
<jsp:useBean id="person" class="domain.Person" scope="session"/>


<jsp:setProperty property="*" name="person"/>

Numer wniosku: ${loan.number}</br>
Wnioskowana kwota:${parameters.amount}

<form action="success.jsp">
    <label>Miasto:<input type="text" id="city" name="city"/></label></br>
    <label>Kod pocztowy:<input type="text" id="zipCode" name="zipCode"/></label></br>
    <label>Ulica:<input type="text" id="street" name="street"/></label></br>
    <label>Numer domu:<input type="text" id="houseNumber" name="houseNumber"/></label></br>
    <label>Numer mieszkania:<input type="text" id="localNumber" name="localNumber"/></label></br>
    <label>Numer telefonu:<input type="text" id="phoneNumber" name="phoneNumber"/></label></br>

    <input type="submit" value="nastepny krok"/>

</form>


</body>
</html>