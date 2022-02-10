<div class="fixed-bar">
					<!-- Elastislide Carousel -->
<ul id="carousel" class="elastislide-list">
<c:if test="${! empty films}">
	<c:forEach var="film" items="${films}">
		<li><a href="${pageContext.request.contextPath}/film/${film.idFilm}"><img src="https://image.tmdb.org/t/p/w200/${film.imagePath}" alt="${film.titre}"></a></li>
	</c:forEach>
</c:if>
</ul>
</div>
