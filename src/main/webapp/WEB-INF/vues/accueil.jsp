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
</body>
</html>