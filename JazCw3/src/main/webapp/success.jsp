<%@ page import="domain.LoanApplication" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Success</title>
</head>
<body>
<jsp:useBean id="loanService" class="service.LoanService" scope="application"/>
<jsp:useBean id="loan" class="domain.LoanApplication" scope="session"/>
<jsp:useBean id="parameters" class="domain.LoanParameters" scope="session"/>
<jsp:useBean id="person" class="domain.Person" scope="session"/>
<jsp:useBean id="address" class="domain.Address" scope="session"/>


<jsp:setProperty name="person" property="*"/>
<jsp:setProperty property="*" name="address"/>

<%
    loan.setAddress(address);
    loan.setParameters(parameters);
    loan.setPerson(person);
    loanService.add(loan);
%>
<ul>
    <%
        for (LoanApplication loanApplication : loanService.getAll()) {
    %>

    <li>Wniosek:<%=loanApplication.getNumber()
            + " Osoba: " + loanApplication.getPerson().getSurname()
            + " Kwota: " + loanApplication.getParameters().getAmount()
            + " Miasto: " + loanApplication.getAddress().getCity()
            + " Kod pocztowy: " + loanApplication.getAddress().getZipCode()
            + " ul." + loanApplication.getAddress().getStreet()
            + " numer budynku: " + loanApplication.getAddress().getHouseNumber()
            + " numer mieszkania" + loanApplication.getAddress().getLocalNumber()

    %>
    </li>
    <%
        }
    %>
</ul>

</body>
</html>