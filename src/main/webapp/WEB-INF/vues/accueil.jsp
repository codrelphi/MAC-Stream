<%@ include file="header.jsp" %>
<body>
<!-- Affichage du menu -->
<c:choose>
<c:when test="${empty sessionScope.userid}">
<%@ include file="menu.jsp" %>
</c:when>
<c:otherwise>
<%@ include file="menuUser.jsp" %>
</c:otherwise>
</c:choose>
<%@ include file="carousel.jsp" %>
<<<<<<< HEAD
<!-- Affichage de la partie principale  -->
<main>
<div class="row justify-content-start">
	<div class="col col-lg-2">
	<!-- Inclure ici la liste des genres -->
	</div>		
	<div class="col col-lg-10">
		<%@ include file="body.jsp" %>
	</div>
</div>
</div>
</main>		
	<%@ include file="footer_accueil.jsp" %>
=======
<<<<<<< HEAD
<%@ include file="body.jsp" %>

<div class="container bordered">
</div>
<%@ include file="formconnexion.jsp" %>
<%@ include file="forminscription.jsp" %>
=======

<%@ include file="body.jsp" %>

<div class="container bordered">

</div>
<%@ include file="formconnexion.jsp" %>
<%@ include file="forminscription.jsp" %>

>>>>>>> c8fd7125c6bbca8eb2492947d646a554edfc847b
</main>


<%@ include file="footer_accueil.jsp" %>
>>>>>>> d142fa9b30eab6cce7db2476a0ba6d3653bba3ac
</body>
</html>