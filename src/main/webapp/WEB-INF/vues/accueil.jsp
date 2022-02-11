<%@ include file="header.jsp" %>
<body>
<c:choose>
<c:when test="${empty sessionScope.userid}">
<%@ include file="menu.jsp" %>
<<<<<<< HEAD
</c:when>
<c:otherwise>
<%@ include file="menuUser.jsp" %>
</c:otherwise>
</c:choose>
<main>
=======
<main role="main">
>>>>>>> ebbd9620fb2b1f787ef5827d29e6f175461544a5
<%@ include file="carousel.jsp" %>
<<<<<<< HEAD
<%@ include file="body.jsp" %>

=======
<div class="container bordered">

</div>
<%@ include file="formconnexion.jsp" %>
<%@ include file="forminscription.jsp" %>
>>>>>>> b303b7a37d38d8b554a92723ddbd24a0de941e60
</main>


<%@ include file="footer_accueil.jsp" %>
</body>
</html>