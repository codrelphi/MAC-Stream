<div class="album py-5">
	<div class="container">
		<div class="row">
			<div class="col col-md-auto">
				<div class="list-group">
					<div class="list-group-item active">Tous les genres</div>
					<c:forEach var="genre" items="${genres}">
						<a href="#" class="list-group-item list-group-item-action">${genre.genre}</a>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</div>