<%@ include file="header.jsp" %>
<body>
<c:choose>
<c:when test="${empty sessionScope.userid}">
<%@ include file="menu.jsp" %>

</c:when>
<c:otherwise>
<%@ include file="menuUser.jsp" %>
</c:otherwise>
</c:choose>

<main role="main">

<%@ include file="carousel.jsp" %>

<%@ include file="body.jsp" %>

<div class="container bordered">

</div>
<%@ include file="formconnexion.jsp" %>
<%@ include file="forminscription.jsp" %>

</main>


<%@ include file="footer_accueil.jsp" %>
</body>
</html>