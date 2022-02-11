<div class="fixed-bar">
					<!-- Elastislide Carousel -->
<ul id="carousel" class="elastislide-list">
<c:if test="${! empty films}">
	<c:forEach var="film" items="${films}">
		<li><a href="${film.titre}"><img src="${film.image}" alt="${film.titre}"></a></li>
	</c:forEach>
</c:if>
</ul>

</div>
